package com.hy.hyTravel.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ScenicSpot {
    private String scenicId;

    private String scenicName;

    private String provinceCode;

    private String cityCode;

    private BigDecimal scenicPrice;

    private String scenicImg;

    private String scenicRecommend;

    private String isValid;

    private BigDecimal gatheringDistance;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getScenicId() {
        return scenicId;
    }

    public void setScenicId(String scenicId) {
        this.scenicId = scenicId == null ? null : scenicId.trim();
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName == null ? null : scenicName.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public BigDecimal getScenicPrice() {
        return scenicPrice;
    }

    public void setScenicPrice(BigDecimal scenicPrice) {
        this.scenicPrice = scenicPrice;
    }

    public String getScenicImg() {
        return scenicImg;
    }

    public void setScenicImg(String scenicImg) {
        this.scenicImg = scenicImg == null ? null : scenicImg.trim();
    }

    public String getScenicRecommend() {
        return scenicRecommend;
    }

    public void setScenicRecommend(String scenicRecommend) {
        this.scenicRecommend = scenicRecommend == null ? null : scenicRecommend.trim();
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    public BigDecimal getGatheringDistance() {
        return gatheringDistance;
    }

    public void setGatheringDistance(BigDecimal gatheringDistance) {
        this.gatheringDistance = gatheringDistance;
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
}