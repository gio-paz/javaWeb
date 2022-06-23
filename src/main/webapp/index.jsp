<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CREAR PERFIL</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" >
</head>
<body style="background-color: #f5f5f5;">
 <app-root></app-root>
  <!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
<div class="container">
    <div class="card mt-5">
        <div class="card-body" >
        	<form id="fromi" class="formulario" action="get">
            <div class="mb-3">
                <label for="nombre" class="form-label">NOMBRE:</label>
                <input type="text" class="form-control" id="nombre" placeholder="Nombre" required>
            </div>
    
            <div class="mb-3">
                <label for="apellido" class="form-label">APELLIDO:</label>
                <input type="text" class="form-control" id="apellido" placeholder="Apellidos" required>
            </div>
    
            <div class="mb-3">
                <label for="email" class="form-label">EMAIL:</label>
                <input type="email" class="form-control" id="email" placeholder="Email" required>
            </div>
    
            <div class="mb-3">
                <label for="telefono" class="form-label" >NUMERO DE TELEFONO:</label>
                <input type="tel" class="form-control" id="telefono" placeholder="Numero de telefono" required>
            </div>
    
            <div class="mb-3">
                <label for="Ciudad" class="form-label">CIUDAD:</label>
                <input type="text" class="form-control" id="Ciudad" placeholder="Ciudad" required>
            </div>
    
            <div class="mb-3">
                <label for="Pais" class="form-label">PAIS:</label>
                <input type="text" class="form-control" id="Pais" placeholder="Pais" required>
            </div>

            <div class="mb-3">
                <button type="submit" class="btn btn-primary">GUARDAR PERFIL</button>
            </div>
            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>