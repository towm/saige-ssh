<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Creative - Bootstrap 3 Responsive Admin Template">
<meta name="author" content="GeeksLabs">
<meta name="keyword"
	content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
<link rel="shortcut icon" href="img/favicon.png">

<title>User Update Form | Administrator</title>

<!-- Bootstrap CSS -->
<link href="/lyn-ssh/css/bootstrap.min.css" rel="stylesheet">
<!-- bootstrap theme -->
<link href="/lyn-ssh/css/bootstrap-theme.css" rel="stylesheet">
<!--external css-->
<!-- font icon -->
<link href="/lyn-ssh/css/elegant-icons-style.css" rel="stylesheet" />
<link href="/lyn-ssh/css/font-awesome.min.css" rel="stylesheet" />
<link href="/lyn-ssh/css/daterangepicker.css" rel="stylesheet" />
<link href="/lyn-ssh/css/bootstrap-datepicker.css" rel="stylesheet" />
<link href="/lyn-ssh/css/bootstrap-colorpicker.css" rel="stylesheet" />
<!-- date picker -->

<!-- color picker -->

<!-- Custom styles -->
<link href="/lyn-ssh/css/style.css" rel="stylesheet">
<link href="/lyn-ssh/css/style-responsive.css" rel="stylesheet" />

<!-- HTML5 shim and Respond.js IE8 support of HTML5 -->
<!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
      <script src="js/lte-ie7.js"></script>
    <![endif]-->

<!-- =======================================================
      Theme Name: NiceAdmin
      Theme URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
      Author: BootstrapMade
      Author URL: https://bootstrapmade.com
    ======================================================= -->
 
</head>

