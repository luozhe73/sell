package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.demo.dao.ProductInfoDAO;
import com.demo.dataObject.ProductInfo;
import com.demo.enums.ProductStatusEnum;
import com.demo.service.ProductInfoService;

public class ProductInfoImpl implements ProductInfoService {

	@Autowired
	private ProductInfoDAO dao;
	
	@Override
	public ProductInfo findOne(String productId) {
		return dao.findById(productId).get();
	}

	@Override
	public List<ProductInfo> findUpAll() {
		return dao.findByProductStatus(ProductStatusEnum.UP.getCode());
	}

	@Override
	public Page<ProductInfo> findAll(Pageable pageable) {
		return dao.findAll(pageable);
	}

	@Override
	public ProductInfo save(ProductInfo productInfo) {
		return dao.save(productInfo);
	}

}
