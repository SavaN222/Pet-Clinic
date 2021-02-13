<jsp:include page="/include/admin-header.jsp" />

<body class="bg-gradient-primary">

    <div class="container">

        <!-- Outer Row -->
        <div class="row justify-content-center">

            <div class="col-xl-10 col-lg-12 col-md-9">

                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <!-- Nested Row within Card Body -->
                        <div class="row">
                            <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
                                    </div>
                        <form class="user" action="LoginControllerServlet" method="POST">
                           <div class="form-group">
                                            <input type="email" name="email" class="form-control form-control-user"
                                                id="exampleInputEmail" aria-describedby="emailHelp"
                                                placeholder="Enter Email Address...">
                                        </div>

                            <input type="hidden" name="command" value="LOGIN">
                              <div class="form-group">
                                            <input type="password" name="password" class="form-control form-control-user"
                                                id="exampleInputPassword" placeholder="Password">
                                        </div>
                            <div class="form-group">
                                <input type="submit" class="btn btn-info btn-md" value="submit">
                            </div>
                           
      </form>
  </div>
</div>
</div>
</div>
</div>
</div>
</div>
</div> <!-- end container -->

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

<jsp:include page="/include/close.jsp" />