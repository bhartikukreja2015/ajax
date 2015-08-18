<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
		function getStates(cname){
			
			/* alert("Fetching states"); */
			var xmlHttp;
			if(cname=="")
			{
				document.getElementById("res").innerHTML="";
				return;
			}
			if(window.XMLHttpRequest){
				xmlHttp=new XMLHttpRequest();
			/* 	alert("Created RequestObject"); */
			}
			else{
				
				xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
			}
			
			xmlHttp.onreadystatechange=function(){
				
				if(xmlHttp.readyState==4 && xmlHttp.status==200){
					/* alert("Changing Response"); */
					document.getElementById("res").innerHTML=xmlHttp.responseText;
				}
			}
			
			xmlHttp.open("GET", "GetStatesServlet?cname="+cname, true);
			/* alert("Opened RequestObject"); */
			xmlHttp.send();
			/* alert("Sent RequestObject"); */
				
		}

</script>


</head>
<body>
		<form action="">
			<select name="country" onchange="getStates(this.value)">
				<option value="">Choose Country</option>
				<option value="India">India</option>
				<option value="England">England</option>
				<option value="USA">USA</option>
			</select>
			
		</form>
		<div id="res">
		</div>
</body>
</html>