<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" href="/resources/style.css">
</head>
<body>
<%--  <%
 Object userid = (String)session.getAttribute("dest");
if(userid == null) {%> --%>
  	<div style="float: right;"><a href="/user/login">로그인</a>
	<a href="/user/sign">회원가입</a></div>
<%--    <% } else {%>
  	  님 환영합니다. 
  <%} %> --%>

<br>
<h1>Made By Myself</h1>
<div style="text-align: center;">
<ul>
  <li><a href="/qna/index">HOME</a></li>  
  <li><a href="/qna/workbooklist  ">문제집 목록</a><li>
  <li><a href="/qna/Go_SolveContent">문제집 풀기</a></li>
  <li><a href="/qna/Go_RankContent">문제집 순위</a><li>
</ul>
</div>
</body>
</html>
    
    

