package com.imooc.product.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.product.VO.ProductInfoVO;
import com.imooc.product.VO.ProductVO;
import com.imooc.product.VO.ResultVO;
import com.imooc.product.dataobject.ProductCategory;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.service.CategoryService;
import com.imooc.product.service.ProductService;
import com.imooc.product.utils.ResultVOUtil;

/**
 * Created by zhengwu on 2018/9/22.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService  productService;
    @Autowired
    private CategoryService categoryService;

    /**
     *
     */
    @GetMapping("/list")
    public ResultVO<ProductVO> list() {
        //1. 查询所有在架的商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        //2. 获取类目type列表
        List<Integer> typeList = productInfoList.stream().map(ProductInfo::getCategoryType)
            .collect(Collectors.toList());
        //3. 从数据库查询类目
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(typeList);
        //4. 构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        productCategoryList.forEach(categoryitem -> {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(categoryitem.getCategoryName());
            productVO.setCategoryType(categoryitem.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            productInfoList.forEach(infoItem -> {
                if (categoryitem.getCategoryType().equals(infoItem.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(infoItem, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            });
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        });
        return ResultVOUtil.success(productVOList);
    }
}
