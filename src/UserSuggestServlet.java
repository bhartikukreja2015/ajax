

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDaoAjax;

/**
 * Servlet implementation class UserSuggestServlet
 */
@WebServlet("/UserSuggestServlet")
public class UserSuggestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserDaoAjax uRef;
		try
		{
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			String suggestions="user name already exists try new one.";
			String user_name=request.getParameter("user_n");
			System.out.println(user_name);
			if(user_name.length()>0)
			{
				uRef=new UserDaoAjax();
				int check=uRef.See(user_name);
				System.out.println(check);
				if(check==1)
				{
				out.println(suggestions);
				//System.out.println(suggestions);
			
				}
				else
				{
					out.println("new user");
					//System.out.println("new user");
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			// TODO Auto-generated method stub
		}	

}
