package com.springboot.demo.swaggerdemo.entity;

public class TbContentCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_content_category.id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_content_category.name
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_content_category.id
     *
     * @return the value of tb_content_category.id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_content_category.id
     *
     * @param id the value for tb_content_category.id
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_content_category.name
     *
     * @return the value of tb_content_category.name
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_content_category.name
     *
     * @param name the value for tb_content_category.name
     *
     * @mbg.generated Sat May 16 14:11:45 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}