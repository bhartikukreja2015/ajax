

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NameSuggestServlet
 */
@WebServlet("/NameSuggestServlet")
public class NameSuggestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	String cities[]={"broda","bareli","bahdurgarh","bhiwani","bihar","bangistan","bhopal"};
	System.out.println("servlet");
	try
	{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String suggestions="";
		String city_name=request.getParameter("city_n");
		System.out.println(city_name);
		if(city_name.length()>0)
		{
			for(int i=0;i<cities.length;i++)
			{
				if(cities[i].toUpperCase().startsWith(city_name.toUpperCase()))
				{
					suggestions=suggestions+cities[i]+"<br>";
				}
			}
			out.println(suggestions);
			
		}
	}catch(Exception e)
	{
		e.printStackTrace();
	}
		// TODO Auto-generated method stub
	}

}
