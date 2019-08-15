package com.hy.hyTravel.entity;

import java.util.Date;

public class TravelItinerary {
    private String travelId;

    private String travelName;

    private String travelType;

    private Integer peopleNumber;

    private String travelCar;

    private String ageLimit;

    private String sexLimit;

    private String areaLimit;

    private String destination;

    private String gatheringPlace;

    private String leavePlace;

    private Date startTime;

    private String travelLeaderM;

    private String travelLeaderS;

    private String travelLeaderT;

    private String travelStatus;

    private Integer likeCount;

    private String travelExplain;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private String travelInfo;

    public String getTravelId() {
        return travelId;
    }

    public void setTravelId(String travelId) {
        this.travelId = travelId == null ? null : travelId.trim();
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName == null ? null : travelName.trim();
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType == null ? null : travelType.trim();
    }

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public String getTravelCar() {
        return travelCar;
    }

    public void setTravelCar(String travelCar) {
        this.travelCar = travelCar == null ? null : travelCar.trim();
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit == null ? null : ageLimit.trim();
    }

    public String getSexLimit() {
        return sexLimit;
    }

    public void setSexLimit(String sexLimit) {
        this.sexLimit = sexLimit == null ? null : sexLimit.trim();
    }

    public String getAreaLimit() {
        return areaLimit;
    }

    public void setAreaLimit(String areaLimit) {
        this.areaLimit = areaLimit == null ? null : areaLimit.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getGatheringPlace() {
        return gatheringPlace;
    }

    public void setGatheringPlace(String gatheringPlace) {
        this.gatheringPlace = gatheringPlace == null ? null : gatheringPlace.trim();
    }

    public String getLeavePlace() {
        return leavePlace;
    }

    public void setLeavePlace(String leavePlace) {
        this.leavePlace = leavePlace == null ? null : leavePlace.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getTravelLeaderM() {
        return travelLeaderM;
    }

    public void setTravelLeaderM(String travelLeaderM) {
        this.travelLeaderM = travelLeaderM == null ? null : travelLeaderM.trim();
    }

    public String getTravelLeaderS() {
        return travelLeaderS;
    }

    public void setTravelLeaderS(String travelLeaderS) {
        this.travelLeaderS = travelLeaderS == null ? null : travelLeaderS.trim();
    }

    public String getTravelLeaderT() {
        return travelLeaderT;
    }

    public void setTravelLeaderT(String travelLeaderT) {
        this.travelLeaderT = travelLeaderT == null ? null : travelLeaderT.trim();
    }

    public String getTravelStatus() {
        return travelStatus;
    }

    public void setTravelStatus(String travelStatus) {
        this.travelStatus = travelStatus == null ? null : travelStatus.trim();
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getTravelExplain() {
        return travelExplain;
    }

    public void setTravelExplain(String travelExplain) {
        this.travelExplain = travelExplain == null ? null : travelExplain.trim();
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

    public String getTravelInfo() {
        return travelInfo;
    }

    public void setTravelInfo(String travelInfo) {
        this.travelInfo = travelInfo == null ? null : travelInfo.trim();
    }
}