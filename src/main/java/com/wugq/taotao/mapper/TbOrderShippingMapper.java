package com.wugq.taotao.mapper;

import com.wugq.taotao.pojo.TbOrderShipping;
import com.wugq.taotao.pojo.TbOrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated
     */
    long countByExample(TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated
     */
    int deleteByExample(TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated
     */
    int insert(TbOrderShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated
     */
    int insertSelective(TbOrderShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated
     */
    List<TbOrderShipping> selectByExample(TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated
     */
    TbOrderShipping selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbOrderShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_shipping
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbOrderShipping record);
}