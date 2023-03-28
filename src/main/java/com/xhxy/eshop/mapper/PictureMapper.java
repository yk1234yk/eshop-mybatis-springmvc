package com.xhxy.eshop.mapper;

import com.xhxy.eshop.entity.Picture;

import java.util.List;

public interface PictureMapper {

	public List<Picture> findByProductId(Integer productId);
}
