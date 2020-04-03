package com.dongtu.pojo;

import java.io.Serializable;

/**
 * 小导航表
 */
public class TbNavbar implements Serializable {
    private Long nid;

    private String nname;

    public Long getNid() {
        return nid;
    }

    public void setNid(Long nid) {
        this.nid = nid;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname == null ? null : nname.trim();
    }
}