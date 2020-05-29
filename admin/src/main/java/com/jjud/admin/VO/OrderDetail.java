package com.jjud.admin.VO;

import java.math.BigDecimal;

public class OrderDetail {

    private Long id;

    private String status;

    private String arrivalDate;

    private Integer quantity;

    private BigDecimal totalPrice;

    private String createdAt;

    private String createdBy;

    private String updatedAt;

    private String updatedBy;

    private Long orderGroupId;

    private Long itemId;

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

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
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

    public Long getOrderGroupId() {
        return orderGroupId;
    }

    public void setOrderGroupId(Long orderGroupId) {
        this.orderGroupId = orderGroupId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    // OrderDetail 모델 복사
    public void CopyData(OrderDetail param)
    {
        this.id = param.getId();
        this.status = param.getStatus();
        this.arrivalDate = param.getArrivalDate();
        this.quantity = param.getQuantity();
        this.totalPrice = param.getTotalPrice();
        this.createdAt = param.getCreatedAt();
        this.createdBy = param.getCreatedBy();
        this.updatedAt = param.getUpdatedAt();
        this.updatedBy = param.getUpdatedBy();
        this.orderGroupId = param.getOrderGroupId();
        this.itemId = param.getItemId();
    }
}