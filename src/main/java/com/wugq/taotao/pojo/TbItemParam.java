package com.wugq.taotao.pojo;

import java.util.Date;

public class TbItemParam {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param.item_cat_id
     *
     * @mbg.generated
     */
    private Long itemCatId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param.created
     *
     * @mbg.generated
     */
    private Date created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param.updated
     *
     * @mbg.generated
     */
    private Date updated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param.param_data
     *
     * @mbg.generated
     */
    private String paramData;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param.id
     *
     * @return the value of tb_item_param.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param.id
     *
     * @param id the value for tb_item_param.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param.item_cat_id
     *
     * @return the value of tb_item_param.item_cat_id
     *
     * @mbg.generated
     */
    public Long getItemCatId() {
        return itemCatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param.item_cat_id
     *
     * @param itemCatId the value for tb_item_param.item_cat_id
     *
     * @mbg.generated
     */
    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param.created
     *
     * @return the value of tb_item_param.created
     *
     * @mbg.generated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param.created
     *
     * @param created the value for tb_item_param.created
     *
     * @mbg.generated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param.updated
     *
     * @return the value of tb_item_param.updated
     *
     * @mbg.generated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param.updated
     *
     * @param updated the value for tb_item_param.updated
     *
     * @mbg.generated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param.param_data
     *
     * @return the value of tb_item_param.param_data
     *
     * @mbg.generated
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param.param_data
     *
     * @param paramData the value for tb_item_param.param_data
     *
     * @mbg.generated
     */
    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}