package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.dao.ProductCategoryDAO;
import com.demo.dataObject.ProductCategory;
import com.demo.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService	{

	@Autowired
	private ProductCategoryDAO  dao;
	
	@Override
	public ProductCategory findOne(Integer categoryId) {
		return dao.findById(categoryId).get();
	}

	@Override
	public List<ProductCategory> findAll() {
		return dao.findAll();
	}

	@Override
	public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
		return dao.findByCategoryTypeIn(categoryTypeList);
	}

	@Override
	public ProductCategory save(ProductCategory productCategory) {
		return dao.save(productCategory);
	}

}
