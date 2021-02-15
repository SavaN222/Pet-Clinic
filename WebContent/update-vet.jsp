<jsp:include page="/include/header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>UPDATE VET</h1>
<a href="VetControllerServlet" class="display-4 text-info">Go back</a>
	
	<form action="VetControllerServlet" method="POST">
	
	<input type="hidden" name="command" value="UPDATE">
	<input type="hidden" name="id" value="${VET.id}"/>
		
		<div class="form-group">
	    <label for="firstName">First Name</label>
	    <input type="text" name="firstName" class="form-control" id="firstName" value="${VET.firstName}">
	  </div>
	  
	  <div class="form-group">
	    <label for="lastName">Last Name</label>
	    <input type="text" name="lastName" class="form-control" id="lastName" value="${VET.lastName}">
	  </div>
		
	  <div class="form-group">
	    <label for="exampleInputEmail1">Email address</label>
	    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value="${VET.email}">
	    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
	  </div>
	  
	  	<div class="form-group">
	    <label for="passsword">Password:</label>
	    <input type="password" value="${VET.password}" name="password" class="form-control" id="password">
	  </div>
	  <input type="submit" class="btn btn-primary" value="SUBMIT">
	</form>






<jsp:include page="/include/close.jsp" />