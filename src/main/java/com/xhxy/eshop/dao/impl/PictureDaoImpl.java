package com.xhxy.eshop.dao.impl;

import com.xhxy.eshop.dao.PictureDao;
import com.xhxy.eshop.entity.Picture;
import com.xhxy.eshop.util.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PictureDaoImpl implements PictureDao {

	@Override
	public List<Picture> findByProductId(Integer productId) {
		String sql = "select * from picture where product_id=?";
		try(
				Connection conn = JdbcUtils.getConnection();//JdbcUtils的静态方法
				PreparedStatement pstmt = conn.prepareStatement(sql)
					)
			{
				pstmt.setInt(1, productId);
				ResultSet rs = pstmt.executeQuery();
				if(rs != null ) {
					ArrayList<Picture> pics = new ArrayList<Picture>();
					while(rs.next()) {
						Picture pic = new Picture();
						pic.setId(rs.getInt("id"));
						pic.setFile(rs.getString("file"));
						pics.add(pic);
					}
					return pics;
				}
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			return null;
	}

}
