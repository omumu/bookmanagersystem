package com.java.model;
/**
 * 图书类实体
 * @author 高 木木
 *
 */
public class booktype {
 private int id;
 private String bookTypeName;
 private String bookTypeDesc;
 
 
 
public booktype() {
	super();
	// TODO Auto-generated constructor stub
}



public booktype(String bookTypeName, String bookTypeDesc) {
	super();
	this.bookTypeName = bookTypeName;
	this.bookTypeDesc = bookTypeDesc;
}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookTypeName() {
	return bookTypeName;
}
public void setBookTypeName(String bookTypeName) {
	this.bookTypeName = bookTypeName;
}
public String getBookTypeDesc() {
	return bookTypeDesc;
}
public void setBookTypeDesc(String bookTypeDesc) {
	this.bookTypeDesc = bookTypeDesc;
}
 
	
	 
}
