<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="utf-8">
		<title>Capacitacion</title>
		<!-- CSS only -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
			integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
			
		<style>
			<%@include file="/static/css/css.css" %>
		</style>
	</head>

	<body>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<%@ include file="nav.jsp" %>
			<c:if test="${op == 'new'}">
				<h3>Crear Capacitacion]</h3>
			</c:if>
			
			<c:if test="${message == 'message'}">
 				<div class="alert alert-success" Style="margin-top: 100px; text-align: center;">
					    <h1>¡Enviado!</h1>
					    <p> ${datos} </p>
				</div>
 			</c:if>
			
			<section class="h-100 ">
				<div class="container py-5 h-100">
 									
					<div class="row d-flex justify-content-center align-items-center h-100">
						<div class="col">
							<div class="card card-registration my-4">
								<div class="row g-0">
								
								
 									
									<div class="col-xxl-6 col-xl-3 col-md-3 d-none d-xl-block">
										<img src="https://i.pinimg.com/originals/c2/da/e0/c2dae0e1c7cebd79e0b1bbf339f0fbda.gif"
											height="2000" width="2000" alt="cosiwis" class="img-fluid"
											Style="height:100%;" />
									</div>
									
									<div class="col-xxl-6 col-xl-9 col-md-9">
									
										<div class="card-body p-md-5 text-black">
											<h3 class="mb-5 text-uppercase">Crear Capacitación</h3>
											
											

											<hr>


											<form method="post" class="form">
											
											<div class="form-outline mb-4">
													<label class="form-label" for="rut">Identificador de la capacitacion </label>
	
													<input required min="0" max="99999999" type="number" id="identificador" class="form-control form-control-lg" 
														name="identificador" max="9999999" min="0" value="${capacitacion.getIdentificador() }"/>
	
												</div>
											
											
												<div class="form-outline mb-4">
													<label class="form-label" for="rut">RUT Cliente (sin puntos ni digito
														verificador)</label>
	
													<input required min="0" max="99999999" type="number" id="rut" class="form-control form-control-lg" 
														name="rut" max="9999999" min="0" value="${capacitacion.getRut() }"/>
	
												</div>
	
												<div class="form-outline mb-4">
													<label class="form-label" for="dia">Dia de la semana</label>
	
													<select required class="form-select" name="dia">
														<option value="Lunes">Lunes</option>
														<option value="Martes">Martes</option>
														<option value="Miercoles">Miercoles</option>
														<option value="Jueves">Jueves</option>
														<option value="Viernes">Viernes</option>
														<option value="Sabado">Sabado</option>
														<option value="Domingo">Domingo</option>
	
	
													</select>
	
												</div>
	
	
	
												<div class="form-outline mb-4">
													<label class="form-label" for="hora">Hora</label>
	
													<input required type="time" id="hora" class="form-control" name="hora"/>
	
												</div>
	
												<div class="form-outline mb-4">
													<label class="form-label" for="lugar">Lugar</label>
	
													<input required minlength="10" maxlength="50" type="text" id="lugar" name="lugar" class="form-control form-control-lg" />
	
												</div>
	
												<div class="form-outline mb-4">
													<label class="form-label" for="duracion">Duración (minutos)</label>
	
													<input required type="number" id="duracion" name="duracion" maxlength="70" class="form-control form-control-lg" />
	
												</div>
	
												<div class="form-outline mb-4">
													<label class="form-label" for="cAsistentes">Asistentes (maximo 1000)</label>
	
													<input required type="number" id="cantidadDeAsistentes" name="cantidadDeAsistentes" class="form-control form-control-lg"
														max="1000" />
	
												</div>
	
												<!-- botones -->
												<div class="d-flex justify-content-end pt-3">
													<button type="reset" class="btn btn-light btn-lg">Reset</button>
													<button type="submit" class="btn btn-dark btn-lg ms-2">Enviar</button>
												</div>

											</form>
											
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

			</section>


			<!-- JavaScript Bundle with Popper -->
			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
				integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
				crossorigin="anonymous"></script>

	</body>

	</html>