<jsp:include page="/include/admin-header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="d-sm-flex d-flex justify-content-between align-items-center mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Create Medical Record</h1>
                        <a class="btn btn-info" href="#">GO BACK</a>
                    </div>

                    

                   <form action="RecordControllerServlet" method="POST" autocomplete="off">
                   
                    <div class="form-group row">
                                    <div class="col-lg-12">
                                        <input type="text" name="title" class="form-control form-control-user" id="exampleFirstName"
                                            placeholder="Title">
                                    </div>
                                    <div class="col-lg-12">
                                         <div class="form-group">
										    <label for="exampleFormControlTextarea1">Description for pet record</label>
										    <textarea class="form-control" name="description" id="exampleFormControlTextarea1" rows="3"></textarea>
										  </div>
                                    </div>
                                </div>
                                
                                <input type="hidden" name="petId" value="${petId}">                   
                                <input type="hidden" name="vetId" value="<%= session.getAttribute("id") %>">  
                                 <input type="hidden" name="command" value="ADD">              
                   		<input type="submit" value="SUBMIT">
                   </form>
                      

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

            <!-- Footer -->
            <footer class="sticky-footer bg-white">
                <div class="container my-auto">
                    <div class="copyright text-center my-auto">
                        <span>Copyright &copy; Your Website 2020</span>
                    </div>
                </div>
            </footer>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="login.html">Logout</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

<jsp:include page="/include/close.jsp" />