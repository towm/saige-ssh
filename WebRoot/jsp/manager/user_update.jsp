<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="parts/resources.jsp"%>
<title>Insert title here</title>
</head>
<body>

	<!-- container section start -->
	<section id="container" class="">

		<!-- header start -->
		<%@ include file="parts/header.jsp"%>
		<!--header end-->

		<!--sidebar start-->
		<%@ include file="parts/aside.jsp"%>
		<!--sidebar end-->

		<!--main content start-->


		<section id="main-content">
			<section class="wrapper">
				<div class="row">
					<div class="col-lg-12">
						<h3 class="page-header">
							<i class="fa fa-file-text-o"></i> Form elements
						</h3>
						<ol class="breadcrumb">
							<li><i class="fa fa-home"></i><a href="index.html">Home</a></li>
							<li><i class="icon_document_alt"></i>Forms</li>
							<li><i class="fa fa-file-text-o"></i>Form elements</li>
						</ol>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-12">
						<section class="panel">
							<header class="panel-heading"> Form Elements </header>

							<div class="panel-body">

								<form class="form-horizontal" id="update_user_form" role="form"
									method="post" action="/lyn-ssh/user/updateUser.do">
									<div class="form-group">
										<label for="exampleInputEmail1" class="col-lg-2 control-label">Name</label>
										<div class="col-lg-10">
											<input name="name" value='${user.name}' class="form-control"
												id="nameInput1" placeholder="Name">
										</div>
									</div>

									<div class="form-group">
										<label for="exampleInputEmail1" class="col-lg-2 control-label">City</label>
										<div class="col-lg-10">
											<input name="city" value='${user.city}' class="form-control"
												id="cityInput1" placeholder="City">
										</div>
									</div>
									<div class="form-group">
										<label for="exampleInputEmail1" class="col-lg-2 control-label">Email
											address</label>
										<div class="col-lg-10">
											<input name="email" value='${user.email}' type="email"
												class="form-control" id="emailInput1" placeholder="Email">
										</div>

									</div>
									<div class="form-group">
										<label class="control-label col-lg-2" for="inputSuccess">Role</label>
										<div class="col-lg-10">
											<select value="${user.email}" name="role"
												form="update_user_form" class="form-control m-bot15">
												<option selected="selected">${user.role}</option>
												<option>Manager</option>
												<option>Stock Manager</option>
												<option>Purchaser</option>
												<option>Producer</option>
												<option>Seller</option>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="exampleInputEmail1">Phone</label>
										<div class="col-lg-10">
											<input value='${user.phone}' name="phone" type="tel"
												class="form-control" id="phoneInput1"
												placeholder="Phone Number">
										</div>
									</div>
									<div class="form-group">
										<label for="exampleInputPassword1"
											class="col-lg-2 control-label">Password</label>
										<div class="col-lg-10">
											<input value='${user.password}' name="password"
												class="form-control" id="passwordInput1"
												placeholder="Password">
										</div>
									</div>

									<input name="id" type="hidden" value="${user.id}">

									<div class="form-group">
										<label class="col-lg-2 control-label">Starts with
											years view</label>
										<div class="col-lg-10">


											<div class="input-append date" id="dpYears"
												data-date="18-06-2013" data-date-format="dd-mm-yyyy"
												data-date-viewmode="years">
												<input name="date" id="dp1" type="text" value='${user.date}'
													size="16" class="form-control"> <span
													class="add-on"><i class="icon-calendar"></i></span>
											</div>
										</div>
									</div>

									<button type="submit" class="btn btn-primary">Submit</button>
								</form>
								<!-- modal for update user end -->



							</div>
						</section>

					</div>
				</div>

				<!-- page end-->
			</section>
		</section>




		<!--main content end-->


	</section>
	<!-- container section end -->
	<%@ include file="parts/footer.jsp"%>
</body>
</html>


