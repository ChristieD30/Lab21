<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Build your order</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/cosmo/bootstrap.min.css" rel="stylesheet" integrity="sha384-3Ivskwia8Fui5tbQi+RW4DgTkJ8d+hW7mLe7Yk89ibmD9482VECh0WFof8kIEjwI" crossorigin="anonymous">
<link rel = "stylesheet" href = "main.css">
</head>
<body>

<div class="container">

		<h2>Search our Coffee</h2>
		<form action ="/Coffee">
			<input type = "text" value = "${brand}"  name = "brand"  placeholder ="brand">
			<input type = "submit" value = "Search" class ="btn btn-primary">
			 <c:if test = "${not empty brand}" >
			 <!--  The c:if determines whether the clear link shows on the page or not --> 
			 <a href = "Coffee" class = "btn btn-secondary">Clear</a>
			 
			 </c:if>
			 
		</form>

		<table class="table">
			<thead>
			<tr>
				<th>Brand</th>
				<th>Type</th>
				<th>Picture</th>
				<th>Price</th>
				
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${items}" var="p">
					<tr>
						<td>${p.brand}</td>
						<td>${p.description}</td>
						<td> <img src = "${p.imagePath}"></td>
						<td>${p.price}</td>
						<td><a class = "btn btn-primary" href ="/add?id=${p.id}">Add to cart</a></td>
				
					</tr>

				</c:forEach>
			</tbody>
		</table>
</div>

		<!-- <a href = "/form" class ="btn btn-primary">Add</a> -->
		
		

<!-- <div class="container">

  <img src="https://tinyurl.com/yckrgejf" width="200" height="40" alt="Avatar" class="image">
  <div class="middle">
    <div class="text">Detroit Bold Traditional $12.99</div>
    <button type="button" class="btn btn-primary">Add to Cart</button>
  </div>
</div>
<div class="container">
  <img src="https://static1.squarespace.com/static/54bdd7fae4b05e8a364beebb/54bdd924e4b0d1f230df925e/59d271aecd39c3896d128800/1506963909799/Helios.jpg?format=500w" alt="Avatar" class="image" width="200" height="40">
  <div class="middle">
    <div class="text">Hyperion Coffee $14.99</div>
    <button type="button" class="btn btn-primary">Add to Cart</button>
  </div>
</div>
<div class="container">
  <img src="https://images-na.ssl-images-amazon.com/images/I/61vWH8gMoDL._SX679_.jpg" alt="Avatar" class="image" width="200" height="40">
  <div class="middle">
    <div class="text">Great Lakes Coffee French Roast $15.99</div>
    <button type="button" class="btn btn-primary">Add to Cart</button>
  </div>
</div>



   <button type="button" class="btn btn-primary">Checkout</button>
 -->

</body>
</html>