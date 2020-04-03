package com.dongtu.pojo;

import java.io.Serializable;

public class TbAdveField implements Serializable {
    private Long fieldId;

    private String fieldName;

    public Long getFieldId() {
        return fieldId;
    }

    public void setFieldId(Long fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }
}