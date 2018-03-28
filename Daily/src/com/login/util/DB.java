package com.login.util;

import java.sql.*;;
public class DB {
	Statement stmt;
	ResultSet rs;
	
	 public Connection getConn(){
		
		Connection conn=null;
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost/basket_01?user=root&password=1thisismypwd");
		}catch(ClassNotFoundException e){
		 
		}catch(SQLException e){
			
		}
		return conn;
		
	 }
	 
	 
		 public static void main (String[]args){
			 
			 Connection conn=new DB().getConn();
			  System.out.println(conn);
			 
		 }
	 
	 
	 
	 public void execute(String sql){
		 
		 
		 
		 try{
			 
		 rs=stmt.executeQuery(sql);
		 
		 
		 }
		 catch(SQLException e){
			 
			 System.out.println("sql erorr");
		 }
		 
	 }
	 
	 public void close(){
		 
		 this.close();
		 
	 }

}
