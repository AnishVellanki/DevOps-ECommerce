<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sform"%>
     <%@include file="header.jsp" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<sform:form action="addProduct" method="post" modelAttribute="addPro" enctype="multipart/form-data">
<h1${form}> </h1>
 <sform:input  path="productName" placeholder="Product Name"  />
  <sform:input  path="productDescription" placeholder="Product Description"  />
  <sform:input  path="productPrice" placeholder="Product Price"   />
  <sform:input path="productImage"  type="file"/>
  <sform:select path="productCategory">
  <sform:option value="productCategory">productCategory</sform:option>
  <c:forEach items="${catList}" var="cat">
  <sform:option value="${cat.categoryName}">${cat.categoryName}</sform:option>
  </c:forEach>
  </sform:select>
  <sform:select  path="productSupplier">
  <sform:option value="productSupplier">productSupplier</sform:option>
  <c:forEach items="${supList}" var="sat">
  <sform:option value="${sat.supplierName}">${sat.supplierName}</sform:option>
  </c:forEach>
  </sform:select>
  
 <sform:input  path="productId" placeholder="Product Id" cssClass="email" type="hidden"/>
<input type="submit"  value="${button}" class="btn" />
</sform:form>
</body>
</html>