<body>
	<!-- custom user update form start -->

	<!-- container section start -->
	<section id="container" class="">
		<!--header start-->
		<header class="header dark-bg">
			<div class="toggle-nav">
				<div class="icon-reorder tooltips"
					data-original-title="Toggle Navigation" data-placement="bottom">
					<i class="icon_menu"></i>
				</div>
			</div>

			<!--logo start-->
      <a href="/lyn-ssh/jsp/manager/manager_index.jsp" class="logo">Lyn <span class="lite">Workshop</span></a>
			<!--logo end-->

			<div class="nav search-row" id="top_menu">
				<!--  search form start -->
				<ul class="nav top-menu">
					<li>
						<form class="navbar-form">
							<input class="form-control" placeholder="Search" type="text">
						</form>
					</li>
				</ul>
				<!--  search form end -->
			</div>

			<div class="top-nav notification-row">
				<!-- notificatoin dropdown start-->
				<ul class="nav pull-right top-menu">

					<!-- task notificatoin start -->
					<li id="task_notificatoin_bar" class="dropdown"><a
						data-toggle="dropdown" class="dropdown-toggle" href="#"> <i
							class="icon-task-l"></i> <span class="badge bg-important">5</span>
					</a>
						<ul class="dropdown-menu extended tasks-bar">
							<div class="notify-arrow notify-arrow-blue"></div>
							<li>
								<p class="blue">You have 5 pending tasks</p>
							</li>
							<li><a href="#">
									<div class="task-info">
										<div class="desc">Design PSD</div>
										<div class="percent">90%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-success"
											role="progressbar" aria-valuenow="90" aria-valuemin="0"
											aria-valuemax="100" style="width: 90%">
											<span class="sr-only">90% Complete (success)</span>
										</div>
									</div>
							</a></li>
							<li><a href="#">
									<div class="task-info">
										<div class="desc">Project 1</div>
										<div class="percent">30%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-warning"
											role="progressbar" aria-valuenow="30" aria-valuemin="0"
											aria-valuemax="100" style="width: 30%">
											<span class="sr-only">30% Complete (warning)</span>
										</div>
									</div>
							</a></li>
							<li><a href="#">
									<div class="task-info">
										<div class="desc">Digital Marketing</div>
										<div class="percent">80%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-info" role="progressbar"
											aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"
											style="width: 80%">
											<span class="sr-only">80% Complete</span>
										</div>
									</div>
							</a></li>
							<li><a href="#">
									<div class="task-info">
										<div class="desc">Logo Designing</div>
										<div class="percent">78%</div>
									</div>
									<div class="progress progress-striped">
										<div class="progress-bar progress-bar-danger"
											role="progressbar" aria-valuenow="78" aria-valuemin="0"
											aria-valuemax="100" style="width: 78%">
											<span class="sr-only">78% Complete (danger)</span>
										</div>
									</div>
							</a></li>
							<li><a href="#">
									<div class="task-info">
										<div class="desc">Mobile App</div>
										<div class="percent">50%</div>
									</div>
									<div class="progress progress-striped active">
										<div class="progress-bar" role="progressbar"
											aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"
											style="width: 50%">
											<span class="sr-only">50% Complete</span>
										</div>
									</div>

							</a></li>
							<li class="external"><a href="#">See All Tasks</a></li>
						</ul></li>
					<!-- task notificatoin end -->
					<!-- inbox notificatoin start-->
					<li id="mail_notificatoin_bar" class="dropdown"><a
						data-toggle="dropdown" class="dropdown-toggle" href="#"> <i
							class="icon-envelope-l"></i> <span class="badge bg-important">5</span>
					</a>
						<ul class="dropdown-menu extended inbox">
							<div class="notify-arrow notify-arrow-blue"></div>
							<li>
								<p class="blue">You have 5 new messages</p>
							</li>
							<li><a href="#"> <span class="photo"><img
										alt="avatar" src="./img/avatar-mini.jpg"></span> <span
									class="subject"> <span class="from">Greg Martin</span> <span
										class="time">1 min</span>
								</span> <span class="message"> I really like this admin panel. </span>
							</a></li>
							<li><a href="#"> <span class="photo"><img
										alt="avatar" src="./img/avatar-mini2.jpg"></span> <span
									class="subject"> <span class="from">Bob Mckenzie</span>
										<span class="time">5 mins</span>
								</span> <span class="message"> Hi, What is next project plan? </span>
							</a></li>
							<li><a href="#"> <span class="photo"><img
										alt="avatar" src="./img/avatar-mini3.jpg"></span> <span
									class="subject"> <span class="from">Phillip Park</span>
										<span class="time">2 hrs</span>
								</span> <span class="message"> I am like to buy this Admin
										Template. </span>
							</a></li>
							<li><a href="#"> <span class="photo"><img
										alt="avatar" src="./img/avatar-mini4.jpg"></span> <span
									class="subject"> <span class="from">Ray Munoz</span> <span
										class="time">1 day</span>
								</span> <span class="message"> Icon fonts are great. </span>
							</a></li>
							<li><a href="#">See all messages</a></li>
						</ul></li>
					<!-- inbox notificatoin end -->
					<!-- alert notification start-->
					<li id="alert_notificatoin_bar" class="dropdown"><a
						data-toggle="dropdown" class="dropdown-toggle" href="#"> <i
							class="icon-bell-l"></i> <span class="badge bg-important">7</span>
					</a>
						<ul class="dropdown-menu extended notification">
							<div class="notify-arrow notify-arrow-blue"></div>
							<li>
								<p class="blue">You have 4 new notifications</p>
							</li>
							<li><a href="#"> <span class="label label-primary"><i
										class="icon_profile"></i></span> Friend Request <span
									class="small italic pull-right">5 mins</span>
							</a></li>
							<li><a href="#"> <span class="label label-warning"><i
										class="icon_pin"></i></span> John location. <span
									class="small italic pull-right">50 mins</span>
							</a></li>
							<li><a href="#"> <span class="label label-danger"><i
										class="icon_book_alt"></i></span> Project 3 Completed. <span
									class="small italic pull-right">1 hr</span>
							</a></li>
							<li><a href="#"> <span class="label label-success"><i
										class="icon_like"></i></span> Mick appreciated your work. <span
									class="small italic pull-right"> Today</span>
							</a></li>
							<li><a href="#">See all notifications</a></li>
						</ul></li>
					<!-- alert notification end-->
					<!-- user login dropdown start-->
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#"> <span class="profile-ava">
								<img alt="" src="img/avatar1_small.jpg">
						</span> <span class="username">${user.name}</span> <b class="caret"></b>
					</a>
						<ul class="dropdown-menu extended logout">
							<div class="log-arrow-up"></div>
							<li class="eborder-top"><a href="#"><i
									class="icon_profile"></i> My Profile</a></li>
							<li><a href="#"><i class="icon_mail_alt"></i> My Inbox</a></li>
							<li><a href="#"><i class="icon_clock_alt"></i> Timeline</a>
							</li>
							<li><a href="#"><i class="icon_chat_alt"></i> Chats</a></li>
							<li><a href="/lyn-ssh/user/logout.do"><i class="icon_key_alt"></i>
									Log Out</a></li>
							<li><a href="documentation.html"><i class="icon_key_alt"></i>
									Documentation</a></li>
							<li><a href="documentation.html"><i class="icon_key_alt"></i>
									Documentation</a></li>
						</ul></li>
					<!-- user login dropdown end -->
				</ul>
				<!-- notificatoin dropdown end-->
			</div>
		</header>
		<!--header end-->

		<!--sidebar start-->
		 <aside>
      <div id="sidebar" class="nav-collapse ">
        <!-- sidebar menu start-->
            <ul class="sidebar-menu">
          <li class="active">
           <a class="" href="/lyn-ssh/jsp/manager/manager_index.jsp">
                          <i class="icon_house_alt"></i>
                          <span>Dashboard</span>
                      </a>
          </li>
          <li class="sub-menu">
            <a href="javascript:;" class="">
                          <i class="icon_document_alt"></i>
                          <span>Forms</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
            <ul class="sub">
              <li> </li>
              <li><a class="" href="/lyn-ssh/jsp/manager/manager_add_task.jsp">Task Form</a></li>
       
              
            </ul>
          </li>
           <li class="sub-menu">
            <a href="javascript:;" class="">
                          <i class="icon_table"></i>
                          <span>Tables</span>
                          <span class="menu-arrow arrow_carrot-right"></span>
                      </a>
            <ul class="sub">
             <li><a class="" href="/lyn-ssh/task/taskList.do">Task Table</a></li>
              <li><a class="" href="/lyn-ssh/user/userList.do">User Management</a></li>
            </ul>
          </li>

        </ul>
        <!-- sidebar menu end-->
      </div>
    </aside>
		<!--sidebar end-->

		<!--main content start-->
		<section id="main-content">
			<section class="wrapper">

				<!-- Basic Forms & Horizontal Forms-->

				<div class="row">
					<div class="col-lg-12">
						<section class="panel">
							<header class="panel-heading"> Advanced Table </header>

							<table class="table table-striped table-advance table-hover">
								<tbody>
									<tr>
										<th><i class="icon_profile"></i> Full Name</th>
										<th><i class="icon_calendar"></i> Date</th>
										<th><i class="icon_mail_alt"></i> Email</th>
										<th><i class="icon_pin_alt"></i> City</th>
										<th><i class="icon_mobile"></i> Mobile</th>
										<th><i class="icon_cogs"></i> Action</th>
									</tr>
									<c:forEach items="${users}" var="user">
										<tr>
											<td><c:out value="${user.name}" /></td>
											<td><c:out value="${user.date}" /></td>
											<td><c:out value="${user.email}" /></td>
											<td><c:out value="${user.city}" /></td>
											<td><c:out value="${user.phone}" /></td>
											<td>
												<div class="btn-group">
													<a class="btn btn-primary" href="#add_User_Modal"
														data-toggle="modal"><i class="icon_plus_alt2"></i></a>  
														<a class="btn btn-success" href="/lyn-ssh/user/getUser.do?id=${user.id}" data-toggle="modal"><i class="icon_pencil-edit_alt"></i></a> 
														<a
														class="btn btn-danger"
														href="/lyn-ssh/user/delUser.do?id=${user.id}"><i
														class="icon_close_alt2"></i></a>
												</div>
											</td>
										</tr>
									</c:forEach>


								</tbody>
							</table>
                            </section>
							
									
									<!-- modal for add user start -->
									<div aria-hidden="true" aria-labelledby="add_User"
										role="dialog" tabindex="-1" id="add_User_Modal"
										class="modal fade">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button aria-hidden="true" data-dismiss="modal"
														class="close" type="button">¡Á</button>
													<h4 class="modal-title">User Insert Form</h4>
												</div>
												<div class="modal-body">

													<form id="add_user_form" role="form" action="addUser.do"
														method="post">
														<div class="form-group">
															<label for="exampleInputEmail1">Name</label> <input
																name="name" class="form-control" id="exampleInputEmail1"
																placeholder="Name">
														</div>
														<div class="form-group">
															<label for="exampleInputEmail1">City</label> <input
																name="city" class="form-control" id="exampleInputEmail1"
																placeholder="City">
														</div>
														<div class="form-group">
															<label for="exampleInputEmail1">Email address</label> <input
																name="email" type="email" class="form-control"
																id="exampleInputEmail1" placeholder="Email">
														</div>
														<div class="form-group">
															<label class="control-label col-lg-2" for="inputSuccess">Role</label>
															<div class="col-lg-10">
																<select onchange="this.form.submit()" name="role"
																	form="add_user_form" class="form-control m-bot15">
																	<option selected="selected">2</option>
																	<option>1</option>
																	<option>3</option>
																	<option>4</option>
																	<option>5</option>
																</select>
															</div>
														</div>
														<div class="form-group">
															<label for="exampleInputEmail1">Phone</label> <input
																name="phone" type="tel" class="form-control"
																id="exampleInputEmail1" placeholder="Phone Number">
														</div>
														<div class="form-group">
															<label for="exampleInputPassword1">Password</label> <input
																name="password" type="password" class="form-control"
																id="exampleInputPassword1" placeholder="Password">
														</div>

														<div class="form-group">
															<label class="control-label col-sm-4">Default
																Datepicker</label>
															<div class="col-sm-6">
																<input name="date" id="dp1" type="text" value="28-10-2013" size="16" class="form-control">
															</div>
														</div>
														<button type="submit" class="btn btn-primary">Submit</button>
													</form>


												</div>
											</div>
										</div>
									</div>

									<!-- modal for add user end -->

									<!-- modal for update user start -->
									<div aria-hidden="true" aria-labelledby="update_User"
										role="dialog" tabindex="-1" id="update_User_Modal5" name="update_User_Modal5"
										class="modal fade">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button aria-hidden="true" data-dismiss="modal"
														class="close" type="button">¡Á</button>
													<h4 class="modal-title">User Update Form</h4>
												</div>
												<div class="modal-body">

													<form id="update_user_form" role="form">
														<div class="form-group">
															<label for="exampleInputEmail1">Name</label> <input
																name="name" class="form-control" id="nameInput1"
																placeholder="Name">
														</div>

														<div class="form-group">
															<label for="exampleInputEmail1">City</label> <input
																name="city" class="form-control" id="cityInput1"
																placeholder="City">
														</div>
														<div class="form-group">
															<label for="exampleInputEmail1">Email address</label> <input
																name="email" type="email" class="form-control"
																id="emailInput1" placeholder="Email">
														</div>
														<div class="form-group">
															<label class="control-label col-lg-2" for="inputSuccess">Role</label>
															<div class="col-lg-10">
																<select onchange="this.form.submit()" name="role"
																	form="update_user_form" class="form-control m-bot15">
																	<option id="selInput1" selected="selected">1</option>
																	<option id="selInput2">2</option>
																	<option id="selInput3">3</option>
																	<option id="selInput4">4</option>
																	<option id="selInput5">5</option>
																</select>
															</div>
														</div>
														<div class="form-group">
															<label for="exampleInputEmail1">Phone</label> <input
																name="phone" type="tel" class="form-control"
																id="phoneInput1" placeholder="Phone Number">
														</div>
														<div class="form-group">
															<label for="exampleInputPassword1">Password</label> <input
																name="password" class="form-control" id="passwordInput1"
																placeholder="Password">
														</div>

														<div class="form-group">
															<label class="control-label col-sm-4">Default
																Datepicker</label>
															<div class="col-sm-6">
																<input name="date" id="dp1" type="text"
																	value="28-10-2013" size="16" class="form-control">
															</div>
														</div>
														<button type="submit" class="btn btn-primary">Submit</button>
													</form>
													<!-- modal for update user end -->

												</div>
											</div>
										</div>
									</div>

							
					</div>

				</div>


			</section>
		</section>
		<!--main content end-->

	</section>
	<!-- container section end -->
	<!-- javascripts -->

	<script src="/lyn-ssh/js/jquery.js"></script>
	<script src="/lyn-ssh/js/bootstrap.min.js"></script>
	<!-- nice scroll -->
	<script src="/lyn-ssh/js/jquery.scrollTo.min.js"></script>
	<script src="/lyn-ssh/js/jquery.nicescroll.js" type="text/javascript"></script>

	<!-- jquery ui -->
	<script src="/lyn-ssh/js/jquery-ui-1.9.2.custom.min.js"></script>

	<!--custom checkbox & radio-->
	<script type="/lyn-ssh/text/javascript" src="js/ga.js"></script>
	<!--custom switch-->
	<script src="/lyn-ssh/js/bootstrap-switch.js"></script>
	<!--custom tagsinput-->
	<script src="/lyn-ssh/js/jquery.tagsinput.js"></script>

	<!-- colorpicker -->

	<!-- bootstrap-wysiwyg -->
	<script src="/lyn-ssh/js/jquery.hotkeys.js"></script>
	<script src="/lyn-ssh/js/bootstrap-wysiwyg.js"></script>
	<script src="/lyn-ssh/js/bootstrap-wysiwyg-custom.js"></script>
	<script src="/lyn-ssh/js/moment.js"></script>
	<script src="/lyn-ssh/js/bootstrap-colorpicker.js"></script>
	<script src="/lyn-ssh/js/daterangepicker.js"></script>
	<script src="/lyn-ssh/js/bootstrap-datepicker.js"></script>
	<!-- ck editor -->
	<script type="/lyn-ssh/text/javascript"
		src="assets/ckeditor/ckeditor.js"></script>
	<!-- custom form component script for this page-->
	<script src="/lyn-ssh/js/form-component.js"></script>
	<!-- custome script for all page -->
	<script src="/lyn-ssh/js/scripts.js"></script>
	<script>
