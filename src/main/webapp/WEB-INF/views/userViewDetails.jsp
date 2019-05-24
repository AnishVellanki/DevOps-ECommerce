<%@page import="com.ani.model.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="userHeader.jsp" %>
<%@include file="userViewSinglePro.jsp" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table  border="2">
<tr>
<th>
ProductsId
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
Images
</th>
<th>
Add to cart
</th>
<th>
Buy Now
</th>

</tr>
<tr>
<td>${pr.productId}</td>
<td>${pr.productName}</td>
<td>${pr.productDescription}</td>
<td>${pr.productPrice}</td>
<td><img alt="img" src="resources/product-images/${pr.productId}.jpg" height="50" width="50" /></td>
<td><a href=addtocart?proId=${pr.productId}>Add to cart</a></td>
<td><a href=#?proId=${pr.productId}>Buy Now</a></td>
</tr>




</table>


</body>
</html>
