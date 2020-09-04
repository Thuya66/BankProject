package model.service;

import java.sql.*;
import java.util.ArrayList;

import controller.DBController;
import model.Staff;

public class StaffService {
	
	private Statement stmt;
	private ResultSet rs;
	private Connection con;
	private String query;
	private Staff staff;
	
	private DBController db=new DBController();
	
	private String getStaffId() throws SQLException
	{
		String prefix="staff-";
		String staffid="";
		
		stmt=con.createStatement();
		query="select * from staff";
        rs=stmt.executeQuery(query);
        
		int current;
		try {
			while(rs.next())
			{
				staffid=rs.getString(1).toString();
			}
			if(""!=staffid)
			{
				current = Integer.parseInt(staffid.substring(7,10))+1;
				if(current>0 && current<=9) { return prefix + "00"+current;}
				else if(current>9 && current<=99) { return prefix + "0"+current;}
				else if(current>99 && current<=999) { return prefix + current;}
			}
		}catch (SQLException ex) {
			System.out.println("Error : Staff Autoid " + ex);
		}
		return prefix+"001";
	}

	public void insertStaff(String rankid, String staffname, String department, String password) throws SQLException {
		String StaffId=getStaffId();
		try {
			PreparedStatement st = this.db.getAccessControl().prepareStatement("INSERT INTO staff (staffid, rankid, staffname, department, password)"
			        + " VALUES (?, ?, ?, ?, ?);");

			st.setString(1, StaffId);
			st.setString(2, rankid);
			st.setString(3, staffname);
			st.setString(4, department);
			st.setString(4, password);
			st.executeUpdate();		
			st.close();			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}
