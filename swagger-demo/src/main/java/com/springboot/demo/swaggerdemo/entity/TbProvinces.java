package com.springboot.demo.swaggerdemo.entity;

public class TbProvinces {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_provinces.id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_provinces.provinceid
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private String provinceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_provinces.province
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private String province;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_provinces.id
     *
     * @return the value of tb_provinces.id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_provinces.id
     *
     * @param id the value for tb_provinces.id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_provinces.provinceid
     *
     * @return the value of tb_provinces.provinceid
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_provinces.provinceid
     *
     * @param provinceid the value for tb_provinces.provinceid
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_provinces.province
     *
     * @return the value of tb_provinces.province
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_provinces.province
     *
     * @param province the value for tb_provinces.province
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }
}