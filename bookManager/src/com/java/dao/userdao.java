package com.java.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java.model.user;
import com.mysql.jdbc.Connection;


public class userdao {
	/**
	 * µÇÂ½ÑéÖ¤
	 * @param con
	 * @param user
	 * @return
	 * @throws Exception
	 */
     public user login(java.sql.Connection con,user user) throws Exception{
    	  user resultuser=null;
    	  String sql="select *from t_user where username=?and password=?";
    	  PreparedStatement pstmt=con.prepareStatement(sql);
    	  pstmt.setString(1, user.getUsername());
    	  pstmt.setString(2, user.getPassword());
    	  ResultSet rs=pstmt.executeQuery();
    	  if(rs.next()){
    		  resultuser=new user();
    		  resultuser.setId(rs.getInt("id"));
    		  resultuser.setUsername(rs.getString("username"));
    		  resultuser.setPassword(rs.getString("password"));
    		  
    	  }
    	  return resultuser;
    	  
    	 
    	 
    	 
     }
}
