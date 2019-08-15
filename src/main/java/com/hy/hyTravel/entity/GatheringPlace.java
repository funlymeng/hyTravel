package com.hy.hyTravel.entity;

import java.util.Date;

public class GatheringPlace {
    private String gatheringId;

    private String provinceCode;

    private String cityCode;

    private String gatheringName;

    private String gatheringDes;

    private String isValid;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getGatheringId() {
        return gatheringId;
    }

    public void setGatheringId(String gatheringId) {
        this.gatheringId = gatheringId == null ? null : gatheringId.trim();
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

    public String getGatheringName() {
        return gatheringName;
    }

    public void setGatheringName(String gatheringName) {
        this.gatheringName = gatheringName == null ? null : gatheringName.trim();
    }

    public String getGatheringDes() {
        return gatheringDes;
    }

    public void setGatheringDes(String gatheringDes) {
        this.gatheringDes = gatheringDes == null ? null : gatheringDes.trim();
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