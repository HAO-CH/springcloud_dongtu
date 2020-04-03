package com.dongtu.service;

import com.dongtu.pojo.TbArea;

import java.util.List;

public interface AreaService {
    List<TbArea> findArea(Long areaPid);

    TbArea findAreaByAreaPid(Long areaPid);

    TbArea findAreaByAreaId(Long areaId);
}
