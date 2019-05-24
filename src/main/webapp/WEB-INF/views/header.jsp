<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="#">Logo</a>

  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="home">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="about">About Us</a>
    </li>
<li class="nav-item">
      <a class="nav-link" href="contact">Contact Us</a>
    </li>
    <!-- Dropdown -->
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Categories
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="abc">Add Category</a>
        <a class="dropdown-item" href="bbc">Show Category</a>
      </div>
    </li>
  <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Suppliers
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="cbc">Add Supplier</a>
        <a class="dropdown-item" href="dbc">Show Supplier</a>  
      </div>
    </li>
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
        Products
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="ebc">Add Product</a>
        <a class="dropdown-item" href="fbc">Show Product</a>  
      </div>
    </li>
  </ul>
</nav>
<br>
  

</body>
</html>