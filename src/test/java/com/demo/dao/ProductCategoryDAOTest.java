package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.assertj.core.util.Arrays;
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

	@Test
	public void findByCategoryTypeInTest() {
		List<Integer> list = new ArrayList<Integer>() {{
			add(1);
			add(2);
		}};
		
		List<ProductCategory> listProduct = productCategoryDAO.findByCategoryTypeIn(list);
		System.out.println(listProduct.toString());
	}
}
