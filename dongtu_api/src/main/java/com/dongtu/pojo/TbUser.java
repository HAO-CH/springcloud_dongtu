package com.dongtu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbUser implements Serializable {
    private Long userId;

    private String userName;

    private String userPassword;

    private String userPhone;

    private Date userCreatedTime;

    private Date userUpdatedTime;

    private String userRealName;

    private String userCity;

    private Integer userSex;

    private String userEmail;

    private String userHeadPic;

    private BigDecimal userAccountBalance;

    private BigDecimal userPoints;

    private Integer userLevel;

    private Integer userExperienceValue;

    private Date userBirthday;

    private Date userLastLoginTime;

    private String userSalt;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Date getUserCreatedTime() {
        return userCreatedTime;
    }

    public void setUserCreatedTime(Date userCreatedTime) {
        this.userCreatedTime = userCreatedTime;
    }

    public Date getUserUpdatedTime() {
        return userUpdatedTime;
    }

    public void setUserUpdatedTime(Date userUpdatedTime) {
        this.userUpdatedTime = userUpdatedTime;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserHeadPic() {
        return userHeadPic;
    }

    public void setUserHeadPic(String userHeadPic) {
        this.userHeadPic = userHeadPic == null ? null : userHeadPic.trim();
    }

    public BigDecimal getUserAccountBalance() {
        return userAccountBalance;
    }

    public void setUserAccountBalance(BigDecimal userAccountBalance) {
        this.userAccountBalance = userAccountBalance;
    }

    public BigDecimal getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(BigDecimal userPoints) {
        this.userPoints = userPoints;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getUserExperienceValue() {
        return userExperienceValue;
    }

    public void setUserExperienceValue(Integer userExperienceValue) {
        this.userExperienceValue = userExperienceValue;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Date getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt == null ? null : userSalt.trim();
    }
}