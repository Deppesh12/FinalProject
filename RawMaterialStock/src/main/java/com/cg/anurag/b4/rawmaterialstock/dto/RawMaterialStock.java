package com.cg.anurag.b4.rawmaterialstock.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rawmaterialstock")
public class RawMaterialStock {	
	@Id
	 @Column(name="batchno")
	 int batchNo;
	 @Column(name="rawmaterialid")
	 String rawMaterialId;
	 @Column(name="quantity")
	 int quantity;
	 @Column(name="supplierid")
	 int supplierId;
	 @Column(name="warehouseid")
	 int warehouseId;
	 @Column(name="manufacturingdate")
	 LocalDate manufacturingDate;
	 @Column(name="expirydate")
	 LocalDate expiryDate;
	
	 public RawMaterialStock() {}

	public RawMaterialStock(int batchNo, String rawMaterialId, int quantity, int supplierId, int warehouseId,
			LocalDate manufacturingDate, LocalDate expiryDate) {
		super();
		this.batchNo = batchNo;
		this.rawMaterialId = rawMaterialId;
		this.quantity = quantity;
		this.supplierId = supplierId;
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

	public String getRawMaterialId() {
		return rawMaterialId;
	}

	public void setRawMaterialId(String rawMaterialId) {
		this.rawMaterialId = rawMaterialId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
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