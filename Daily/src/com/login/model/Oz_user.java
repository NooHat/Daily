package com.login.model;

import base.model.BaseModel;

   /**
    * oz_user 实体类
    * Tue Nov 07 14:23:20 CST 2017 wyd
    */ 


public class Oz_user extends BaseModel{
		/**
		* 用户名		*/ 
	private String name;
		/**
		* 密码		*/ 
	private String pwd;
	public void setName(String name){
	this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPwd(String pwd){
	this.pwd=pwd;
	}
	public String getPwd(){
		return pwd;
	}
}

