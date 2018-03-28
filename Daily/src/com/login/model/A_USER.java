package com.login.model;


   /**
    * A_USER 实体类
    * Tue Mar 27 10:46:51 CST 2018 wyd
    */ 


public class A_USER {
		/**
		* 		*/ 
	private String pwd;
		/**
		* 		*/ 
	private String username;
		/**
		* 		*/ 
	private String id;
	public void setPwd(String pwd){
	this.pwd=pwd;
	}
	public String getPwd(){
		return pwd;
	}
	public void setUsername(String username){
	this.username=username;
	}
	public String getUsername(){
		return username;
	}
	public void setId(String id){
	this.id=id;
	}
	public String getId(){
		return id;
	}
}

