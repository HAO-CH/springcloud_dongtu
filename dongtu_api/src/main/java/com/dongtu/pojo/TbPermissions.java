package com.dongtu.pojo;

import java.io.Serializable;

/**
 * 权限属性表
 */
public class TbPermissions implements Serializable {
    private Long permissionsId;

    private String permissionsText;

    private String permissionsUrl;

    private Long permissionsPid;

    public Long getPermissionsId() {
        return permissionsId;
    }

    public void setPermissionsId(Long permissionsId) {
        this.permissionsId = permissionsId;
    }

    public String getPermissionsText() {
        return permissionsText;
    }

    public void setPermissionsText(String permissionsText) {
        this.permissionsText = permissionsText == null ? null : permissionsText.trim();
    }

    public String getPermissionsUrl() {
        return permissionsUrl;
    }

    public void setPermissionsUrl(String permissionsUrl) {
        this.permissionsUrl = permissionsUrl == null ? null : permissionsUrl.trim();
    }

    public Long getPermissionsPid() {
        return permissionsPid;
    }

    public void setPermissionsPid(Long permissionsPid) {
        this.permissionsPid = permissionsPid;
    }
}