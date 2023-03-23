package com.xhxy.eshop.dao.impl;

import com.xhxy.eshop.dao.FaqDao;
import com.xhxy.eshop.entity.Faq;
import com.xhxy.eshop.util.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FaqDaoImpl implements FaqDao {

	@Override
	public List<Faq> findAll() {
		// SQL：查询全部Faq
		String sql = "select * from faq";
		try(
			Connection conn = JdbcUtils.getConnection();	//静态方法
			PreparedStatement pstmt = conn.prepareStatement(sql)
		)
		{
			ResultSet rs = pstmt.executeQuery();
			List<Faq> faqList = new ArrayList<Faq>();
			
			while( rs.next()) {
				Faq faq = new Faq();
				faq.setId(rs.getInt("id"));
				faq.setQuestion(rs.getString("question"));
				faq.setAnswer(rs.getString("answer"));
//				System.out.println(faq.getId());
				faqList.add(faq);
			}
			return faqList;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
