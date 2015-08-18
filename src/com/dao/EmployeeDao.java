package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.Employee;

public class EmployeeDao 
{
	PreparedStatement psRef=null;
	//	Statement psRef;
	DBFactory dbRef;
	Connection conRef;
		public EmployeeDao() 
		{
		dbRef=new DBFactory();
		conRef=dbRef.oracelconn();
		}
		public ArrayList<Employee> getEmployees(String jobList)
		{
			ArrayList<Employee> empList=new ArrayList<Employee>();
			try 
			{
				psRef=conRef.prepareStatement("select * from employees where job_id=?");
				//psRef=conRef.createStatement();
				
				psRef.setString(1,jobList);
				
				ResultSet res=psRef.executeQuery();
				if(res.next())
				{
					System.out.println("successfull");
					Employee e=new Employee(res.getString(2),res.getString(3),res.getInt(1),res.getFloat(8));
					empList.add(e);
					System.out.println("successfull"+empList.size());
				}
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		return empList;
		}

}
