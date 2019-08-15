package com.hy.hyTravel.entity;

import java.util.Date;

public class DiningHall {
    private String diningId;

    private String diningName;

    private String scenicId;

    private String diningImg;

    private String diningRecommend;

    private String isValid;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getDiningId() {
        return diningId;
    }

    public void setDiningId(String diningId) {
        this.diningId = diningId == null ? null : diningId.trim();
    }

    public String getDiningName() {
        return diningName;
    }

    public void setDiningName(String diningName) {
        this.diningName = diningName == null ? null : diningName.trim();
    }

    public String getScenicId() {
        return scenicId;
    }

    public void setScenicId(String scenicId) {
        this.scenicId = scenicId == null ? null : scenicId.trim();
    }

    public String getDiningImg() {
        return diningImg;
    }

    public void setDiningImg(String diningImg) {
        this.diningImg = diningImg == null ? null : diningImg.trim();
    }

    public String getDiningRecommend() {
        return diningRecommend;
    }

    public void setDiningRecommend(String diningRecommend) {
        this.diningRecommend = diningRecommend == null ? null : diningRecommend.trim();
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
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