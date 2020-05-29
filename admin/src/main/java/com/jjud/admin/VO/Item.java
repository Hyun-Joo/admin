package com.jjud.admin.VO;

import java.math.BigDecimal;

public class Item {

    private Long id;

    private String status;

    private String name;

    private String title;

    private String content;

    private BigDecimal price;

    private String brandName;

    private String registeredAt;

    private String unregisteredAt;

    private String createdAt;

    private String createdBy;

    private String updatedAt;

    private String updatedBy;

    private Long partnerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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

    public Long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    // Item 모델 복사
    public void CopyData(Item param)
    {
        this.id = param.getId();
        this.status = param.getStatus();
        this.name = param.getName();
        this.title = param.getTitle();
        this.content = param.getContent();
        this.price = param.getPrice();
        this.brandName = param.getBrandName();
        this.registeredAt = param.getRegisteredAt();
        this.unregisteredAt = param.getUnregisteredAt();
        this.createdAt = param.getCreatedAt();
        this.createdBy = param.getCreatedBy();
        this.updatedAt = param.getUpdatedAt();
        this.updatedBy = param.getUpdatedBy();
        this.partnerId = param.getPartnerId();
    }
}
