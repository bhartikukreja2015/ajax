var req;
function sendRequest(jobList)
{
	if(window.XMLHttpRequest)
		{
		req=new XMLHttpRequest();
		}
	else if(window.ActiveXObject)
		{
		req=new ActiveXObject("Microsoft.XMLHTTP");
		}
	var url="EmployeeSuggestServlet?jobList="+jobList;
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
		
		document.getElementById("emp_details").innerHTML=req.responseText;
		}
	}

}