package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

/**
 * Created by zhengwu on 2018/9/22.
 */
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("success");
        resultVO.setData(object);
        return resultVO;
    }
}
