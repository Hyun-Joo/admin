package com.jjud.admin.VO;

public class Partner {

    private Long id;

    private String name;

    private String status;

    private String address;

    private String callCenter;

    private String partnerNumber;

    private String businessNumber;

    private String ceoName;

    private String registeredAt;

    private String unregisteredAt;

    private String createdAt;

    private String createdBy;

    private String updatedAt;

    private String updatedBy;

    private Long categoryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCallCenter() {
        return callCenter;
    }

    public void setCallCenter(String callCenter) {
        this.callCenter = callCenter;
    }

    public String getPartnerNumber() {
        return partnerNumber;
    }

    public void setPartnerNumber(String partnerNumber) {
        this.partnerNumber = partnerNumber;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    // Partner 모델 복사
    public void CopyData(Partner param)
    {
        this.id = param.getId();
        this.name = param.getName();
        this.status = param.getStatus();
        this.address = param.getAddress();
        this.callCenter = param.getCallCenter();
        this.partnerNumber = param.getPartnerNumber();
        this.businessNumber = param.getBusinessNumber();
        this.ceoName = param.getCeoName();
        this.registeredAt = param.getRegisteredAt();
        this.unregisteredAt = param.getUnregisteredAt();
        this.createdAt = param.getCreatedAt();
        this.createdBy = param.getCreatedBy();
        this.updatedAt = param.getUpdatedAt();
        this.updatedBy = param.getUpdatedBy();
        this.categoryId = param.getCategoryId();
    }
}