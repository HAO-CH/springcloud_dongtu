package com.dongtu.service.impl;

import com.dongtu.dao.EsDao;
import com.dongtu.pojo.EsPojo;
import com.dongtu.service.EsService;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.SearchResultMapper;
import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
import org.springframework.data.elasticsearch.core.aggregation.impl.AggregatedPageImpl;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service.impl
 * @ClassName: EsServiceimpl
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/1 19:07
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/1 19:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class EsServiceimpl implements EsService {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    private EsDao esDao;

    @Override
    public void save(EsPojo esPojo) {
        esDao.save(esPojo);
    }

    @Override
    public List<EsPojo> findByEs(String str, Integer page, Integer size) {
        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        QueryBuilder queryBuilder = QueryBuilders.multiMatchQuery(str,"tpTitle","tpAreaName");
        List<String> highlightFields = new ArrayList<String>();
        highlightFields.add("tpTitle");
        highlightFields.add("tpAreaName");
        HighlightBuilder.Field[] fields = new HighlightBuilder.Field[highlightFields.size()];
        for (int x = 0; x < highlightFields.size(); x++) {
            fields[x] = new HighlightBuilder.Field(highlightFields.get(x)).preTags("<span style=\"color:red\">")
                    .postTags("</span>");
        }
        // 高亮
        nativeSearchQueryBuilder.withHighlightFields(fields);
        // 查询
        nativeSearchQueryBuilder.withQuery(queryBuilder);
        // 分页
        nativeSearchQueryBuilder.withPageable(PageRequest.of(page,size));

        AggregatedPage<EsPojo> GoodsAndDescEss = elasticsearchTemplate.queryForPage(nativeSearchQueryBuilder.build(), EsPojo.class, new SearchResultMapper() {
            @Override
            public <T> AggregatedPage<T> mapResults(SearchResponse searchResponse, Class<T> aClass, Pageable pageable) {
                List<EsPojo> result = new ArrayList<>();

                SearchHits hits = searchResponse.getHits();
                for (SearchHit searchHit : hits) {
                    if (hits.getHits().length <= 0) {
                        return null;
                    }
                    EsPojo esPojo = new EsPojo();
                    // id
                    esPojo.setTpId(Long.parseLong(searchHit.getId()));
                    esPojo.setMinPrice(new BigDecimal((Double) searchHit.getSourceAsMap().get("minPrice")));
                    esPojo.setTpImg((String)searchHit.getSourceAsMap().get("tpImg"));

                    HighlightField field = searchHit.getHighlightFields().get("tpTitle");
                    if (field != null) {
                        esPojo.setTpTitle(field.fragments()[0].toString());
                    } else {
                        //没有高亮的name
                        esPojo.setTpTitle((String)searchHit.getSourceAsMap().get("tpTitle"));
                    }

                    result.add(esPojo);
                }
                if (result.size() > 0) {
                    return new AggregatedPageImpl<>((List<T>) result);
                }
                return null;
            }
            @Override
            public <T> T mapSearchHit(SearchHit searchHit, Class<T> aClass) {
                return null;
            }
        });
        return GoodsAndDescEss.toList();
    }
}

