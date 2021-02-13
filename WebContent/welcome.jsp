<jsp:include page="/include/header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% 
	if(session.getAttribute("id") == null || (int) session.getAttribute("id") == -1) {
		response.sendRedirect("login.jsp");
	}
%>

<h1>INFO ABOUT VET</h1>
<p>${VET.id}</p>
<p>${VET.firstName}</p>
<p>${VET.lastName}</p>
<p>${VET.img}</p>
<p>${VET.email}</p>


 <c:set var = "vetID" scope = "session" value = "${VET.id}"/>
      <c:if test = "${vetID == 1}">
         <a href="create-vet.jsp">CREATE VET</a> <br>
         <c:url var="tempLink" value="VetControllerServlet">
		  	<c:param name="command" value="LIST" />
  		</c:url>
  		<a href="${tempLink}">LIST ALL VETS</a>
      </c:if>


<h2>TO DO LIST</h2>
<a>Vets:CRUD</a>
<a>Pet: CRUD</a>
<a>Blog:Crud</a>
<a>Category:Crud</a>






<jsp:include page="/include/footer.jsp" />