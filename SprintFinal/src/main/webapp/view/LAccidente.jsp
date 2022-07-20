<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="utf-8">
		<title>Los con Accidente</title>
		<!-- CSS only -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
			integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
			
			<link href="//cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css" rel="stylesheet" />
			
		<style>
			<%@include file="/static/css/css.css" %>
		</style>
		
	</head>

	<body class="bg-dark">

		<%@ include file="nav.jsp" %>

			<div class="container py-5 h-100">
            <div class="row d-flex justify-content-center align-items-center h-100">
              <div class="col-9 p-3 ">
                <div class="card card-registration my-4">
                  <div class="row g-0 p-5">
			
				<h1 style="padding:10px; text-align:center;">Accidentes</h1>
				
			<table class="table table-dark table-striped border border-light" id="accidente">
				<thead>
					<tr>
						<th>ID</th>
						<th>RUT cliente</th>
						<th>Día</th>
						<th>Hora</th>
						<th>Lugar</th>
						<th>Origen</th>
						<th>Consecuencias</th>
						<th>Editar</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="c" items="${capacitaciones}">
						<tr>
							<th><c:out value="${c.getIdentificador()}"></c:out></th>
							<td><c:out value="${c.getRut()}"></c:out></td>
							<td><c:out value="${c.getDia()}"></c:out></td>
							<td><c:out value="${c.getHora()}"></c:out></td>
							<td><c:out value="${c.getLugar()}"></c:out></td>
							<td><c:out value="${c.getDuracion()} min"></c:out></td>
							<td><c:out value="${c.getCantAsistentes()}"></c:out></td>
							

							<td><a class="link-secondary"
								href="#?op=edit&id=${c.getIdentificador()}"><i class="fa-solid fa-pen"></i></a>  &nbsp; &nbsp; <a class="link-secondary"
								href="#op=del&id=${c.getIdentificador()}"><i class="fa-regular fa-trash-can"></i></a>
							</td>

						</tr>
					</c:forEach>
				</tbody>

			</table>
			
			
			              </div>
                </div>
              </div>
            </div>
          </div>

				
			
			
			<!-- JavaQuerry datatable-->
			<script
					src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>
			
				
				<script src="//cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
			
				<script>
					$(document).ready(function() {
						$('#accidente').DataTable();
					});
				</script>
			
			<!-- simboliwis-->	
			<script src="https://kit.fontawesome.com/81a2ed02b0.js" crossorigin="anonymous"></script>

			<!-- JavaScript Bundle with Popper -->
			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
				integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
				crossorigin="anonymous"></script>

	</body>

	</html>