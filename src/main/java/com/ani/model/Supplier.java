package com.ani.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
	@Id
private int supplierId; 
private String supplierDescription;
private String supplierName;

public int getSupplierId() {
	return supplierId;
}
public void setSupplierId(int supplierId) {
	this.supplierId = supplierId;
}
public String getSupplierDescription() {
	return supplierDescription;
}
public void setSupplierDescription(String supplierDescription) {
	this.supplierDescription = supplierDescription;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}

}
