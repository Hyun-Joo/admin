package com.jjud.admin.VO;

import java.math.BigDecimal;

public class OrderGroup {

    private Long id;

    private String status;

    private String orderType;

    private String revAddress;

    private String revName;

    private String paymentType;

    private BigDecimal totalPrice;

    private Integer totalQuantity;

    private String orderAt;

    private String arrivalDate;

    private String createdAt;

    private String createdBy;

    private String updatedAt;

    private String updatedBy;

    private Long userId;

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

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getRevAddress() {
        return revAddress;
    }

    public void setRevAddress(String revAddress) {
        this.revAddress = revAddress;
    }

    public String getRevName() {
        return revName;
    }

    public void setRevName(String revName) {
        this.revName = revName;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public String getOrderAt() {
        return orderAt;
    }

    public void setOrderAt(String orderAt) {
        this.orderAt = orderAt;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    // OrderGroup 모델 복사
    public void CopyData(OrderGroup param)
    {
        this.id = param.getId();
        this.status = param.getStatus();
        this.orderType = param.getOrderType();
        this.revAddress = param.getRevAddress();
        this.revName = param.getRevName();
        this.paymentType = param.getPaymentType();
        this.totalPrice = param.getTotalPrice();
        this.totalQuantity = param.getTotalQuantity();
        this.orderAt = param.getOrderAt();
        this.arrivalDate = param.getArrivalDate();
        this.createdAt = param.getCreatedAt();
        this.createdBy = param.getCreatedBy();
        this.updatedAt = param.getUpdatedAt();
        this.updatedBy = param.getUpdatedBy();
        this.userId = param.getUserId();
    }
}
