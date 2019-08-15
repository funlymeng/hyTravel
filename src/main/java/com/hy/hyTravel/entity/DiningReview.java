package com.hy.hyTravel.entity;

import java.util.Date;

public class DiningReview {
    private String diningId;

    private String userId;

    private String userName;

    private Integer diningGrade;

    private String gradeComment;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getDiningGrade() {
        return diningGrade;
    }

    public void setDiningGrade(Integer diningGrade) {
        this.diningGrade = diningGrade;
    }

    public String getGradeComment() {
        return gradeComment;
    }

    public void setGradeComment(String gradeComment) {
        this.gradeComment = gradeComment == null ? null : gradeComment.trim();
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