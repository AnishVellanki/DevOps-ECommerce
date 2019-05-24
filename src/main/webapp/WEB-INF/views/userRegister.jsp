<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sform" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sform:form action="addregdata" method="post" modelAttribute="reg">
 <sform:input  path="userName" placeholder="User Name"  />
<sform:input  path="email" placeholder="Email Id"  />
<sform:input  path="password" placeholder="Password"  />
<sform:input  path="mobileNo" placeholder="Mobile Number"  />
<sform:input  path="address" placeholder="Address"  />
<input type="submit"  value="Register" class="btn" />
</sform:form>
</body>
</html>