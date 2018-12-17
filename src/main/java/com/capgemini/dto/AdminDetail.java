package com.capgemini.dto;

public class AdminDetail {
    private Integer id;

    private String cnName;

    private String enName;

    private String email;

    private String tel;

    private String position;

    private String department;

    public AdminDetail(Integer id, String cnName, String enName, String email, String tel, String position, String department) {
        this.id = id;
        this.cnName = cnName;
        this.enName = enName;
        this.email = email;
        this.tel = tel;
        this.position = position;
        this.department = department;
    }

    public AdminDetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName == null ? null : cnName.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }
}