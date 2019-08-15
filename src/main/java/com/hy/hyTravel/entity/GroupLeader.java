package com.hy.hyTravel.entity;

import java.util.Date;

public class GroupLeader {
    private String leaderId;

    private String userId;

    private String provinceCode;

    private String provinceName;

    private String nickName;

    private String leaderImg;

    private String leaderRecommend;

    private String isValid;

    private Integer checkStatus;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private String certificateNumber;

    private String traveledExp;

    private String shootExp;

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId == null ? null : leaderId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getLeaderImg() {
        return leaderImg;
    }

    public void setLeaderImg(String leaderImg) {
        this.leaderImg = leaderImg == null ? null : leaderImg.trim();
    }

    public String getLeaderRecommend() {
        return leaderRecommend;
    }

    public void setLeaderRecommend(String leaderRecommend) {
        this.leaderRecommend = leaderRecommend == null ? null : leaderRecommend.trim();
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber == null ? null : certificateNumber.trim();
    }

    public String getTraveledExp() {
        return traveledExp;
    }

    public void setTraveledExp(String traveledExp) {
        this.traveledExp = traveledExp == null ? null : traveledExp.trim();
    }

    public String getShootExp() {
        return shootExp;
    }

    public void setShootExp(String shootExp) {
        this.shootExp = shootExp == null ? null : shootExp.trim();
    }
}