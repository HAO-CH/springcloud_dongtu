package com.dongtu.service.impl;

import com.dongtu.mapper.TbNavbarMapper;
import com.dongtu.pojo.TbNavbar;
import com.dongtu.pojo.TbNavbarExample;
import com.dongtu.service.NavbarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: HAO
 * @Date: 2019-12-28 09:41
 * @Desc:
 */
@Service
public class NavbarServiceImpl implements NavbarService {

    @Resource
    private TbNavbarMapper navbarMapper;

    @Override
    public List<TbNavbar> findNavbar() {
        return navbarMapper.selectByExample(new TbNavbarExample());
    }
}
