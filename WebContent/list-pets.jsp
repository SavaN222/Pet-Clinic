<jsp:include page="/include/admin-header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% 
	if(session.getAttribute("id") == null || (int) session.getAttribute("id") == -1) {
		response.sendRedirect("login.jsp");
	}
%>

<body id="page-top">

   <!-- Page Wrapper -->
    <div class ="container">
        
     
<h3>ALL PETS</h3><a href="VetControllerServlet" class="btn btn-info">GO BACK</a>
<div class="row">

<c:forEach var="pet" items="${PET_LIST}">
<div class="col-lg-3">
<div class="card" style="width: 18rem;">
  <img class="card-img-top" src="${pet.img}" alt="Card image cap">
  <div class="card-body">
    <p class="card-text">Name:${pet.name}</p>
    <p class="card-text">Age::${pet.age}</p>
    <p class="card-text">Category:${pet.categoryName}</p>
    
    <a href="#" class="btn btn-primary">Vidi Profil</a>
  </div>
</div>
</div>
</c:forEach>
</div>
</div>

<jsp:include page="/include/close.jsp" />