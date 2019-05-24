<%@page import="com.ani.model.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
    <%@page isELIgnored="false" %>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
   
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1>Show Category Data</h1>
<table  border="1">
<tr>
<th>
CategoryId
</th>
<th>
CategoryName
</th>
<th>
CategoryDescrption
</th>
<th>
Edit
</th>
<th>
Delete
</th>
</tr>
<c:forEach var="cat" items="${catList}">
<tr>
<td>${cat.categoryId}</td>
<td>${cat.categoryName}</td>
<td>${cat.categoryDescription}</td>
<td><a href="edit?catId=${cat.categoryId}">Edit</a></td>
<td><a href="del?catId=${cat.categoryId}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>