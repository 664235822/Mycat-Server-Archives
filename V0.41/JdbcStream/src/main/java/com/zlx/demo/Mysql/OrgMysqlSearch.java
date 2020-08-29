package com.zlx.demo.Mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * 创建一个数据库users，里面创建一个表device,device表字段为：
 * id int;device_id varchar
 * 基于https://github.com/zhailuxu/JdbcStream 修改
 *
 */
public class OrgMysqlSearch {
	private static final String  url = "jdbc:mysql://127.0.0.1:8066/dbtest?useSSL=false";
	private static final String   userName = "root";
	private static final String   pwd = "iwhalecloud@2018";
	public static void main(String[] args) throws Exception {

		
        //1创建对象
		DataSourceService dataSourceService = new DataSourceService();
		dataSourceService.init(url, userName, pwd);
		
		
		dataSourceService.selectMultiClient(3);
		
		//用于结束后不退出，打断点
		//if(true)return;
        

		
	}
}
