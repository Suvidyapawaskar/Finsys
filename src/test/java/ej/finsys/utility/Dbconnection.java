package ej.finsys.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbconnection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("1");
    Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/finsys","root","admin");
	System.out.println("2");
	Statement st=conn.createStatement();
	System.out.println("3");
	ResultSet res= st.executeQuery("select * from cities");
	while(res.next())
	{
		System.out.println(res.getString("cityname"));
	}
	

	}
 
}
