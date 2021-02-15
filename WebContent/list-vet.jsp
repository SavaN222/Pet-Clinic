<jsp:include page="/include/header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<table class="table table-striped">
  <thead>
    <tr class="bg-primary text-white">
      <th scope="col">#</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Img</th>
      <th scope="col">Email</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>

<c:forEach var="vet" items="${VET_LIST}">
<c:url var="editLink" value="VetControllerServlet">
  	<c:param name="command" value="EDIT" />
  	<c:param name="vetId" value="${vet.id}" />
  </c:url>
  
  <c:url var="deleteLink" value="VetControllerServlet">
  	<c:param name="command" value="DELETE" />
  	<c:param name="vetId" value="${vet.id}" />
  </c:url>
 
    <tr>
      <th scope="row">${vet.id}</th>
      <td>${vet.firstName}</td>
      <td>${vet.lastName}</td>
      <td><img class="img-radius" width="150" height="150" src="${vet.img}"></td>
      <td>${vet.email}</td>
      <td><a href="${editLink}"><i class="text-success fas fa-pen"></i></a> / <a href="${deleteLink}" 
      onclick="if (!(confirm('Are you sure?'))) return false"><i class="text-danger fas fa-trash"></i></a></td>
    </tr>
</c:forEach>

<a class="display-4 text-info" href="VetControllerServlet"> Go back</a>







<jsp:include page="/include/close.jsp" />