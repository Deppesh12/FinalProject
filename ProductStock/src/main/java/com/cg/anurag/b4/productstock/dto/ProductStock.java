package com.cg.anurag.b4.productstock.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productstock")
public class ProductStock {	
	@Id
	 @Column(name="batchno")
	 int batchNo;
	 @Column(name="productid")
	 String productId;
	 @Column(name="quantity")
	 int quantity;
	 @Column(name="distributorid")
	 int distributorId;
	 @Column(name="warehouseid")
	 int warehouseId;
	 @Column(name="manufacturingdate")
	 LocalDate manufacturingDate;
	 @Column(name="expirydate")
	 LocalDate expiryDate;
	
	 public ProductStock() {}

	public ProductStock(int batchNo, String productId, int quantity, int distributorId, int warehouseId,
			LocalDate manufacturingDate, LocalDate expiryDate) {
		super();
		this.batchNo = batchNo;
		this.productId = productId;
		this.quantity = quantity;
		this.distributorId = distributorId;
		this.warehouseId = warehouseId;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
	}

	public int getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
}
	