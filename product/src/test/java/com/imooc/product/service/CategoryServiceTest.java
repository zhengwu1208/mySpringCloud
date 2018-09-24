package com.imooc.product.service;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductCategory;

/**
 * Created by zhengwu on 2018/9/22.
 */
public class CategoryServiceTest extends ProductApplicationTests {
    @Autowired
    private CategoryService categoryService;

    @Test
    public void testFindByCategoryTypeIn() throws Exception {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11, 22));
        Assert.assertTrue(list.size() > 0);
    }
}