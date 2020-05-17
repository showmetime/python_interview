package com.springboot.demo.swaggerdemo.entity;

import java.math.BigDecimal;

public class TbOrderItem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.item_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private Long itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.goods_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.order_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.title
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.price
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.num
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private Integer num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.total_fee
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private BigDecimal totalFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.pic_path
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private String picPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_order_item.seller_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private String sellerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.id
     *
     * @return the value of tb_order_item.id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.id
     *
     * @param id the value for tb_order_item.id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.item_id
     *
     * @return the value of tb_order_item.item_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.item_id
     *
     * @param itemId the value for tb_order_item.item_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.goods_id
     *
     * @return the value of tb_order_item.goods_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.goods_id
     *
     * @param goodsId the value for tb_order_item.goods_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.order_id
     *
     * @return the value of tb_order_item.order_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.order_id
     *
     * @param orderId the value for tb_order_item.order_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.title
     *
     * @return the value of tb_order_item.title
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.title
     *
     * @param title the value for tb_order_item.title
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.price
     *
     * @return the value of tb_order_item.price
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.price
     *
     * @param price the value for tb_order_item.price
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.num
     *
     * @return the value of tb_order_item.num
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.num
     *
     * @param num the value for tb_order_item.num
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.total_fee
     *
     * @return the value of tb_order_item.total_fee
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public BigDecimal getTotalFee() {
        return totalFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.total_fee
     *
     * @param totalFee the value for tb_order_item.total_fee
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.pic_path
     *
     * @return the value of tb_order_item.pic_path
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.pic_path
     *
     * @param picPath the value for tb_order_item.pic_path
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_order_item.seller_id
     *
     * @return the value of tb_order_item.seller_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_order_item.seller_id
     *
     * @param sellerId the value for tb_order_item.seller_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }
}