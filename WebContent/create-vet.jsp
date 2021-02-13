<jsp:include page="/include/header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>KREIRAJ VETERINARE</h1>

<form action="VetControllerServlet" method="POST">
	
	<input type="hidden" name="command" value="ADD">
		
		<div class="form-group">
	    <label for="firstName">First Name</label>
	    <input type="text" name="firstName" class="form-control" id="firstName" placeholder="First Name">
	  </div>
	  
	  <div class="form-group">
	    <label for="lastName">Last Name</label>
	    <input type="text" name="lastName" class="form-control" id="lastName" placeholder="Last Name">
	  </div>
		
	  <div class="form-group">
	    <label for="exampleInputEmail1">Email address</label>
	    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
	    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
	  </div>
	  
	  	<div class="form-group">
	    <label for="passsword">Password:</label>
	    <input type="password" name="password" class="form-control" id="password">
	  </div>
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form>






<jsp:include page="/include/close.jsp" />