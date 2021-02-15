<jsp:include page="/include/profile-header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% 
	if(session.getAttribute("id") == null || (int) session.getAttribute("id") == -1) {
		response.sendRedirect("login.jsp");
	}
%>
<body>
<a href="VetControllerServlet" class="display-4 text-info">Go back</a>
<div class="page-content page-container" id="page-content">
    <div class="padding">
        <div class="row">
  <c:forEach var="pet" items="${PET_LIST}">
  <c:url var="editLink" value="PetControllerServlet">
  	<c:param name="command" value="EDIT" />
  	<c:param name="petId" value="${pet.id}" />
  </c:url>
  
  <c:url var="deleteLink" value="PetControllerServlet">
  	<c:param name="command" value="DELETE" />
  	<c:param name="petId" value="${pet.id}" />
  </c:url>
            <div class="col-lg-6">
                <div class="card user-card-full">
                    <div class="row m-l-0 m-r-0">
                        <div class="col-sm-4 bg-c-lite-green user-profile">
                            <div class="card-block text-center text-white">
                                <div class="m-b-25"> <img src="${pet.img }" class="img-radius w-100" alt="User-Profile-Image" height="300"> </div>
                                <h6 class="f-w-600">${pet.name}</h6>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <div class="card-block">
                                <h6 class="m-b-20 p-b-5 b-b-default f-w-600">Information</h6>
                                <div class="row">
                                    <div class="col-sm-6">
                                        <p class="m-b-10 f-w-600">Age</p>
                                        <h6 class="text-muted f-w-400">${pet.age}</h6>
                                    </div>
                                    <div class="col-sm-6">
                                        <p class="m-b-10 f-w-600">Category</p>
                                        <h6 class="text-muted f-w-400">${pet.categoryName}</h6>
                                    </div>
                                </div>
                                <h6 class="m-b-20 m-t-40 p-b-5 b-b-default f-w-600">Projects</h6>
                                <div class="row">
                                    <div class="col-sm-6">
                                        <a href="${editLink}" class="m-b-10 f-w-600">UPDATE</p>
                                        
                                    </div>
                                    <div class="col-sm-6">
                                        <a href="${deleteLink}" class="m-b-10 f-w-600" 
                                        onclick="if (!(confirm('Are you sure?'))) return false">
                                        DELETE</a>
                                    </div>
                                    <hr>
                                    
                                      <c:url var="record" value="RecordControllerServlet">
									  	<c:param name="command" value="SHOW" />
									  	<c:param name="petId" value="${pet.id}" />
									  </c:url>
                                    <div class="col-sm-12">
                                    <a href="${record}" class="btn btn-danger">See Medical Records</a>
                                    </div>
                                </div>
                              
                            </div>
                        </div>
                    </div>
                </div>
            </div>
             </c:forEach>
        </div>
       
    </div>
</div>

<jsp:include page="/include/close.jsp" />