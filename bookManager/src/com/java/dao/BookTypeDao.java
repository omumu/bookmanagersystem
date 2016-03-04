package com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java.model.booktype;
import com.java.util.stringutil;


/**
 * 图书类别数据访问对象
 * @author 高 木木
 *
 */
public class BookTypeDao {
   public int add(Connection con,booktype booktype)throws Exception{
	  String sql="insert into t_bookType values(null,?,?)";
	  PreparedStatement pstmt=con.prepareStatement(sql);
	  /**
	   * 设置问号的值
	   */
	  pstmt.setString(1, booktype.getBookTypeName());
	  pstmt.setString(2, booktype.getBookTypeDesc());
	  
	   return pstmt.executeUpdate();
	   
 
}
   /**
    * 查询图书类别集合
    * @param con
    * @param booktype
    * @return
    * @throws Exception
    */
   public ResultSet list(Connection con,booktype booktype)throws Exception{
	   StringBuffer sb=new StringBuffer("select *from t_booktype");
	 if(stringutil.nota(booktype.getBookTypeName())){
		 
		 sb.append(" and bookTypeName like '%"+booktype.getBookTypeName()+"%'");
		 
	 }
	 
	 PreparedStatement pstmt=con.prepareStatement(sb.toString().replaceFirst("and", "where")) ;
	return pstmt.executeQuery();   
   }
	
}
