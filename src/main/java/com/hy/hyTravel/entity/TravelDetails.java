package com.hy.hyTravel.entity;

import java.util.Date;

public class TravelDetails {
    private String detailId;

    private String travelId;

    private String detailSort;

    private String destination;

    private String scenicAId;

    private String scenicAName;

    private String scenicBId;

    private String scenicBName;

    private String scenicCId;

    private String scenicCName;

    private String hotelId;

    private String hotelName;

    private String hotelImg;

    private Date detailDate;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

    public String getTravelId() {
        return travelId;
    }

    public void setTravelId(String travelId) {
        this.travelId = travelId == null ? null : travelId.trim();
    }

    public String getDetailSort() {
        return detailSort;
    }

    public void setDetailSort(String detailSort) {
        this.detailSort = detailSort == null ? null : detailSort.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getScenicAId() {
        return scenicAId;
    }

    public void setScenicAId(String scenicAId) {
        this.scenicAId = scenicAId == null ? null : scenicAId.trim();
    }

    public String getScenicAName() {
        return scenicAName;
    }

    public void setScenicAName(String scenicAName) {
        this.scenicAName = scenicAName == null ? null : scenicAName.trim();
    }

    public String getScenicBId() {
        return scenicBId;
    }

    public void setScenicBId(String scenicBId) {
        this.scenicBId = scenicBId == null ? null : scenicBId.trim();
    }

    public String getScenicBName() {
        return scenicBName;
    }

    public void setScenicBName(String scenicBName) {
        this.scenicBName = scenicBName == null ? null : scenicBName.trim();
    }

    public String getScenicCId() {
        return scenicCId;
    }

    public void setScenicCId(String scenicCId) {
        this.scenicCId = scenicCId == null ? null : scenicCId.trim();
    }

    public String getScenicCName() {
        return scenicCName;
    }

    public void setScenicCName(String scenicCName) {
        this.scenicCName = scenicCName == null ? null : scenicCName.trim();
    }

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

    public String getHotelImg() {
        return hotelImg;
    }

    public void setHotelImg(String hotelImg) {
        this.hotelImg = hotelImg == null ? null : hotelImg.trim();
    }

    public Date getDetailDate() {
        return detailDate;
    }

    public void setDetailDate(Date detailDate) {
        this.detailDate = detailDate;
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