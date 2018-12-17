package com.capgemini.dto;

import java.util.Date;

public class RsCarrer {
    private Integer id;

    private Date startTime;

    private Date endTime;

    private Integer careerExpId;

    private String content;

    public RsCarrer(Integer id, Date startTime, Date endTime, Integer careerExpId) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.careerExpId = careerExpId;
    }

    public RsCarrer(Integer id, Date startTime, Date endTime, Integer careerExpId, String content) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.careerExpId = careerExpId;
        this.content = content;
    }

    public RsCarrer() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getCareerExpId() {
        return careerExpId;
    }

    public void setCareerExpId(Integer careerExpId) {
        this.careerExpId = careerExpId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}