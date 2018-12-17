package com.capgemini.dto;

public class RsIndustry {
    private Integer id;

    private String industryName;

    private Integer industryExpId;

    private String content;

    public RsIndustry(Integer id, String industryName, Integer industryExpId) {
        this.id = id;
        this.industryName = industryName;
        this.industryExpId = industryExpId;
    }

    public RsIndustry(Integer id, String industryName, Integer industryExpId, String content) {
        this.id = id;
        this.industryName = industryName;
        this.industryExpId = industryExpId;
        this.content = content;
    }

    public RsIndustry() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName == null ? null : industryName.trim();
    }

    public Integer getIndustryExpId() {
        return industryExpId;
    }

    public void setIndustryExpId(Integer industryExpId) {
        this.industryExpId = industryExpId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}