package com.dongtu.pojo;

import java.io.Serializable;

public class TagProducys implements Serializable {
    private Long id;

    private Long tagId;

    private Long tpId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getTpId() {
        return tpId;
    }

    public void setTpId(Long tpId) {
        this.tpId = tpId;
    }
}