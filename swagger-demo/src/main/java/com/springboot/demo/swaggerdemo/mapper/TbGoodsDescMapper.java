package com.springboot.demo.swaggerdemo.mapper;

import com.springboot.demo.swaggerdemo.entity.TbGoodsDesc;

public interface TbGoodsDescMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_goods_desc
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    TbGoodsDesc selectByPrimaryKey(Long goodsId);
}