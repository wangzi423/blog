<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common.jsp"%>

<html>

<head>
	<meta charset="utf-8">
<title>后台 - 登录</title>
<style>
.loginscreen.middle-box {
	padding-top: 100px;//设置距离顶部距离
}

</style>
</head>

<body background="/blog/img/demo-1-bg.jpg">
	<div class="middle-box text-center loginscreen  ">
		<div>
			<div>
				<h2 style="color: white">王子祥的博客</h2>
			</div>

				<div class="form-group">
					<input type="text" value="${username}" autofocus name="username" id="username"
						class="form-control" placeholder="用户名">

				</div>

				<div class="form-group">
					<input type="password" name="password" id="password"
						class="form-control" placeholder="密码">
				</div>

				</div>
				<input type="submit" class="btn btn-primary block full-width m-b"
				value="登 录"/>
			</form>

		</div>
	</div>

</body>
</html>