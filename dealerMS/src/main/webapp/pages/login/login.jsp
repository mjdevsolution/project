<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Mosaddek">
<meta name="keyword" content="FlatLab, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
<link rel="shortcut icon" href="resources/img/favicon.html">

<title>FlatLab - Flat & Responsive Bootstrap Admin Template</title>

<!-- Bootstrap core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/bootstrap-reset.css" rel="stylesheet">
<!--external css-->
<link href="resources/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
<!-- Custom styles for this template -->
<link href="resources/css/style.css" rel="stylesheet">
<link href="resources/css/style-responsive.css" rel="stylesheet" />

<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
<!--[if lt IE 9]>
    <script src="resources/js/html5shiv.js"></script>
    <script src="resources/js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="login-body">

	<div class="container">

		<form class="form-signin" action="<c:url value='j_spring_security_check'/>" method="POST">

			<h2 class="form-signin-heading">sign in now</h2>

			<div class="login-wrap">

				<input type="text" name='j_username' class="form-control" placeholder="User ID" autofocus>
				<input type="password" name='j_password' class="form-control" placeholder="Password">

				<label class="checkbox">
					<input type="checkbox" value="remember-me">
					Remember me
					<span class="pull-right">
						<a href="#"> Forgot Password?</a>
					</span>
				</label>

				<button class="btn btn-lg btn-login btn-block" type="submit">Sign in</button>

			</div>

		</form>

	</div>

</body>

</html>
