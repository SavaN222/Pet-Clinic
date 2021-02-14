<jsp:include page="/include/admin-header.jsp" />

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
                    <div class="d-sm-flex align-items-center mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Zdravstveni Karton:Cile</h1>
                        <a href="#">kreiraj novi</a>
                    </div>

                    

                    <div class="row">
						<div class="col-lg-6">
						 <!-- Collapsable Card Example -->
                       <div class="card shadow mb-4">
                           <!-- Card Header - Accordion -->
                           <a href="#collapseCardExample" class="d-block card-header py-3" data-toggle="collapse"
                               role="button" aria-expanded="true" aria-controls="collapseCardExample">
                               <h6 class="m-0 font-weight-bold text-primary">Karton kreirao: Veterinar</h6>
                           </a>
                          
                           <!-- Card Content - Collapse -->
                           <div class="collapse show" id="collapseCardExample">
                               <div class="card-body">
                                   <p>italic date:</p>
                                   Opis problema
                               </div>
                           </div>
                       </div>
						</div>
						<div class="col-lg-6">
						 <!-- Collapsable Card Example -->
                       <div class="card shadow mb-4">
                           <!-- Card Header - Accordion -->
                           <a href="#collapseCardExample" class="d-block card-header py-3" data-toggle="collapse"
                               role="button" aria-expanded="true" aria-controls="collapseCardExample">
                               <h6 class="m-0 font-weight-bold text-primary">Collapsable Card Example</h6>
                           </a>
                           <!-- Card Content - Collapse -->
                           <div class="collapse show" id="collapseCardExample">
                               <div class="card-body">
                                   This is a collapsable card example using Bootstrap's built in collapse
                                   functionality. <strong>Click on the card header</strong> to see the card body
                                   collapse and expand!
                               </div>
                           </div>
                       </div>
						</div>
                      

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