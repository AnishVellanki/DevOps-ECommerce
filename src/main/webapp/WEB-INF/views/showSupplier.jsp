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
<h1>Show Supplier Data</h1>
<table  border="1">
<tr>
<th>
SupplierId
</th>
<th>
SupplierName
</th>
<th>
SupplierDescrption
</th>
<th>
Edit
</th>
<th>
Delete
</th>
</tr>
<c:forEach var="sup" items="${supList}">
<tr>
<td>${sup.supplierId}</td>
<td>${sup.supplierName}</td>
<td>${sup.supplierDescription}</td>
<td><a href="editSup?supId=${sup.supplierId}">Edit</a></td>
<td><a href="delSup?supId=${sup.supplierId}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>