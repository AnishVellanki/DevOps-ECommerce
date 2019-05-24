package com.ani.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Category {
	@Id
int categoryId;
	private String categoryName;

private String categoryDescription;

public int getCategoryId() {
	return categoryId;
}

public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}

public String getCategoryName() {
	return categoryName;
}

public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}

public String getCategoryDescription() {
	return categoryDescription;
}

public void setCategoryDescription(String categoryDescription) {
	this.categoryDescription = categoryDescription;
}

}

