package com.cts.est;

import com.cts.dbconnection.DbConnection;

public class Dbconnectiontest {
public static void main(String[] args) {
	if(DbConnection.getconnection()!=null)
		System.out.println("Connection Established");
}
}

