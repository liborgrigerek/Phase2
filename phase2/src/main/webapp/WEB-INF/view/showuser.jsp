<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>User Information</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>User information</h1>
			</div>
		</div>
	</section>
	<c:forEach items="${users}" var="user">
		<section class="container">
			<div class="row">
				<p>
					<a href="<spring:url value="/user?id=${user.id}" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span>ID: ${user.id}, NAME: ${user.name}
					</a>
				</p>
			</div>
		</section>
	</c:forEach>
</body>
</html>