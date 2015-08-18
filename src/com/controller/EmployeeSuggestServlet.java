package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDao;
import com.dao.Employee;



@WebServlet("/EmployeeSuggestServlet")
public class EmployeeSuggestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ArrayList<Employee> empList=new ArrayList<Employee>();
		EmployeeDao dRef=null;
		try
		{
			response.setContentType("text/html;charset=UTF-8");
			//PrintWriter out=response.getWriter();
			String jobList=request.getParameter("jobList");
			System.out.println(jobList);
			if(!jobList.equalsIgnoreCase("nojob"))
			{
				dRef=new EmployeeDao();
				empList=dRef.getEmployees(jobList);
				if(!empList.isEmpty())
				{
					System.out.println("reached servlet");
					request.setAttribute("listKey", empList);
					System.out.println(empList.size());
					RequestDispatcher rd=request.getRequestDispatcher("Display.jsp");
					rd.forward(request, response);
					
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
