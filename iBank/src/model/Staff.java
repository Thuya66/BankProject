package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.DBController;
import model.service.StaffService;

import com.mysql.jdbc.Statement;

public class Staff {
	
	private String staffid;
	private String rankid;
	private String staffname;
	private String department;
	private String password;
	StaffService sService=new StaffService();
	
	public Staff(String rankid,String staffname,String department,String password)
	{
		
		
	}
	
	public Staff(String staffid)
	{
		
	}
	
	public boolean isExist() throws SQLException
	{
		return false;
	}

}
