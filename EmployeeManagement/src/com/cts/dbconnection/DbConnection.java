package com.cts.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
private static String username="sa";
private static String password="";
//jdbc:h2:tcp://localhost/~/test
private static String url="jdbc:h2:~/empmanagedb";
private static String driver="org.h2.Driver";
private DbConnection() {
	
}
public static Connection getconnection() {
	//load driver
	try {
		Class.forName(driver);
		return DriverManager.getConnection(url,username, password);
		
	} catch (ClassNotFoundException | SQLException e) {
		
		return null;
	}
}
}

