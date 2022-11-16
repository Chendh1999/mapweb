package com.cc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class MapwebApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() throws SQLException {
		//查看一下默认数据源
		System.out.println(dataSource.getClass());

		//获得数据库连接
		Connection connection=dataSource.getConnection();
		System.out.println("测试成功！"+connection);

		//关闭
		connection.close();
	}

}
