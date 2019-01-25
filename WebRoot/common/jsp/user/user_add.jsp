<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
  <head>

    <title>back_front</title>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">

   <script type="text/javascript">
    function bsubmit(){
        var form = document.forms[0];
        form.action = "<%=basePath%>test/form1.do";
        form.method = "post";
        form.submit();
    }
   //若是form表单的基础信息都填写完成，想直接提交，那么可以使用:
   // js: document.getElementById("myform").submit();
   //jquery: $("#myform").submit();

   </script>
  </head>

  <body>
    <form role="form" id="myform" name="myform" method="post" action="<%=basePath%>test/form1_1.do">
        <div class="form-group">
            <label for="name">名称</label> <input type="text" class="form-control"
                id="name" name="name" placeholder="请输入名称">
        </div>
        <div class="form-group">
            <p class="help-block">这里是块级帮助文本的实例。</p>
        </div>
        <div class="checkbox">
            <label> <input type="checkbox" name="check"> 请打勾 </label>
        </div>
        <input type="button" value="提交" onclick="bsubmit();"/>  //通过调用bsubmit()js方法提交表单。
        <!-- <a href="javascript:void(0);" onclick="bsubmit();" >提交</a>-->
        <!-- <button type="button" onclick="bsubmit();">提交</button>-->
    </form>

  </body>
</html>
