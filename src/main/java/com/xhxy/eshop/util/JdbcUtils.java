package com.xhxy.eshop.util;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.util.Properties;

public class JdbcUtils {
//	// 静态方法：查找并返回数据源对象
//		public static DataSource getDataSource() {
//			DataSource dataSource = null;
//
//			try {
//				Context context = new InitialContext();
//				dataSource = (DataSource)context.lookup("java:comp/env/jdbc/eshopDS");
//			} catch (NamingException e) {
//				e.printStackTrace();
//			}
//			return dataSource;
//		}
//
//		// 静态方法：返回连接对象
//		public static Connection getConnection() {
//			DataSource dataSource = getDataSource();	// 调用上面的静态方法，获取数据源对象
//			Connection conn = null;
//
//			try {
//				conn = dataSource.getConnection();		// 获得到数据源的连接
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			return conn;	// 返回连接
//		}

    public static Connection getConnection() throws Exception {
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/eshop";

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "yk20010924yk");

        return driver.connect(url, properties);
    }

//    @Test
//    public void test() throws Exception {
//        Connection connection = JdbcUtils.getConnection();
//        System.out.println(connection);
//    }

}
