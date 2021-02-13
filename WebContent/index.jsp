<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Pet Clinic</title>

	<!-- BootStrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

	 <!-- Font awesome icons -->
    <script src="https://kit.fontawesome.com/4f38721301.js"></script>

    <!-- Google fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,400;0,700;0,900;1,400;1,700&display=swap" rel="stylesheet">

    <!-- Animations -->
    <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />

     <!-- favicon -->
    <link rel="icon" href="images/logo.png">

	<!-- Style.css -->
	<link rel="stylesheet" href="css/style.css">
</head>
<body class="bg-light">

<!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-light sticky-top scroll-nav p-2" >
    <div class="container">
       <a class="navbar-brand font-weight-bold " href="#">
        PET CLINIC
  </a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item item-nav">
            <a class="nav-link" href="#">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item item-nav">
            <a class="nav-link" href="#">Blog</a>
          </li>
           <li class="nav-item item-nav">
            <a class="nav-link" href="#">Login</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <div class="container-fluid">
  	<header class="full-section—first">
  		<div id="topCarousel" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#topCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#topCarousel" data-slide-to="1"></li>
    <li data-target="#topCarousel" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100 img-size" src="https://images.pexels.com/photos/164186/pexels-photo-164186.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260" alt="First slide">
      <div class="carousel-caption d-none d-md-block text-top-right">
        <div data-aos="fade-left" data-aos-duration="1200"  data-aos-delay="300">
    <h5 class="text-heading">NASLOV TEKSTA</h5>
    <p>Lorem, ipsum dolor.</p>
    </div>
  </div>
    </div>
    <div class="carousel-item">
      <img class="d-block w-100 img-size" src="https://images.pexels.com/photos/2355519/pexels-photo-2355519.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260" alt="Second slide">
      <div class="carousel-caption d-none d-md-block text-left">
        <div data-aos="fade-right" data-aos-duration="1200"  data-aos-delay="300">
    <h5 class="text-heading">NASLOV TEKSTA</h5>
    <p>Lorem, ipsum dolor.</p>
  </div>
  </div>
    </div>
    <div class="carousel-item">
      <img class="d-block w-100 img-size" src="https://images.pexels.com/photos/1316295/pexels-photo-1316295.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260" alt="Third slide">
      <div class="carousel-caption d-none d-md-block text-up">
    <h5 class="text-heading">NASLOV TEKSTA</h5>
    <p>Lorem ipsum, dolor.</p>
  </div>
    </div>
  </div>
  <a class="carousel-control-prev" href="#topCarousel" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#topCarousel" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
  	</header>
 <section data-aos="zoom-in-up" data-aos-duration="1200" data-aos-delay="300" id="promotion1" class="main-bg-color text-white">

 		<div class="row p-4">
 			<div class="col-lg-4">
 				<p class="text-center display-3"><i class="fas fa-cat"></i></p>
        <p class="text-center h4">Lorem, ipsum dolor sit amet consectetur adipisicing, elit. Est fuga molestias repellat facilis doloribus, aliquid possimus? Qui, ipsa, neque. Voluptatum ullam cum quasi! Ratione beatae id quos exercitationem doloribus obcaecati cupiditate, iusto maiores ducimus, quibusdam.</p>
 			</div>
 			<div class="col-lg-4">
 				<p class="text-center display-3"><i class="fas fa-paw"></i></p>
        <p class="text-center h4">Lorem, ipsum dolor sit amet consectetur adipisicing, elit. Est fuga molestias repellat facilis doloribus, aliquid possimus? Qui, ipsa, neque. Voluptatum ullam cum quasi! Ratione beatae id quos exercitationem doloribus obcaecati cupiditate, iusto maiores ducimus, quibusdam.</p>
 			</div>
 			<div class="col-lg-4">
 				<p class="text-center display-3"><i class="fas fa-dog"></i></p>
        <p class="text-center h4">Lorem, ipsum dolor sit amet consectetur adipisicing, elit. Est fuga molestias repellat facilis doloribus, aliquid possimus? Qui, ipsa, neque. Voluptatum ullam cum quasi! Ratione beatae id quos exercitationem doloribus obcaecati cupiditate, iusto maiores ducimus, quibusdam.</p>
 			</div>
 	</div>
 </section>

 <section id="about-us" class="full-section p-5">
 	<div class="row">
 		<div class="col-lg-8" data-aos="fade-up-left" data-aos-duration="1200"  data-aos-delay="300">
 	<div class="jumbotron bg-light ">
  <h2 class="display-4 text-dark font-weight-bold">ABOUT <span class="main-color">PET</span>CLINIC</h2>
  <p class="font-italic h4 mt-3 mb-3">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptas, minima commodi accusamus dignissimos explicabo qui possimus. Non fugiat exercitationem recusandae laboriosam illum iure itaque repellendus necessitatibus, sit tempore magni, quia consequatur? Qui ex praesentium nam omnis in assumenda eaque unde nobis laudantium quis, nesciunt, quisquam nisi cum fuga nihil eius ad adipisci, id magni libero reiciendis veritatis at! Dolores quisquam blanditiis nemo. Consectetur delectus aspernatur quas tempore temporibus earum excepturi praesentium assumenda maxime aut necessitatibus ad a, blanditiis. Doloribus perspiciatis dolores harum debitis velit recusandae numquam tempora magnam libero. Ea, quibusdam, velit! Cumque, consequatur doloremque? Velit, ea! Neque tempora quia vitae nostrum, ducimus maiores illum eaque minima officiis officia, nobis quo, fugiat! Eum explicabo minus provident, distinctio delectus, labore voluptates? Necessitatibus, repellendus, quaerat?.</p>
  <p class="lead">
    <a class="btn main-bg-color text-white btn-lg" href="#" role="button">Learn more</a>
  </p>
