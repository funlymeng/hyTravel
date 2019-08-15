package com.hy.hyTravel.entity.extend;

import com.hy.hyTravel.entity.MyConcerns;

/**
 * 我的关注VO
 */
public class ConcernsVO extends MyConcerns {

    private String title;

    private String img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}