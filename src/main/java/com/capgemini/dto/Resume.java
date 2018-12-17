package com.capgemini.dto;

public class Resume {
    private Integer id;

    private String name;

    private String residence;

    private String nationality;

    private Integer industryExpId;

    private Integer technicalExpId;

    private Integer careerExpId;

    private Integer languageId;

    private Integer projectId;

    private Integer certificateId;

    private Integer educationId;

    private Integer otherId;

    private String type;

    private String imgUrl;

    private Double completion;

    private String profile;

    public Resume(Integer id, String name, String residence, String nationality, Integer industryExpId, Integer technicalExpId, Integer careerExpId, Integer languageId, Integer projectId, Integer certificateId, Integer educationId, Integer otherId, String type, String imgUrl, Double completion) {
        this.id = id;
        this.name = name;
        this.residence = residence;
        this.nationality = nationality;
        this.industryExpId = industryExpId;
        this.technicalExpId = technicalExpId;
        this.careerExpId = careerExpId;
        this.languageId = languageId;
        this.projectId = projectId;
        this.certificateId = certificateId;
        this.educationId = educationId;
        this.otherId = otherId;
        this.type = type;
        this.imgUrl = imgUrl;
        this.completion = completion;
    }

    public Resume(Integer id, String name, String residence, String nationality, Integer industryExpId, Integer technicalExpId, Integer careerExpId, Integer languageId, Integer projectId, Integer certificateId, Integer educationId, Integer otherId, String type, String imgUrl, Double completion, String profile) {
        this.id = id;
        this.name = name;
        this.residence = residence;
        this.nationality = nationality;
        this.industryExpId = industryExpId;
        this.technicalExpId = technicalExpId;
        this.careerExpId = careerExpId;
        this.languageId = languageId;
        this.projectId = projectId;
        this.certificateId = certificateId;
        this.educationId = educationId;
        this.otherId = otherId;
        this.type = type;
        this.imgUrl = imgUrl;
        this.completion = completion;
        this.profile = profile;
    }

    public Resume() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence == null ? null : residence.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public Integer getIndustryExpId() {
        return industryExpId;
    }

    public void setIndustryExpId(Integer industryExpId) {
        this.industryExpId = industryExpId;
    }

    public Integer getTechnicalExpId() {
        return technicalExpId;
    }

    public void setTechnicalExpId(Integer technicalExpId) {
        this.technicalExpId = technicalExpId;
    }

    public Integer getCareerExpId() {
        return careerExpId;
    }

    public void setCareerExpId(Integer careerExpId) {
        this.careerExpId = careerExpId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public Integer getOtherId() {
        return otherId;
    }

    public void setOtherId(Integer otherId) {
        this.otherId = otherId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Double getCompletion() {
        return completion;
    }

    public void setCompletion(Double completion) {
        this.completion = completion;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }
}