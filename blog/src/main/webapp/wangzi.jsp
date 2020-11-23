<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/10/27
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="createMe/common.jsp"%>



<html>
<head>
    <meta charset="UTF-8">
    <title>后台-登录</title>
    <style>
   .form-input{

       margin-top: 15px;
   }

.buttonStyle{
    border-radius: 3px;


    background-color: #1ab394;
    border-color: #1ab394;
    color: #FFFFFF;
    display: block;
    width: 100% !important;
    margin-bottom: 15px;
}
    </style>

</head>
<body background="/blog/img/demo-1-bg.jpg">
     <div class="login  animated  fadeInDown">
         <div>
             <div>
                 <h2 style="color: white">秋波的秘密空间 </h2>
             </div>
             <h3 style="color: red">${message}</h3>
    <%--  onsubmit 在表单提交前调用  返回false 表单的元素不会提交--%>
            <form id="form" method="post" class="form-input" role="form" action="/blog/wangzi" onsubmit="return login()">
             <div class="form-group">
                 <input type="text" value="${userName}" name="userName" id="userName" placeholder="用户名" autofocus
                 class="form-control">
             </div>


             <div class="form-group">
                 <input type="text" name="password" placeholder="密码" class="form-control">
             </div>
                <div class="form">

                    <div class="form-group">
                        <label style="position: absolute ;left:200px;">
                            <img src="/blog/code" id="img" type="image" style="cursor: pointer"/></label>
                        <input type="text" name="authCode" class="form-control" id="autoCode"
                        style="width: 150px " placeholder="验证码">
                    <script>
                        var img = document.getElementById("img");
                        img.onclick = function (ev) {
                            this.src = "/blog/code?time=" + new Date();
                        }
                    </script>
                    </div>

                </div>

                 <input type="submit" value="登录" class="btn btn-primary block full-width m-b">

            </form>
         </div>
     </div>
        <script type="text/javascript">
            //登录
            function login() {
                var username = $("#userName").val();
                var password = $("#password").val();
                var autoCode = $("#autoCode").val();

                if (username == "") {
                    alert("用户名不能为空");
                    return false;
                }
                if (password == "") {
                    alert("密码不能为空");
                    return false;
                }
                if (autoCode == "") {
                    alert("验证码不能为空");
                    return false;
                }
            }


        </script>


</body>
</html>
