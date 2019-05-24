<%@page import="com.ani.model.Supplier"%>
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
<h1>Show Products Data</h1>
<table  border="1">
<tr>
<th>
ProductId
</th>
<th>
ProductName
</th>
<th>
ProductDescrption
</th>
<th>
ProductPrice
</th>
<th>
ProductCategory
</th>
<th>
ProductSupplier
</th>
<th>
Images
</th>
<th>
Edit
</th>
<th>
Delete
</th>
</tr>
<c:forEach var="pro" items="${proList}">
<tr>
<td>${pro.productId}</td>
<td>${pro.productName}</td>
<td>${pro.productDescription}</td>
<td>${pro.productPrice}</td>
<td>${pro.productCategory}</td>
<td>${pro.productSupplier}</td>
<td><img alt="img" src="resources/product-images/${pro.productId}.jpg" height="50" width="50"/></td>
<td><a href="editPro?proId=${pro.productId}">Edit</a></td>
<td><a href="delPro?proId=${pro.productId}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>