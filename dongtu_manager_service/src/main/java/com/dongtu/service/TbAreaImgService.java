package com.dongtu.service;

import com.dongtu.pojo.TbAreaImg;

import java.util.List;

public interface TbAreaImgService {
    List<TbAreaImg> findAreaImgAll();

    TbAreaImg findAreaImgById(Long areaId);
}
