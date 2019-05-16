package com.demo.controller;

import com.demo.VO.ProductInfoVO;
import com.demo.VO.ProductVO;
import com.demo.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO list(){

        ResultVO resultVO = new ResultVO();
        ProductVO productVO = new ProductVO();
        ProductInfoVO productInfoVO=new ProductInfoVO();

        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));

        resultVO.setData(Arrays.asList(productVO));
        resultVO.setCode(0);
        resultVO.setMsg("success");

        return  resultVO;
    }
}
