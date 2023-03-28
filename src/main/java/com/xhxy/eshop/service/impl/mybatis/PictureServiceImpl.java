package com.xhxy.eshop.service.impl.mybatis;

import com.xhxy.eshop.entity.Picture;
import com.xhxy.eshop.mapper.PictureMapper;
import com.xhxy.eshop.service.PictureService;
import com.xhxy.eshop.util.MybatisUtils;

import java.util.List;

public class PictureServiceImpl implements PictureService {

    private PictureMapper pictureMapper = MybatisUtils.getSession().getMapper(PictureMapper.class);

    @Override
    public List<Picture> findByProductId(Integer productId) {
        return pictureMapper.findByProductId(productId);
    }

}
