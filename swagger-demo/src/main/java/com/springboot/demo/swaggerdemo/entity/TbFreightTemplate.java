package com.springboot.demo.swaggerdemo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TbFreightTemplate {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.seller_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private String sellerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.is_default
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private String isDefault;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.name
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.send_time_type
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private String sendTimeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.price
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.create_time
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.id
     *
     * @return the value of tb_freight_template.id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.id
     *
     * @param id the value for tb_freight_template.id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.seller_id
     *
     * @return the value of tb_freight_template.seller_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.seller_id
     *
     * @param sellerId the value for tb_freight_template.seller_id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.is_default
     *
     * @return the value of tb_freight_template.is_default
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.is_default
     *
     * @param isDefault the value for tb_freight_template.is_default
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.name
     *
     * @return the value of tb_freight_template.name
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.name
     *
     * @param name the value for tb_freight_template.name
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.send_time_type
     *
     * @return the value of tb_freight_template.send_time_type
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public String getSendTimeType() {
        return sendTimeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.send_time_type
     *
     * @param sendTimeType the value for tb_freight_template.send_time_type
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setSendTimeType(String sendTimeType) {
        this.sendTimeType = sendTimeType == null ? null : sendTimeType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.price
     *
     * @return the value of tb_freight_template.price
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.price
     *
     * @param price the value for tb_freight_template.price
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.create_time
     *
     * @return the value of tb_freight_template.create_time
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.create_time
     *
     * @param createTime the value for tb_freight_template.create_time
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}