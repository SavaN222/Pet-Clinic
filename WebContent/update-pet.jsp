<jsp:include page="/include/header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>UPDATE PET</h1>
<a href="VetControllerServlet" class="display-4 bg-info">Go back</a>

<form action="PetControllerServlet" method="POST" enctype="multipart/form-data">
	
	<input type="hidden" name="command" value="UPDATE">
	<input type="hidden" name="id" value="${PET.id}"/>
	<input type="hidden" name="categoryId" value="${PET.categoryId}"/>
		
		<div class="form-group">
	    <label for="name">Name</label>
	    <input type="text" name="name" class="form-control" id="name" value="${PET.name}">
	  </div>
	  
	  <div class="form-group">
	    <label for="img">Img</label>
	    <input type="text" name="img" class="form-control" id="img" value="novi naziv slike">
	  </div>
		
	  <div class="form-group">
	    <label for="age">Age</label>
	    <input type="number" name="age" class="form-control" id="age" value="${PET.age}">
	 
	  </div>
	  
	   <input type="file" name="file">
	  
	  <input type="submit" class="btn btn-primary" value="SUBMIT">
	</form>






<jsp:include page="/include/close.jsp" />