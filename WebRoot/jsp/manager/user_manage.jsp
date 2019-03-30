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

				<!-- Basic Forms & Horizontal Forms-->

				</div>
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
														data-toggle="modal"><i class="icon_plus_alt2"></i></a> <a
														class="btn btn-success" href="getUser.do?id=${user.id}"
														data-toggle="modal"><i class="icon_pencil-edit_alt"></i></a>
													<a class="btn btn-danger" href="delUser.do?id=${user.id}"><i
														class="icon_close_alt2"></i></a>
												</div>
											</td>
										</tr>
									</c:forEach>


								</tbody>
							</table>
						</section>


						<!-- modal for add user start -->
						<div aria-hidden="true" aria-labelledby="add_User" role="dialog"
							tabindex="-1" id="add_User_Modal" class="modal fade">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button aria-hidden="true" data-dismiss="modal" class="close"
											type="button">¡Á</button>
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
													<input name="date" id="dp1" type="text" value="28-10-2013"
														size="16" class="form-control">
												</div>
											</div>
											<button type="submit" class="btn btn-primary">Submit</button>
										</form>


									</div>
								</div>
							</div>
						</div>

						<!-- modal for add user end -->




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
	<%@ include file="parts/footer.jsp"%>
</body>
</html>