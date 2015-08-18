var req;
function sendRequest(uname)
{
	if(window.XMLHttpRequest)
		{
		req=new XMLHttpRequest();
		}
	else if(window.ActiveXObject)
		{
		req=new ActiveXObject("Microsoft.XMLHTTP");
		}
	var url="UserSuggestServlet?user_n="+uname;
	req.onreadystatechange=getResponse;
	req.open("GET",url,true);
	req.send(null);


}
function getResponse()
{
if(req.readyState==4)
	{
	if(req.status==200)
		{
		
		document.getElementById("user_suggest").innerHTML=req.responseText;
		}
	}

}
