<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/htmlcharset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/boo
tstrap.min.css">
<title>Error found</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1 class="alert alert-danger">There is no user found with the
					user id ${invalidUserId}</h1>
			</div>
		</div>
	</section>
	<section>
		<div class="container">
			<p>${url}</p>
			<p>${exception}</p>
		</div>
		<div class="container">
			<p>
				<a href="<spring:url value="/users" />" class="btn btnprimary">
					<span class="glyphicon-hand-left glyphicon"></span> users
				</a>
			</p>
		</div>
	</section>
</body>
</html>