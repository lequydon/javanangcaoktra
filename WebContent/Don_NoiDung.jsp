<%@page import="java.util.ArrayList"%>
<%@page import="Don_bean.TinTucBean"%>
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
<main style="margin-top: 60px;">
<a href="Don_TinTuc.jsp" style="margin-bottom:10px"><< Quay Lại</a>
<%
ArrayList<TinTucBean> noidung=new ArrayList<TinTucBean>();
noidung=(ArrayList<TinTucBean>)request.getAttribute("noidung");
%>
	<h2 style="text-align:center"><%=noidung.get(0).getTieude() %></h3>
	<p style="text-align:center"><%=noidung.get(0).getNoidung() %></p>
<%
%>
</main>
</header>
</body>
</html>