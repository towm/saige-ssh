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

<title>Task Management</title>
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
			<a href="/lyn-ssh/jsp/manager/manager_index.jsp" class="logo">Lyn
				<span class="lite">Workshop</span>
			</a>
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
							class="icon-task-l"></i> <span class="badge bg-important">6</span>
					</a>
						<ul class="dropdown-menu extended tasks-bar">
							<div class="notify-arrow notify-arrow-blue"></div>
							<li>
								<p class="blue">You have 6 pending letter</p>
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
							<li><a href="/lyn-ssh/user/logout.do"><i
									class="icon_key_alt"></i> Log Out</a></li>
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
					<li class="active"><a class=""
						href="/lyn-ssh/jsp/manager/manager_index.jsp"> <i
							class="icon_house_alt"></i> <span>Dashboard</span>
					</a></li>
					<li class="sub-menu"><a href="javascript:;" class=""> <i
							class="icon_document_alt"></i> <span>Forms</span> <span
							class="menu-arrow arrow_carrot-right"></span>
					</a>
						<ul class="sub">
							<li></li>
							<li><a class=""
								href="/lyn-ssh/jsp/manager/manager_add_task.jsp">Task Form</a></li>


						</ul></li>
					<li class="sub-menu"><a href="javascript:;" class=""> <i
							class="icon_table"></i> <span>Tables</span> <span
							class="menu-arrow arrow_carrot-right"></span>
					</a>
						<ul class="sub">
							<li><a class="" href="/lyn-ssh/task/taskList.do">Task
									Table</a></li>
							<li><a class="" href="/lyn-ssh/user/userList.do">User
									Management</a></li>
						</ul></li>

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
							<header class="panel-heading tab-bg-primary">
								<ul class="nav nav-tabs">
									<li class="active"><a data-toggle="tab"
										href="#existing-product-form"> Existing product
											Stock-in/out </a></li>

									<li class=""><a data-toggle="tab" href="#new-product-form">

											New product Stock-in </a></li>
								</ul>
							</header>
							<div class="panel-body">
								<div class="tab-content">


									<!-- new-product-form -->
									<div id="new-product-form" class="tab-pane">
										<section class="panel">
											<div class="panel-body bio-graph-info">
												<h1>New Product Form</h1>
												<div class="form">
													<form class="form-validate form-horizontal"
														id="add_task_form2" method="post" action="newStock.do">
														<div class="form-group ">
															<label for="cname" class="control-label col-lg-2">Product
																Name <span class="required">*</span>
															</label>
															<div class="col-lg-10">
																<input class="form-control" id="cname" name="product3"
																	minlength="3" type="text" required />
															</div>
														</div>

														<div class="form-group ">
															<label for="cname" class="control-label col-lg-2">Task
																Name <span class="required">*</span>
															</label>
															<div class="col-lg-10">
																<input class="form-control" id="cname" name="name"
																	minlength="5" type="text" required />
															</div>
														</div>
														<div class="form-group ">
															<label for="cname" class="control-label col-lg-2">Task
																Progress <span class="required">*</span>
															</label>
															<div class="col-lg-10">

																<select name="progress" form="add_task_form2"
																	class="form-control m-bot15">
																	<option selected="selected">Not Started</option>
																	<option>In Progress 20%</option>
																	<option>In Progress 50%</option>
																	<option>In Progress 80%</option>


																</select>
															</div>
														</div>


														<div class="form-group">
															<label class="control-label col-lg-2">Date</label>
															<div class="col-lg-10">
																<input name="date" id="dp1" value="28-10-2013"
																	type="text" size="16" class="form-control">
															</div>
														</div>


														<div class="form-group ">
															<label for="cname" class="control-label col-lg-2">Priority
																<span class="required">*</span>
															</label>
															<div class="col-lg-10">

																<select name="priority" form="add_task_form2"
																	class="form-control m-bot15">
																	<option selected="selected">medium</option>
																	<option>low</option>
																	<option>high</option>
																	<option>urgent</option>
																</select>
															</div>
														</div>


														<div class="form-group ">
															<label for="cname" class="control-label col-lg-2">Stock-In/Out
																Type <span class="required">*</span>
															</label>
															<div class="col-lg-10">

																<select name="type" form="add_task_form2"
																	class="form-control m-bot15">
																	<option selected="selected">Out</option>
																	<option>In</option>
																</select>
															</div>
														</div>


														<div class="form-group ">
															<label for="cname" class="control-label col-lg-2">Quality
																<span class="required">*</span>
															</label>
															<div class="col-lg-10">
																<input class="form-control " id="cname" type="number"
																	name="quality" required />
															</div>
														</div>

														<div class="form-group ">
															<label for="ccomment" class="control-label col-lg-2">Comment</label>
															<div class="col-lg-10">
																<textarea class="form-control " id="ccomment"
																	name="message" required></textarea>
															</div>
														</div>
														<div class="form-group">
															<div class="col-lg-offset-2 col-lg-10">
																<button class="btn btn-primary" type="submit">Submit</button>
																<button class="btn btn-default" type="button">Cancel</button>
															</div>
														</div>
													</form>

												</div>
										</section>
									</div>
























									<!-- existing-product-form -->
									<div id="existing-product-form" class="tab-pane active">
										<section class="panel">
											<div class="panel-body bio-graph-info">
												<h1>Existing Product Form</h1>
												<div class="form">
													<form class="form-validate form-horizontal"
														id="add_task_form" method="post" action="oldStock.do">


														<div class="form-group ">
															<label for="cname" class="control-label col-lg-2">Task
																Name <span class="required">*</span>
															</label>
															<div class="col-lg-10">
																<input class="form-control" id="cname" name="name"
																	minlength="5" type="text" required />
															</div>
														</div>
														<div class="form-group ">
															<label for="cname" class="control-label col-lg-2">Task
																Progress <span class="required">*</span>
															</label>
															<div class="col-lg-10">

																<select name="progress" form="add_task_form"
																	class="form-control m-bot15">
																	<option>Not Started</option>
																	<option>In Progress 20%</option>
																	<option>In Progress 50%</option>
																	<option>In Progress 80%</option>


																</select>
															</div>
														</div>

														<div class="form-group ">
															<label for="cname" class="control-label col-lg-2">Product
																Name<span class="required">*</span>
															</label>
															<div class="col-lg-10">


																<!--  	<li class="dropdown">
								                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown"><c:out value="${stask.product.name}" /><b class="caret"></b></a>
								                    <ul class="dropdown-menu">
								                       <c:forEach items="${products}" var="product">
								                            <li><c:out value="${product.name}" /></li>
								                       </c:forEach>
								                    </ul>
						                  		</li>-->
																</td> <select name="product2" form="add_task_form"
																	class="form-control m-bot15">
																	<c:forEach items="${products}" var="product">
																		<option><c:out value="${product.id}" /> :
																			<c:out value="${product.name}" />(Stock)
																			<c:out value="${product.quality}" />)
																		</option>
																	</c:forEach>

																</select>

															</div>
														</div>



														<input type="hidden" name="listid" value=0 />
														<div class="form-group">
															<label class="control-label col-lg-2">Date2</label>
															<div class="col-lg-10">
																<input name="date" id="dp2" value="28-10-2013"
																	type="text" size="16" class="form-control">
															</div>
														</div>





														<div class="form-group ">
															<label for="cname" class="control-label col-lg-2">Priority
																<span class="required">*</span>
															</label>
															<div class="col-lg-10">

																<select name="priority" form="add_task_form"
																	class="form-control m-bot15">
																	<option selected="selected">medium</option>
																	<option>low</option>
																	<option>high</option>
																	<option>urgent</option>


																</select>
															</div>
														</div>
														<div class="form-group ">
															<label for="cname" class="control-label col-lg-2">Stock-In/Out
																Type <span class="required">*</span>
															</label>
															<div class="col-lg-10">

																<select name="type" form="add_task_form"
																	class="form-control m-bot15">
																	<option selected="selected">Out</option>
																	<option>In</option>
																</select>
															</div>
														</div>


														<div class="form-group ">
															<label for="cname" class="control-label col-lg-2">Quality
																<span class="required">*</span>
															</label>
															<div class="col-lg-10">
																<input class="form-control " id="cname" type="number"
																	name="quality" required />
															</div>
														</div>

														<div class="form-group ">
															<label for="ccomment" class="control-label col-lg-2">Comment</label>
															<div class="col-lg-10">
																<textarea class="form-control " id="ccomment"
																	name="message" required></textarea>
															</div>
														</div>
														<div class="form-group">
															<div class="col-lg-offset-2 col-lg-10">
																<button class="btn btn-primary" type="submit">Submit</button>
																<button class="btn btn-default" type="button">Cancel</button>
															</div>
														</div>
													</form>

												</div>
										</section>
									</div>
								</div>
							</div>
						</section>
					</div>
			</section>


			</div>
			</div>



		</section>
	</section>
	<!--main content end-->
	<div class="text-right">
		<div class="credits">
			<!--
            All the links in the footer should remain intact.
            You can delete the links only if you purchased the pro version.
            Licensing information: https://bootstrapmade.com/license/
            Purchase the pro version form: https://bootstrapmade.com/buy/?theme=NiceAdmin
          -->
			Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
		</div>
	</div>
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
		//knob
		$(function() {
			$(".knob").knob({
				'draw' : function() {
					$(this.i).val(this.cv + '%')
				}
			})
		});

		//carousel
		$(document).ready(function() {
			$("#owl-slider").owlCarousel({
				navigation : true,
				slideSpeed : 300,
				paginationSpeed : 400,
				singleItem : true

			});
		});

		//custom select box

		$(function() {
			$('select.styled').customSelect();
		});

		/* ---------- Map ---------- */
		$(function() {
			$('#map').vectorMap({
				map : 'world_mill_en',
				series : {
					regions : [ {
						values : gdpData,
						scale : [ '#000', '#000' ],
						normalizeFunction : 'polynomial'
					} ]
				},
				backgroundColor : '#eef3f7',
				onLabelShow : function(e, el, code) {
					el.html(el.html() + ' (GDP - ' + gdpData[code] + ')');
				}
			});
		});
	</script>
</body>

</html>
