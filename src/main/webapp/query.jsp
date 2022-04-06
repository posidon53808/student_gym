<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List" import="Dao.studentDao" 
    import="Model.student"%>

<%
String id=request.getParameter("id");
student[] s=null;
if(id==""||id==null)
{
	List<Object> l=new studentDao().queryAll();
	s=l.toArray(new student[l.size()]);
	
}else
{ 	int I=Integer.parseInt(id);
	s= new student[1];
	s[0]=(student)(new studentDao().queryId(I));
	}
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>查詢頁面</title>
</head>
<body>
<h1>器材借用查詢</h1>
<hr>
<form action="query.jsp" method="post">
id編號<input type="text" name="id">
<input type="submit" value="ok">
</form>

<table width=600 border=1>
<tr>
	<td>id<td>房號<td>學號<td>借用的器材<td>借用時的時間
	
	<%
	for(int i=0;i<s.length;i++){
		out.println("<tr><td>"+s[i].getId()+
					"<td>"+s[i].getRoomNumber()+
					"<td>"+s[i].getIdCard()+
					"<td>"+s[i].getEquipment()+
					"<td>"+s[i].getTime());
	}%>

</table>
<hr>
<a href="delete.jsp"><h4>租借器材已歸還</h4></a>
<a href="index.jsp"><strong>回首頁</strong></a>
</body>
</html>