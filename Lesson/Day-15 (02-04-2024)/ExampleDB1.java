package com.db;

// Step-1
import java.sql.*;

public class ExampleDB1 {

	public static void main(String[] args) {
		try {
			// Step-2
			Class.forName("org.gjt.mm.mysql.Driver");
			
			// Step-3
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","");
			
			// Step-4
			Statement stmt = conn.createStatement();
			
			// Step-5
			ResultSet rs = stmt.executeQuery("SELECT c.con_id,c.con_name,c.mobile_no1,t.cat_name,l.loc_name FROM contact AS c LEFT JOIN category AS t ON t.cat_id=c.cat_id LEFT JOIN location AS l ON l.loc_id=c.loc_id");
			
			// Step-6
			while(rs.next()) {
				System.out.print(rs.getString(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.print(rs.getString(5)+"\r\n");
			}

			// Step-7
			rs.close();
			stmt.close();
			conn.close();
		} catch(ClassNotFoundException e) {
		} catch(SQLException e) {
		}

	}

}
