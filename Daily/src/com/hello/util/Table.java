package com.hello.util;

import java.util.ArrayList;
import java.util.List;



public class Table
{
	//表名
	private String name;
	//表注释
	private String comment;
	//表属性（列Column）的列表
	private List columns = new ArrayList();;
	
	public List getColumns(){
		return columns;
	}
	
	public void addColumn(Column column){
		columns.add(column);
	}

	public String getComment()
	{
		return comment;
	}

	public void setComment(String comment)
	{
		this.comment = comment;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}

