package com.clyao.snatch.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author clyao
 * @time：2015-11-16 15:00
 * @version 1.0v
 * @descriptiom 连接数据库的工具类
 */
public class DBOperation {

	// 连接数据库
	public static Connection getConn() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection dbConn = DriverManager.getConnection("jdbc:sqlite:db/swingsnatch.db");
			System.out.println("sqlite连接成功！");
			return dbConn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//创建表
	public static void createTable(String tableName, String[] fields){
		try {
			Connection connection = getConn();
			Statement statement = connection.createStatement();
			
			StringBuffer dropSql = new StringBuffer();
			dropSql.append("drop table if exists ");
			dropSql.append(tableName);
			dropSql.append(";");
			
			StringBuffer createSql = new StringBuffer();
			createSql.append("create table ");
			createSql.append(tableName);
			createSql.append(" (");
			for(int i=0; i<fields.length; i++){
				createSql.append(fields[i]);
				if(fields.length!=1){
					if((fields.length-1)==i){
						
					}else{
						createSql.append(", ");
					}
				}
			}
			createSql.append(");");
			
			System.out.println(dropSql.toString());
			System.out.println(createSql.toString());
			statement.executeUpdate(dropSql.toString());  
			statement.executeUpdate(createSql.toString()); 
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}  
	}
	
	//插入数据
	public static void insertData(String tableName, String[] data){
		try {
			Connection connection = getConn();
			Statement statement = connection.createStatement();
			
			StringBuffer insertSql = new StringBuffer();
			insertSql.append("insert into ");
			insertSql.append(tableName);
			insertSql.append(" values (");
			for(int i=0; i<data.length; i++){
				insertSql.append("'" +data[i]+ "'");
				if(data.length!=1){
					if((data.length-1)==i){
						
					}else{
						insertSql.append(", ");
					}
				}
			}
			insertSql.append(");");
			
			System.out.println(insertSql.toString());
			statement.executeUpdate(insertSql.toString());
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//查询数据
	public static ResultSet queryData(String tableName){
		try {
			Connection connection = getConn();
			Statement statement = connection.createStatement();
			
			StringBuffer querySql = new StringBuffer();
			querySql.append("select * from ");
			querySql.append(tableName);
			querySql.append(";");
			
			System.out.println(querySql.toString());
			ResultSet resultSet = statement.executeQuery(querySql.toString());
            resultSet.close();  
            connection.close();
            return resultSet;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
