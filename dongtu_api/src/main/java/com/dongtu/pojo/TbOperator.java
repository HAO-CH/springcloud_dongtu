package com.dongtu.pojo;

import java.io.Serializable;

/**
 * 运营商登录表
 */
public class TbOperator implements Serializable {
    private Long id;

    private String operName;

    private String operPassword;

    private String operSalt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    public String getOperPassword() {
        return operPassword;
    }

    public void setOperPassword(String operPassword) {
        this.operPassword = operPassword == null ? null : operPassword.trim();
    }

    public String getOperSalt() {
        return operSalt;
    }

    public void setOperSalt(String operSalt) {
        this.operSalt = operSalt == null ? null : operSalt.trim();
    }
}