</div>
 		</div>
 	<div class="col-lg-4" data-aos="fade-down-right" data-aos-duration="1200"  data-aos-delay="300">
    <img class="img-fluid" src="https://images.unsplash.com/photo-1516025455112-e73ad04772e8?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1355&q=80">
  </div>
</div>
<div class="row" data-aos="flip-down" data-aos-duration="1200"  data-aos-delay="300">
  <div class="col-lg-4">
    <div class="card bg-dark text-white">
  <img class="card-img w-100" src="images/doctor-dog.jpg" alt="Card image" height="380">
  <div class="card-img-overlay text-center">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
    <p class="card-text">Last updated 3 mins ago</p>
  </div>
</div>
  </div>
  <div class="col-lg-4">
    <div class="card bg-dark text-white text-center">
  <img class="card-img" src="https://images.unsplash.com/photo-1516025455112-e73ad04772e8?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1355&q=80" alt="Card image">
  <div class="card-img-overlay">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
    <p class="card-text">Last updated 3 mins ago</p>
  </div>
</div>
  </div>
  <div class="col-lg-4">
    <div class="card bg-dark text-white text-center">
  <img class="card-img" src="https://images.unsplash.com/photo-1516025455112-e73ad04772e8?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1355&q=80" alt="Card image">
  <div class="card-img-overlay">
    <h5 class="card-title">Card title</h5>
    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
    <p class="card-text">Last updated 3 mins ago</p>
  </div>
</div>
  </div>
</div>
</section>
  <section id="parrot" class="full-section" data-aos="zoom-in-up" data-aos-duration="1200"  data-aos-delay="300">
  <h4 class="display-1 main-color">
    TOTAL DISCOUNT USE COUPON: <span class="text-white">#C19</span>
  </h4>
</section>
<section class="pb-5" id="blog" data-aos="fade-up-right" data-aos-duration="1200"  data-aos-delay="300">
  <h4 class="text-center text-dark h1">LATEST BLOG NEWS</h4>
  <div class="row">
    <div class="col-lg-4">
    <div class="card">
<div class="img-hover-zoom img-hover-zoom--colorize">
      <img class="card-img-top w-100" src="https://images.unsplash.com/photo-1591382386627-349b692688ff?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80" height="300" alt="Card image cap">
</div>
      <div class="card-body">
        <h5 class="card-title">Card title</h5>
        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
      </div>
  </div>
  </div>

   <div class="col-lg-4">
    <div class="card">
  <div class="img-hover-zoom img-hover-zoom--colorize">
      <img class="card-img-top w-100" src="https://images.unsplash.com/photo-1591382386627-349b692688ff?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80" height="300" alt="Card image cap">
</div>
      <div class="card-body">
        <h5 class="card-title">Card title</h5>
        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
      </div>
  </div>
  </div>

   <div class="col-lg-4">
    <div class="card">
      <div class="img-hover-zoom img-hover-zoom--colorize">
      <img class="card-img-top w-100" src="https://images.unsplash.com/photo-1591382386627-349b692688ff?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80" height="300" alt="Card image cap">
</div>
      <div class="card-body">
        <h5 class="card-title">Card title</h5>
        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
      </div>
  </div>
  </div>
</div>
</section>
<!-- Footer -->
<footer data-aos="fade-up" data-aos-duration="1200"  data-aos-delay="300" class="bg-light text-center text-lg-start">
  <!-- Grid container -->
  <div class="container p-4">
    <!--Grid row-->
    <div class="row">
      <!--Grid column-->
      <div class="col-lg-6 col-md-12 mb-4 mb-md-0">
        <h5 class="text-uppercase">Footer Content</h5>

        <p>
          Lorem ipsum dolor sit amet consectetur, adipisicing elit. Iste atque ea quis
          molestias. Fugiat pariatur maxime quis culpa corporis vitae repudiandae aliquam
          voluptatem veniam, est atque cumque eum delectus sint!
        </p>
      </div>
      <!--Grid column-->

      <!--Grid column-->
      <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
        <h5 class="text-uppercase">Links</h5>

        <ul class="list-unstyled mb-0">
          <li>
            <a href="#!">Link 1</a>
          </li>
          <li>
            <a href="#!">Link 2</a>
          </li>
          <li>
            <a href="#!">Link 3</a>
          </li>
          <li>
            <a href="#!">Link 4</a>
          </li>
        </ul>
      </div>
      <!--Grid column-->

      <!--Grid column-->
      <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
        <h5 class="text-uppercase mb-0">Links</h5>

        <ul class="list-unstyled">
          <li>
            <a href="#!">Link 1</a>
          </li>
          <li>
            <a href="#!">Link 2</a>
          </li>
          <li>
            <a href="#!">Link 3</a>
          </li>
          <li>
            <a href="#!">Link 4</a>
          </li>
        </ul>
      </div>
      <!--Grid column-->
    </div>
    <!--Grid row-->
  </div>
  <!-- Grid container -->

  <!-- Copyright -->
  <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.5)">
    © 2021 Copyright:
    <a>SavaN</a>
  </div>
  <!-- Copyright -->
</footer>
<!-- Footer -->

  </div> <!-- end of container -->


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>	

  <script src="https://unpkg.com/aos@next/dist/aos.js"></script>
  <script>
    AOS.init();
  </script>
<script>
  $(function () {
  $(document).scroll(function () {
    var $nav = $(".scroll-nav");
    $nav.toggleClass('scrolled', $(this).scrollTop() > $nav.height());
  });
});
</script>
<script>
$('#topCarousel').carousel({
  interval: 5000
})
</script>

</body>
</html>