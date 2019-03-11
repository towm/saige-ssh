<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
<head>
 <%@ include file="parts/resources.jsp" %>  
<title>Insert title here</title>
</head>
<body>

  <!-- container section start -->
  <section id="container" class="">

		<!-- header start -->
	    <%@ include file="parts/header.jsp" %>  
	    <!--header end-->
	
	    <!--sidebar start-->
	     <%@ include file="parts/aside.jsp" %>  
	    <!--sidebar end-->
	    
	        <!--main content start-->
    <section id="main-content">
			<section class="wrapper">

				<!-- Basic Forms & Horizontal Forms-->

				<div class="row">
          <div class="col-lg-12">
            <section class="panel">
              <header class="panel-heading">
                Responsive tables
              </header>
              <div class="table-responsive">
                <table class="table">
                  <thead>
                    <tr>
                      <th>#</th>
                      <th>Task Name</th>
                      <th>Task Date</th>
                      <th>Purchase Sub-Task Id</th>
                      <th>Produce Sub-Task Id</th>
                      <th>Task Stock Related List Id</th>
                      <th>Task Status</th>
                      <th>Task Product Quality</th>
                      <th>Task Priority</th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach items="${tasks}" var="task">
										<tr>
										<td><c:out value="${task.id}" /></td>
											<td><c:out value="${task.name}" /></td>
											<td><c:out value="${task.date}" /></td>
											<td><c:out value="${task.ptaskid}" /></td>
											<td><c:out value="${task.produceid}" /></td>
											<td><c:out value="${task.stockid}" /></td>
											<td><li class="dropdown">
                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown"><c:out value="${task.progress}" /><b class="caret"></b></a>
                    <ul class="dropdown-menu">
                      <li><a href="updateTaskStatus.do?id=${task.id}&status=0">Set Not Started</a></li>
                      <li><a href="updateTaskStatus.do?id=${task.id}&status=1">Set In Progress 20%</a></li>
                      <li><a href="updateTaskStatus.do?id=${task.id}&status=2">Set In Progress 50%</a></li>
                      <li><a href="updateTaskStatus.do?id=${task.id}&status=3">Set In Progress 80%</a></li>
                      <li><a href="updateTaskStatus.do?id=${task.id}&status=4">Set Completed</a></li>
                      
                    </ul>
                  </li></td>
											<td><c:out value="${task.quality}" /></td>
											<td><span class="badge bg-${task.priority}"><c:out value="${task.priority}" /></span></td>
										</tr>
									</c:forEach>
                  </tbody>
                </table>
              </div>

            </section>
          </div>
        </div>


			</section>
		</section>
    <!--main content end-->
	    
    
  </section>
  <!-- container section end -->
  <%@ include file="parts/footer.jsp" %>
</body>
</html>


   
  