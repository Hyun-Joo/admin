package com.jjud.admin.VO;

public class AdminUser {

    // index
    private Long id;

    private String account;

    private String password;

    private String status;

    private String role;

    private String lastLoginAt;

    private Integer loginFailCount;

    private String passwordUpdatedAt;

    private String registeredAt;

    private String unregisteredAt;

    private String createdAt;

    private String createdBy;

    private String updatedAt;

    private String updatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(String lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    public Integer getLoginFailCount() {
        return loginFailCount;
    }

    public void setLoginFailCount(Integer loginFailCount) {
        this.loginFailCount = loginFailCount;
    }

    public String getPasswordUpdatedAt() {
        return passwordUpdatedAt;
    }

    public void setPasswordUpdatedAt(String passwordUpdatedAt) {
        this.passwordUpdatedAt = passwordUpdatedAt;
    }

    public String getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(String registeredAt) {
        this.registeredAt = registeredAt;
    }

    public String getUnregisteredAt() {
        return unregisteredAt;
    }

    public void setUnregisteredAt(String unregisteredAt) {
        this.unregisteredAt = unregisteredAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    // AdminUser 모델 복사
    public void CopyData(AdminUser param)
    {
        this.id = param.getId();
        this.account = param.getAccount();
        this.password = param.getPassword();
        this.status = param.getStatus();
        this.role = param.getRole();
        this.lastLoginAt = param.getLastLoginAt();
        this.loginFailCount = param.getLoginFailCount();
        this.passwordUpdatedAt = param.getPasswordUpdatedAt();
        this.registeredAt = param.getRegisteredAt();
        this.unregisteredAt = param.getUnregisteredAt();
        this.createdAt = param.getCreatedAt();
        this.createdBy = param.getCreatedBy();
        this.updatedAt = param.getUpdatedAt();
        this.updatedBy = param.getUpdatedBy();
    }
}