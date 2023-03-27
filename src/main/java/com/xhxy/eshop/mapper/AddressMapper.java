package com.xhxy.eshop.mapper;

import com.xhxy.eshop.entity.Address;

import java.util.List;

public interface AddressMapper {
    // 查询某个用户的所有收货地址
//    @Select("select * from address where user_id= #{userId}")
    public List<Address> findByUserId(Integer userId);

    // 查询某个收货地址
//    @Select(" select * from address where id= #{id}")
    public Address findById(Integer id);

    // 为某个用户增加收货地址
//    @Insert("insert into address(consigneeName,consigneeAddress,consigneePhone,postcode,user_id)" +
//            "        values(#{consigneeName},#{consigneeAddress},#{consigneePhone},#{postcode},#{user_id})")
    public Integer add(Address address);

    // 更新某个收货地址
//    @Update("update address set consigneeName = #{consigneeName}," +
//            "        consigneeAddress=#{consigneeAddress},consigneePhone=#{consigneePhone}," +
//            "        postcode=#{postcode}" +
//            "        where id = #{id}")
    public Integer update(Address address);

    // 删除某个收货地址
//    @Delete("delete from address where id = #{id}")
    public Integer delete(Integer id);
}
