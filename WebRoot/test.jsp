<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="GB18030">
<title>Insert title here</title>
</head>
<body>

                                <!-- Pass the user obj then fill the form with it -->
										<tr>
											<td><c:out value="${user.name}" /></td>
											<td><a onclick="var x=${user}; myFunction(x)" data-toggle="modal">pass the user</a></td>
											
										</tr>

                                <!-- form section -->
                                 <div id="update_User_Modal5">
													<form id="update_user_form" role="form">
														<div >
															<label >Name</label> <input name="name" id="nameInput1" placeholder="Name">
														</div>
													</form>
                                   </div>			
	
	
	
	<!-- TO test if passing object as parameter in onclick() method is available -->
	<script>
function myFunction(obj) {
	alert(obj.name);
	document.getElementById("nameInput1").value=obj.name;
}
</script>

</body>
</html>