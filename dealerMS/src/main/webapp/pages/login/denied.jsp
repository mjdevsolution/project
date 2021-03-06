<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Mosaddek">
<meta name="keyword" content="FlatLab, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
<link rel="shortcut icon" href="resources/img/favicon.html">

<title>404</title>

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

<body class="body-404">

	<div class="container">

		<section class="error-wrapper">
			<!-- <i class="icon-404"></i> -->
			<h1>401</h1>

			<hr />

			<h2>Unauthorized Access !!</h2>
			<p class="page-404">

				<c:if test="${not empty error}">
					<div style="color: red">
						Your fake login attempt was bursted, dare again !!<br /> Caused :
						${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
					</div>
				</c:if>

				<a href="login">Login</a>
			</p>
		</section>

	</div>
</body>
</html>
