<jsp:include page="/include/header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% 
	if(session.getAttribute("id") == null || (int) session.getAttribute("id") == -1) {
		response.sendRedirect("login.jsp");
	}
%>

<h1>HELLO <%= session.getAttribute("id") %></h1>






<jsp:include page="/include/footer.jsp" />