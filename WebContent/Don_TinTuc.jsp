<%@page import="Don_bean.TinTucBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
</head>
<body>
<header>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
	  <a class="navbar-brand" href="#">Logo</a>
	  <ul class="navbar-nav">
	    <li class="nav-item">
	      <a class="nav-link" href="#">Link</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="#">Link</a>
	    </li>
	  </ul>
	</nav>
</header>
<main>
<%
%>
<form action="TinTucController" style="margin-top: 60px; type="GET>
      		<input type="text" placeholder="Search.." name="search">
      		<button type="submit">tìm kiếm</button>
 </form>
<table>
  <tr>
    <th>Tiêu Đề</th>
    <th style="width:100px">Ngày Đưa tin</th>
    <th>Tóm Tắt</th>
    <th style="width:100px">Link chi tiếtt</th>
  </tr>
  <%
	if(request.getAttribute("listtintuc")!=null){
	ArrayList<TinTucBean> list=null;
	list=(ArrayList<TinTucBean>)request.getAttribute("listtintuc");
	for(int i=0;i<list.size();i++){
		%>
		  <tr>
		    <td><%=list.get(i).getTieude() %></td>
		    <td><%=list.get(i).getNgayduatin() %></td>
		    <td><%=list.get(i).getTomtat() %></td>
		    <td><a href="NoiDungController?matintuc=<%=list.get(i).getMatintuc()%>">link chi tiết</a></td>
		  </tr>
		<%
	}
}
	else
		response.sendRedirect("TinTucController");
	%>
</table>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
  margin-top: 10px;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</main>
</body>
</html>