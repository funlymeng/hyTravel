package com.hy.hyTravel.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Hotel {
    private String hotelId;

    private String hotelName;

    private String hotelStar;

    private String hotelType;

    private BigDecimal hotelPrice;

    private String hotelImg;

    private String hotelRecommend;

    private String scenicId;

    private String isValid;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId == null ? null : hotelId.trim();
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    public String getHotelStar() {
        return hotelStar;
    }

    public void setHotelStar(String hotelStar) {
        this.hotelStar = hotelStar == null ? null : hotelStar.trim();
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType == null ? null : hotelType.trim();
    }

    public BigDecimal getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(BigDecimal hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public String getHotelImg() {
        return hotelImg;
    }

    public void setHotelImg(String hotelImg) {
        this.hotelImg = hotelImg == null ? null : hotelImg.trim();
    }

    public String getHotelRecommend() {
        return hotelRecommend;
    }

    public void setHotelRecommend(String hotelRecommend) {
        this.hotelRecommend = hotelRecommend == null ? null : hotelRecommend.trim();
    }

    public String getScenicId() {
        return scenicId;
    }

    public void setScenicId(String scenicId) {
        this.scenicId = scenicId == null ? null : scenicId.trim();
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