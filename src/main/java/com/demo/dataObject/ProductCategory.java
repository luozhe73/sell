package com.demo.dataObject;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Entity
@DynamicUpdate
@Data
public class ProductCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer categoryId;

	private String categoryName;

	private Integer categoryType;

	private Date createTime;

	private Date updateTime;

	@Override
	public String toString() {
		return "ProductCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryType="
				+ categoryType + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

	public ProductCategory(Integer categoryId, String categoryName, Integer categoryType, Date createTime,
			Date updateTime) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryType = categoryType;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public ProductCategory() {

	}

}
