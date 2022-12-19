package dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtils {
	public JdbcUtils() {
	}

	public static Connection createConnection() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentexam","root", "");
		System.out.println("成功连接啦");
		System.out.println("成功连接啦");
		return con;
	}
}
