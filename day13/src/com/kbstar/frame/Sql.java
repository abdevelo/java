package com.kbstar.frame;

public class Sql {
	
	//Cust SQL
	public static String deleteSql = "DELETE FROM cust WHERE id = ?";
	public static String insertSql = "INSERT INTO cust VALUES(?,?,?,?)";	
	public static String selectSql = "SELECT * FROM cust WHERE id = '?'";
	public static String selectAllSql = "SELECT * FROM cust ";
	public static String updateSql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?";

	//Item DML
	public static String itemDeleteSql = "DELETE FROM item WHERE id=?";
	public static String itemInsertSql = "INSERT INTO item VALUES (?,?,?,?,SYSDATE)"; 
	public static String itemSelectSql = "SELECT * FROM item WHERE id=?";
	public static String itemSelectAllSql = "SELECT * FROM item"; 
	public static String itemUpdateSql = "UPDATE item SET name=?,price=?,rate=? WHERE id=?;"; 

}
