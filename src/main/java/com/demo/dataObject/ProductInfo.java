package com.demo.dataObject;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Entity
@DynamicUpdate
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfo {

	@Id
	private String productId;
	
	private String productName;
	
	private BigDecimal productPrice;
	
	private Integer productStock;
	
	private String productDescription;
	
	private String productIcon;
	
	private Integer productStatus;
	
	private Integer categoryType;
}
