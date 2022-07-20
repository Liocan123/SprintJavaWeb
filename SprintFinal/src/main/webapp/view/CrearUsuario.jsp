<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="UTF-8">
		<title>Crear Usuario</title>

		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
			integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
			
		<style>
			<%@include file="/static/css/css.css" %>
		</style>

	</head>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

		<body>

			<%@ include file="nav.jsp" %>

				<section class="h-100 bg-dark">
					<div class="container py-5 h-100">
						<div class="row d-flex justify-content-center align-items-center h-100">
							<div class="col">
								<div class="card card-registration my-4">
									<div class="row g-0">

										<div class="col-xxl-6 col-xl-3 col-md-1 d-none d-xl-block">
											<img src="https://i.pinimg.com/originals/a7/a5/bd/a7a5bdecb77f7e56279f792eadb68c22.gif"
												height="2000" width="2000" alt="cosiwis" class="img-fluid"
												Style="height:100%;" />
										</div>
										
										<div class="col-xxl-6 col-xl-9 col-md-11">
											<div class="card-body p-md-5 text-black">
												<h3 class="mb-5 text-uppercase">Registro de Usuario</h3>

												<hr>
												<h5 class="mb-5 text-uppercase">Datos Usuario</h5>
												<form method="post" class="form">
												<div class="form-outline mb-4">
													<label class="form-label" for="nombreU">Nombre de Usuario</label>
													<input required minlength="10" maxlength="50" type="text" id="nombreU" name="nombreU"
														class="form-control form-control-lg" />

												</div>


													<div class="form-outline mb-4">
														<label class="form-label" for="fechaN">Fecha de Nacimiento</label>
														<input required type="date" id="fechaN" name="fechaN"
															class="form-control form-control-lg" />
													</div>


												<div class="form-outline mb-4">
													<label class="form-label" for="run">RUN (sin puntos ni digito
														verificador)</label>

													<input min="1" max="99999999" type="number" id="run" name="run"
														class="form-control form-control-lg" />

												</div>

												<!-- cliente -->
												<c:if test="${op == 'cc'}">
													<hr>
													<h5 class="mb-5 text-uppercase">Datos Cliente</h5>

													<div class="form-outline mb-4">
														<label class="form-label" for="rut">RUT (sin puntos ni digito
															verificador)</label>

														<input required min="1" max="99999999" type="number" id="rut" name="rut"
															class="form-control form-control-lg" />

													</div>

													<div class="row">
														<div class="col-md-6 mb-4">
															<div class="form-outline">
																<label class="form-label"
																	for="nombreC">Nombre</label>

																<input required minlength="5" maxlength="30" type="text" id="nombreC" name="nombreC"
																	class="form-control form-control-lg" />

															</div>
														</div>

														<div class="col-md-6 mb-4">
															<div class="form-outline">
																<label class="form-label"
																	for="apellidoC">Apellido</label>

																<input required minlength="5" maxlength="30" type="text" id="apellidoC" name="apellidoC"
																	class="form-control form-control-lg" />

															</div>
														</div>
													</div>


													<div class="form-outline mb-4">
														<label class="form-label" for="tel">Telefóno</label>

														<input required type="tel" id="tel" name="tel"
															class="form-control form-control-lg" />

													</div>
													
													<div class="form-outline mb-4">
														<label class="form-label" for="afp">Nombre AFP</label>

														<input minlength="4" maxlength="30" type="text" id="afp" name="afp"
															class="form-control form-control-lg" />

													</div>


													<div class="form-outline mb-4">
														<label class="form-label" for="sistemaSalud">Sistema de Salud</label>
														<select class="form-select" id="sSalud" name="sSalud">
															<option value="1">Fonasa</option>
															<option value="2">Isapre</option>
														</select>

													</div>


													<div class="row">
														<div class="col-md-6 mb-4">
															<div class="form-outline">
																<label class="form-label"
																	for="direccion">Direccion</label>

																<input maxlength="70" type="text" id="direccion" name="direccion"
																	class="form-control form-control-lg" />

															</div>
														</div>

														<div class="col-md-6 mb-4">
															<div class="form-outline">
																<label class="form-label"
																	for="comuna">Comuna</label>

																<input maxlength="50" type="text" id="comuna" name="comuna"
																	class="form-control form-control-lg" />

															</div>
														</div>
													</div>


												</c:if>
												<!-- Profesional -->
												<c:if test="${op == 'cp'}">
													<hr>
													<h5 class="mb-5 text-uppercase">Datos Profesional</h5>

													<div class="form-outline mb-4">
														<label class="form-label" for="titulo">Título</label>

														<input required minlength="10" maxlength="50" type="text" id="titulo" name="titulo"
															class="form-control form-control-lg" />

													</div>

													<div class="form-outline mb-4">
														<label class="form-label" for="ingreso">Fecha de Ingreso</label>
														<input type="date" id="ingreso" name="ingreso"
															class="form-control form-control-lg" />
													</div>
												</c:if>

												<!-- Administrativo -->
												<c:if test="${op == 'ca'}">
													<hr>
													<h5 class="mb-5 text-uppercase">Datos Administrativo</h5>


													<div class="form-outline mb-4">
														<label class="form-label" for="area">Área</label>

														<input required minlength="10" maxlength="50" type="text" id="area" name="area"
															class="form-control form-control-lg" />

													</div>

													<div class="form-outline mb-4">
														<label class="form-label" for="exp">Experiencia
															previa</label>

														<input maxlength="100" type="text" id="exp" name="exp"
															class="form-control form-control-lg" />

													</div>

												</c:if>

												<!-- botones -->
												<div class="d-flex justify-content-end pt-3">
													<button type="reset" class="btn btn-light btn-lg">Reset all</button>
													<button type="submit" class="btn btn-dark btn-lg ms-2">Submit
														form</button>
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