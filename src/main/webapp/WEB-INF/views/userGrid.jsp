<%@page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="userHeader.jsp" %>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container">

<br>  <p class="text-center">More bootstrap 4 components on <a href="http://bootstrap-ecommerce.com/"> Bootstrap-ecommerce.com</a></p>
<hr>




<div class="row">
<c:forEach items="${proList}" var="pro">
<div class="col-md-4">
	<figure class="card card-product">
		<div class="img-wrap"><img src="resources/product-images/${pro.productId}.jpg" height="100" width="200"></div>
		<figcaption class="info-wrap">
				<h4 class="title"> ${pro.productName} </h4>
				<p class="desc"> ${pro.productDescription}</p>
				<div class="rating-wrap">
					<div class="label-rating">132 reviews</div>
					<div class="label-rating">154 orders </div>
				</div> <!-- rating-wrap.// -->
		</figcaption>
		<div class="bottom-wrap">
			<a href="viewDetails?proId=${pro.productId}" class="btn btn-sm btn-primary float-right">View Details</a>	
			<div class="price-wrap h5">
				<span class="price-new"> ${pro.productPrice}</span> <del class="price-old">$750</del>
			</div> <!-- price-wrap.// -->
		</div> <!-- bottom-wrap.// -->
	</figure>
</div> <!-- col // -->
</c:forEach>
</div> 
<!--container.//-->

<br><br><br>
<article class="bg-secondary mb-3">  
<div class="card-body text-center">
    <h4 class="text-white">HTML UI KIT <br> Ready to use Bootstrap 4 components and templates </h4>
<p class="h5 text-white"> for Ecommerce, marketplace, booking websites 
and product landing pages</p>   <br>
<p><a class="btn btn-warning" target="_blank" href="http://bootstrap-ecommerce.com/"> Bootstrap-ecommerce.com  
 <i class="fa fa-window-restore "></i></a></p>
</div>
<br><br><br>
</article>