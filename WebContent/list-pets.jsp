<jsp:include page="/include/header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<table class="table table-striped">
  <thead>
    <tr class="bg-primary text-white">
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">Img</th>
      <th scope="col">Age</th>
    </tr>
  </thead>
  <tbody>

<c:forEach var="pet" items="${PET_LIST}">
    <tr>
      <th scope="row">${pet.id}</th>
      <td>${pet.name}</td>
      <td>${pet.img}</td>
      <td>${pet.age}</td>
    </tr>
</c:forEach>
  </tbody>
</table>





<jsp:include page="/include/footer.jsp" />