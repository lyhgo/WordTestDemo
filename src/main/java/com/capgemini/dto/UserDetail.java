package com.capgemini.dto;

import java.util.Date;

public class UserDetail {
    private Integer id;

    private String empNo;

    private String enName;

    private String cnName;

    private String email;

    private String team;

    private String tel;

    private String residence;

    private Date createDate;

    private Date updateDate;

    private Integer resumeId;

    private Date entryDate;

    private Integer level;

    private String position;

    private Integer status;

    private Double seniority;

    public UserDetail(Integer id, String empNo, String enName, String cnName, String email, String team, String tel, String residence, Date createDate, Date updateDate, Integer resumeId, Date entryDate, Integer level, String position, Integer status, Double seniority) {
        this.id = id;
        this.empNo = empNo;
        this.enName = enName;
        this.cnName = cnName;
        this.email = email;
        this.team = team;
        this.tel = tel;
        this.residence = residence;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.resumeId = resumeId;
        this.entryDate = entryDate;
        this.level = level;
        this.position = position;
        this.status = status;
        this.seniority = seniority;
    }

    public UserDetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo == null ? null : empNo.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName == null ? null : cnName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team == null ? null : team.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence == null ? null : residence.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getSeniority() {
        return seniority;
    }

    public void setSeniority(Double seniority) {
        this.seniority = seniority;
    }
}