package com.xhxy.eshop.service.impl.mybatis;

import com.xhxy.eshop.entity.Address;
import com.xhxy.eshop.mapper.AddressMapper;
import com.xhxy.eshop.service.AddressService;
import com.xhxy.eshop.util.MybatisUtils;

import java.util.List;

public class AddressServiceImpl implements AddressService {


    AddressMapper mapper = MybatisUtils.getSession().getMapper(AddressMapper.class);


    @Override
    public List<Address> findByUserId(Integer userId) {
        return mapper.findByUserId(userId);
    }

    @Override
    public Address findById(Integer id) {
        return mapper.findById(id);
    }

    // 为某个用户增加收货地址
    @Override
    public int add(Address address) {
        return mapper.add(address);
    }

    // 更新某个收货地址
    @Override
    public int update(Address address) {
        return mapper.update(address);
    }

    // 删除某个收货地址
    @Override
    public int delete(Integer id) {
        return mapper.delete(id);
    }


}
