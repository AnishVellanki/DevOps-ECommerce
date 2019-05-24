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
<h1>Items in Cart</h1>
<table  border="1">
<tr>
<th>
CartId
</th>
<th>
ProductId
</th>
<th>
ProductName
</th>
<th>
ProductSupplier
</th>
<th>
ProductPrice
</th>
<th>
Quantity
</th>
<th>
TotalPrice
</th>
</tr>
<c:forEach var="c" items="${cartList}">
<tr>
<td>${c.cartId}</td>
<td>${c.productId}</td>
<td>${c.productName}</td>
<td>${c.productSupplier}</td>
<td>${c.productPrice}</td>
<td>${c.quantity}</td>
<td>${c.totalPrice}</td>

<td><img alt="img" src="resources/product-images/${c.productId}.jpg" height="50" width="50"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>