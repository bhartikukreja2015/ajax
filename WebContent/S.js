var req;
function sendRequest(cname)
{
	if(window.XMLHttpRequest)
		{
		req=new XMLHttpRequest();
		}
	else if(window.ActiveXObject)
		{
		req=new ActiveXObject("Microsoft.XMLHTTP");
		}
	var url="NameSuggestServlet?city_n="+cname;
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
		//alert("hi");
		document.getElementById("city_suggest").innerHTML=req.responseText;
		}
	}

}