<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<aside>
	<div id="sidebar" class="nav-collapse ">
		<!-- sidebar menu start-->
		<ul class="sidebar-menu">
			<li class="active"><a class="" href="index.do"> <i
					class="icon_house_alt"></i> <span>Dashboard</span>
			</a></li>
			<li class="sub-menu"><a href="javascript:;" class=""> <i
					class="icon_document_alt"></i> <span>Forms</span> <span
					class="menu-arrow arrow_carrot-right"></span>
			</a>
				<ul class="sub">
					<li></li>
					<li><a class="" href="insert.do">Task Form</a></li>


				</ul></li>
			<li class="sub-menu"><a href="javascript:;" class=""> <i
					class="icon_table"></i> <span>Tables</span> <span
					class="menu-arrow arrow_carrot-right"></span>
			</a>
				<ul class="sub">
					<li><a class="" href="taskList.do">Task Table</a></li>
					<li><a class="" href="userList.do">User Management</a></li>
				</ul></li>

		</ul>
		<!-- sidebar menu end-->
	</div>
</aside>