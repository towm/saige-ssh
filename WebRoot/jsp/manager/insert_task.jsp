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
				<div class="row">
					<div class="col-lg-12">
						<section class="panel">
							<header class="panel-heading"> Task Form </header>

							<div class="panel-body">
								<div class="form">
									<form class="form-validate form-horizontal" id="add_task_form"
										method="post" action="/lyn-ssh/task/addTask.do">
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
													<option selected="selected">Not Started</option>
													<option>In Progress 20%</option>
													<option>In Progress 50%</option>
													<option>In Progress 80%</option>
													<option>Completed</option>

												</select>
											</div>
										</div>
										<div class="form-group">
											<label class="control-label col-lg-2">Datepicker</label>
											<div class="col-lg-10">
												<input name="date" id="dp1" type="text" value="28-10-2013"
													size="16" class="form-control">
											</div>
										</div>





										<input type="hidden" name="produceid" value=0 /> <input
											type="hidden" name="ptaskid" value=0 /> <input
											type="hidden" name="stockid" value=0 />

										<div class="form-group ">
											<label for="cname" class="control-label col-lg-2">Task
												Priority <span class="required">*</span>
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
											<label for="cname" class="control-label col-lg-2">Quality
												<span class="required">*</span>
											</label>
											<div class="col-lg-10">
												<input class="form-control " id="cname" type="number"
													name="quality" required />
											</div>
										</div>

										<div class="form-group ">
											<label for="ccomment" class="control-label col-lg-2">Feedback</label>
											<div class="col-lg-10">
												<textarea class="form-control " id="ccomment" name="message"
													required></textarea>
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

							</div>
						</section>
					</div>
				</div>



			</section>
		</section>
		<!--main content end-->
		<!-- container section end -->
		<%@ include file="parts/footer.jsp"%>
</body>
</html>
