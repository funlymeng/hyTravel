package com.hy.hyTravel.entity;

import java.util.Date;

public class TravelNotes {
    private String noteId;

    private String noteText;

    private String noteImg;

    private String visibleStatus;

    private Integer likeCount;

    private String isValid;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId == null ? null : noteId.trim();
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText == null ? null : noteText.trim();
    }

    public String getNoteImg() {
        return noteImg;
    }

    public void setNoteImg(String noteImg) {
        this.noteImg = noteImg == null ? null : noteImg.trim();
    }

    public String getVisibleStatus() {
        return visibleStatus;
    }

    public void setVisibleStatus(String visibleStatus) {
        this.visibleStatus = visibleStatus == null ? null : visibleStatus.trim();
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
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