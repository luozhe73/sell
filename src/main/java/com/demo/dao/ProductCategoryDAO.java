package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.dataObject.ProductCategory;

public interface ProductCategoryDAO extends JpaRepository<ProductCategory, Integer>{

}
