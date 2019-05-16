package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.dataObject.ProductCategory;

public interface ProductCategoryDAO extends JpaRepository<ProductCategory, Integer>{

	public List<ProductCategory> findByCategoryTypeIn(List<Integer> list);

	public List<ProductCategory> findByCategoryType(Integer categoryType);
}
