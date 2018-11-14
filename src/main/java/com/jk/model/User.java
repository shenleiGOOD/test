/** 
 * <pre>项目名称:testspringboot 
 * 文件名称:User.java 
 * 包名:com.jk.model 
 * 创建日期:2018年11月12日下午8:13:13 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import java.io.Serializable;

/** 
 * <pre>项目名称：testspringboot    
 * 类名称：User    
 * 类描述：    
 * 创建人：申磊    
 * 创建时间：2018年11月12日 下午8:13:13    
 * 修改人：申磊 
 * 修改时间：2018年11月12日 下午8:13:13    
 * 修改备注：       
 * @version </pre>    
 */
public class User implements Serializable{

private String id;
private String name;
private String password;
private String typeid;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getTypeid() {
	return typeid;
}
public void setTypeid(String typeid) {
	this.typeid = typeid;
}
}
