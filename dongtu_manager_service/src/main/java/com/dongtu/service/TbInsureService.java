package com.dongtu.service;

import com.dongtu.pojo.TbInsure;

import java.util.List;

public interface TbInsureService {
    List<TbInsure> findInsureAll();

    void saveContentInfo(TbInsure tbInsure);

    TbInsure toUpdateInsureById(Integer id);

    void updateInsureInfo(TbInsure tbInsure);

    void deleteInsureInfo(Integer id);
}
