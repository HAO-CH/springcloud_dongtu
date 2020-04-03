package com.dongtu.service.impl;

import com.dongtu.mapper.TbPermissionsMapper;
import com.dongtu.pojo.TbPermissions;
import com.dongtu.pojo.TbPermissionsExample;
import com.dongtu.service.TbPermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TbPermissionsServiceImpl implements TbPermissionsService {
    @Autowired
    private TbPermissionsMapper tbPermissionsMapper;

    @Override
    public List<Map<String, Object>> findPermissions(Long permissionsPid) {
        //查询所有权限
        List<TbPermissions> permissionsList = tbPermissionsMapper.selectByExample(new TbPermissionsExample());
        //对查询的权限进行递归处理
        List<Map<String, Object>> permissionTree = findPermissions(permissionsList, permissionsPid);
        return permissionTree;
    }

    //将数据进行递归，传入的父级id对应查询下级目录
    private List<Map<String, Object>> findPermissions(List<TbPermissions> permissionsList, Long permissionsPid) {
        List<Map<String, Object>> permissionTree = new ArrayList<>();
        for (int i = 0; i < permissionsList.size(); i++) {
            Map<String, Object> map = null;
            TbPermissions permissions = permissionsList.get(i);
            //将数据按照bootstrap的格式进行封装
            if (permissions.getPermissionsPid().equals(permissionsPid)) {
                map = new HashMap<>();
                map.put("id", permissions.getPermissionsId());
                map.put("text", permissions.getPermissionsText());
                map.put("url", permissions.getPermissionsUrl());
                map.put("nodes", findPermissions(permissionsList, permissions.getPermissionsId()));
            }
            //如果没有下一级就把节点去除
            if (map != null) {
                List<Map<String, Object>> nodes = (List<Map<String, Object>>) map.get("nodes");
                if (nodes.size() == 0) {
                    map.remove("nodes");
                }
                permissionTree.add(map);
            }
        }
        return permissionTree;
    }
}
