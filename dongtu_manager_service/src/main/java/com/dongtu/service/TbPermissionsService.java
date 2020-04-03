package com.dongtu.service;

import java.util.List;
import java.util.Map;

public interface TbPermissionsService {
    List<Map<String, Object>> findPermissions(Long permissionsPid);
}
