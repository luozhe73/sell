package com.demo.service;

import java.util.List;

import com.demo.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.demo.dataObject.ProductInfo;

public interface ProductService {

	ProductInfo findOne(String productId);
	
	List<ProductInfo> findUpAll();
	
	Page<ProductInfo> findAll(Pageable pageable);
	
	ProductInfo save(ProductInfo productInfo);

	//加库存
	void increaseStock(List<CartDTO> cartDTOList);

	//扣库存
	void decreaseStock(List<CartDTO> cartDTOList);
}
