<jsp:include page="/include/header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Create Category</h1>
<a href="VetControllerServlet" class="display-4 text-info">Go back</a>

<form action="CategoryControllerServlet" method="POST" autocomplete="off">
	
	<input type="hidden" name="command" value="ADD">
		
		<div class="form-group">
	    <label for="category">Category Name</label>
	    <input type="text" name="name" class="form-control" id="category" placeholder="Category Name">
	  </div>
	  
	  
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form>






<jsp:include page="/include/close.jsp" />