package com.java.util;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

/**
 * 数据库工具类
 * @author 高 木木
 *
 */
public class DbUtil {
   private   String url="jdbc:mysql://localhost:3306/db_book";
   private   String user="root";
   private   String password="root";
   private   String driver="com.mysql.jdbc.Driver";
   
   public Connection getCon() throws Exception{
	  Class.forName(driver);
	 Connection con=(Connection) DriverManager.getConnection(url, user,password);
	  return con;
	    }
  public void closeCon(java.sql.Connection con)throws Exception{
	  if(con!=null)
	  {
		  con.close();
	  }
  }
   public static void main(String[] args) {
	  DbUtil  dbutil=new  DbUtil();
	  try {
		dbutil.getCon();
		System.out.println("数据库连接成功！");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
