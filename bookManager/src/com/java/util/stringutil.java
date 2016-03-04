package com.java.util;

import javax.swing.JTextField;

/**
 * 字符串工具类
 * @author 高 木木
 *
 */

public class stringutil {
   public static boolean a(String str){
	   if(str==null ||"".equals(str.trim())){
		   return true;
		   
	   }else{return false;}
	   
	   
   }
   public static boolean nota(String str){
	   if(str!=null && !"".equals(str.trim())){
		   return true;
		   
	   }else{return false;}
	   
	   
   }

	   
}
   
   
 

