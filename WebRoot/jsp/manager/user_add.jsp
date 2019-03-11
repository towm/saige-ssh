<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
  <head>
	 <base href="<%=basePath%>">
    <title>back_front</title>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
   <!--  <script type="text/javascript" src="js/jquery-1.6.4.min.js"></script>-->
   <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>


</head>
<body>
    <form id="form" action="user/url.do" method="post">
    	<div class="form-group">
            <label for="name">姓名</label> 
            <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
        </div>
        
        <div class="form-group">
            <label for="name">password</label> 
            <input type="text" class="form-control" id="password" name="password" placeholder="请输入密码">
        </div>
        
        <div class="form-group">
            <label for="name">sex</label> 
            <input type="text" class="form-control" id="sex" name="sex" placeholder="请输入性别">
        </div>
        
        <div class="form-group">
            <label for="name">email</label> 
            <input type="text" class="form-control" id="email" name="email" placeholder="请输入email">
        </div>
        <div class="form-group">
            <label for="id">id</label> 
            <input type="text" class="form-control" id="email" name="id" placeholder="请输入id">
        </div>
        
        <div class="form-group">
            <p class="help-block">这里是块级帮助文本的实例。</p>
        </div>
        
        <div class="checkbox">
            <label> <input type="checkbox" name="check"> 请打勾 </label>
        </div>
        <button type="summit">aa</button>
     
    </form>
 <button id="b01" style="text-decoration: none;">使用ajax提交表单数据</button>
 <div id="div1"><h2>使用 jQuery AJAX 修改文本内容</h2></div>
<button>获取其他内容</button>
 
</body>


  
</html>
