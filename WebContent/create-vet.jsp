<jsp:include page="/include/admin-header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


   <body class="main-bg">

    <div class="container">

        <div class="card o-hidden border-0 shadow-lg my-5">
            <div class="card-body p-0">
                <!-- Nested Row within Card Body -->
                <div class="row">
                    <div class="col-lg-5 d-none d-lg-block bg-register-vet-image"></div>
                    <div class="col-lg-7">
                        <div class="p-5">
                            <div class="text-center">
                                <h1 class="h4 text-gray-900 mb-4">Create a VET!</h1>
                            </div>
                            <form action="VetControllerServlet" method="POST" enctype="multipart/form-data" autocomplete="off">
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" name="firstName" class="form-control form-control-user" 
                                            placeholder="First Name">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="text" name="lastName" class="form-control form-control-user" 
                                            placeholder="lastName">
                                    </div>
                                </div>
                                <div class="form-group row">
                                     <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="email" name="email" class="form-control form-control-user" 
                                            placeholder="Email">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="password" value="password" name="password" class="form-control form-control-user" >
                                    </div>
                                </div>
                                
                                   <div class="form-group row">
                                     <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" name="img" class="form-control form-control-user" 
                                            placeholder="name for profile picture">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="file" name="file" class="form-control form-control-user" >
                                    </div>
                                </div>
                               
                               <input type="submit" value="SUBMIT" class="btn btn-primary btn-user btn-block" />
                                <input type="hidden" name="command" value="ADD">
                            </form>
                            <hr>
                            <div class="text-center">
                                <a href="VetControllerServlet">GO BACK!</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

<jsp:include page="/include/close.jsp" />




<jsp:include page="/include/close.jsp" />