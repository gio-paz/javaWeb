<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "prueba_tecnicaGet.get" %>
<%@page import = "javax.swing.table.DefaultTableModel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" >
</head>
<body  style="background-color: #f5f5f5;">

<div class="container">
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
	get cone =new get();
    DefaultTableModel tabla = new DefaultTableModel();
    tabla = cone.leer();
    for (int i=0;i<tabla.getRowCount();i++){
    	out.println("<tr>");
    	out.println("<td>"+tabla.getValueAt(i,0)+"</td>");
    	out.println("<td>"+tabla.getValueAt(i,1)+"</td>");
    	out.println("<td>"+tabla.getValueAt(i,2)+"</td>");
    	out.println("<td>"+tabla.getValueAt(i,3)+"</td>");
    	out.println("<td>"+tabla.getValueAt(i,4)+"</td>");
    	out.println("<td>"+tabla.getValueAt(i,5)+"</td>");
    	out.println("</tr>");
    }
	%>  
    </tbody>
  </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>