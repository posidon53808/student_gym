<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首頁</title>
</head>
<body>
<h1 align="center">宿舍器材借用</h1>

<form action="addController" method="post">

<table width=500 border=1 align="center">
<h4 align="center">
現在時間：<%= java.util.Calendar.getInstance().getTime() %><br>
</h4>
<tr><td width=450 align="center">房號(棟別+房號)：<input type="text" name="roomNumber">
<tr><td  width=450 align="center">學生證號：<input type="text" name="idCard">
<tr><td  width=450 align="center">想借用的器材：<input type="text" name="equipment">
<tr><td  width=450 align="center">(想借用的器材請輸入編號)
<tr><td  width=450 align="center">租借時間(EX:13:15)：<input type="text" name="time">
<tr><td align=center><input type="submit" value="ok">

</table>
<hr>
<div align="center"><strong>可借用的器材(請輸入編號)</strong>
<p>1.桌球(一顆球兩個拍子)</p>
<p>2.撞球(一組球兩個桿子)</p>
<p>3.羽毛球(一顆球兩個拍子)</p>
<p>4.跑步機</p>
<p>5.坐式腳踏車機</p>
<p><strong>注意事項</strong></p>
<p>一次借用時間一個小時為限，如需要續借請再次登記</p>
<a href="query.jsp"><strong>器材借用查詢</strong></p></a>
</div>






</form>
</body>
</html>