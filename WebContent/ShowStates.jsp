<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*, java.io.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		System.out.println("Connecting to Database");
		String cname=request.getParameter("cname");
		System.out.println("Country name obtained "+cname);
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
		PreparedStatement pstmt = conn.prepareStatement("select states.name from country join states on country.cid=states.cid where country.name=?");
		pstmt.setString(1,cname);
		ResultSet rs=pstmt.executeQuery();
		PrintWriter output=response.getWriter();
		output.write("<select>");
		while(rs.next()){
			output.write("<option>");
				System.out.println(rs.getString(1));
				output.write(rs.getString(1));
			output.write("</option>");
		}
		output.write("</select>");
		conn.close();
	%>

</body>
</html></html>