function myFunction(obj) {
     
	alert(obj.name);
}
</script>
 <script type = "text/javascript">
 var guser = 0
 
	 function click(user)
	{
	   guser = user.id;
	   alert("asd");
	}
     $( document ).ready(function() {
    	 var MutationObserver = window.MutationObserver || window.WebKitMutationObserver || window.MozMutationObserver
         
	      
	      var slide = document.getElementById("update_User_Modal5");
         
	      var slideObserver = new MutationObserver(function(mutations) {
	        mutations.forEach(function(mutation) {
	          if (mutation.type == "attributes") {
	            
	            // here you can play with it now :)
	            if (mutation.target.getAttribute('aria-hidden') == "true") {
	              console.log('ok. aria-hidden is true') 
	            } else {
	          	  document.getElementById("nameInput1").value=guser.id;
	        	  document.getElementById("passwordInput1").value=guser.password;
	        	  document.getElementById("emailInput1").value=guser.email;
	        	  document.getElementById("cityInput1").value=guser.city;
	        	  document.getElementById("dp1").value=guser.date;
	            }      
	          }
	        });
	      });

	      slideObserver.observe(slide, {
	        attributes: true, //configure it to listen to attribute changes
	        attributeFilter: ['aria-hidden'] // filter your attributes
	      });
    	});
	     
</script>
    

</body>

</html>
