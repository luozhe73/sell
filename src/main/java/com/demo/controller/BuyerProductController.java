package com.demo.controller;

import com.demo.VO.ProductInfoVO;
import com.demo.VO.ProductVO;
import com.demo.VO.ResultVO;
import com.demo.dataObject.ProductCategory;
import com.demo.dataObject.ProductInfo;
import com.demo.service.CategoryService;
import com.demo.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list() {

        //1.查询所有上架商品
        List<ProductInfo> productInfoList=productService.findUpAll();

        //2.查询类目(一次性查询)
        List<Integer> categoryTypeList = new ArrayList<Integer>();

        for (ProductInfo productInfo:productInfoList
             ) {
            categoryTypeList.add(productInfo.getCategoryType());
        }
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        //3.数据拼装
        List<ProductVO> productVOList=new ArrayList<>();
        for (ProductCategory productcategory:categoryList
             ) {
            ProductVO productVO=new ProductVO();
            productVO.setCategoryType(productcategory.getCategoryType());
            productVO.setCategoryName(productcategory.getCategoryName());


            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo:productInfoList
                 ) {
                if(productInfo.getCategoryType().equals(productcategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        ResultVO resultVO = new ResultVO();

        resultVO.setData(productVOList);
        resultVO.setCode(0);
        resultVO.setMsg("success");

        return resultVO;
    }
}
