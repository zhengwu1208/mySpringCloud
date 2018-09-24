package com.imooc.product.dataobject;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * Created by zhengwu on 2018/9/22.
 */
@Data
@Entity

public class ProductCategory {
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字. */
    private String  categoryName;

    /** 类目编号. */
    private Integer categoryType;

    private Date    createTime;

    private Date    updateTime;
}
