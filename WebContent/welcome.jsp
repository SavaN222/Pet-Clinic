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






<jsp:include page="/include/footer.jsp" />