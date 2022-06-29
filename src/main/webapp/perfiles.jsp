<%@page import="org.json.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="prueba_tecnicaGet.get"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body style="background-color: #f5f5f5;">

	<div class="container">
		<nav class="navbar navbar-dark bg-primary">
			<div class="container-fluid">
				<a class="navbar-brand" href="index.jsp">HOME</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNav"
					aria-controls="navbarNav" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
			</div>
		</nav>
		<h2>PERFILES CREADOS</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>NOMBRE</th>
					<th>APELLIDO</th>
					<th>EMAIL</th>
					<th>TELEFONO</th>
					<th>CIUDAD</th>
					<th>PAIS</th>
				</tr>
			</thead>
			<tbody>

				<%
				get cone = new get();
				JSONObject datos = cone.getDatos();
				for (int i = 0; i < datos.getJSONArray("datos").length(); i++) {
					JSONObject d = datos.getJSONArray("datos").getJSONObject(i);
					out.println("<tr>");
					out.println("<td>" + d.get("nombre") + "</td>");
					out.println("<td>" + d.get("apellido") + "</td>");
					out.println("<td>" + d.get("email") + "</td>");
					out.println("<td>" + d.get("telefono") + "</td>");
					out.println("<td>" + d.get("ciudad") + "</td>");
					out.println("<td>" + d.get("pais") + "</td>");
					out.println("</tr>");
				}
				%>
			</tbody>
		</table>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>