package com.demo.dao;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.dataObject.ProductCategory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDAOTest {

	@Autowired
	private ProductCategoryDAO productCategoryDAO;
	
	@Test
	public void test() {
		Optional<ProductCategory> dao = productCategoryDAO.findById(1);
		System.out.println(dao.toString());
	}
	
	@Test
	public void save() {
		Optional<ProductCategory> dao = productCategoryDAO.findById(1);
		ProductCategory entity = dao.get();
		entity.setCategoryType(1);
//		ProductCategory entity = new ProductCategory();
//		entity.setCategoryId(1);
//		entity.setCategoryName("boy favirote");
//		entity.setCategoryType(1);
		productCategoryDAO.save(entity);
	}

}
