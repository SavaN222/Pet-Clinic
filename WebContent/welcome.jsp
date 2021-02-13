<jsp:include page="/include/header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% 
	if(session.getAttribute("id") == null || (int) session.getAttribute("id") == -1) {
		response.sendRedirect("login.jsp");
	}
%>


<c:forEach var="pet" items="${PET_LIST}">
<p>${pet.name}</p>
<p>${pet.img}</p>
<p>${pet.age}</p>
<p>${pet.categoryName}</p>

</c:forEach>






<jsp:include page="/include/close.jsp" />