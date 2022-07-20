<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="utf-8">
        <title>Contacto</title>
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
		<style>
			<%@include file="/static/css/css.css" %>
		</style>
    </head>
    
    

    <body class="bg-dark">

        <%@ include file="nav.jsp" %>

			<section class="h-100 ">
				<div class="container py-5 h-100">
 									
					<div class="row d-flex justify-content-center align-items-center h-100">
						<div class="col">
							<div class="card card-registration my-4">
								<div class="row g-0">
								
								
 									
									<div class="col-xl-3 d-none d-xl-block">
										<img src="https://i.pinimg.com/originals/c2/da/e0/c2dae0e1c7cebd79e0b1bbf339f0fbda.gif"
											height="2000" width="2000" alt="cosiwis" class="img-fluid"
											Style="height:100%;" />
									</div>
									
									<div class="col-xl-9">
									
										<div class="card-body p-md-5 text-black">
											<h3 class="mb-5 text-uppercase">Contacto</h3>
											
											

											<hr>


											<form method="post" class="form">
											
												<div class="form-outline mb-4">
													<label class="form-label" for="rut">RUT Empresa</label>
	
													<input required min="0" max="99999999" type="number" id="rut" class="form-control form-control-lg" name="rut" max="9999999" min="0"/>
	
												</div>
	
	
													<div class="row">
														<div class="col-md-6 mb-4">
															<div class="form-outline">
																<label class="form-label"
																	for="form3Example1m">Nombre</label>

																<input required minlength="5" maxlength="30" type="text" name="nombre" id="nombre" 
																	class="form-control form-control-lg" />

															</div>
														</div>

														<div class="col-md-6 mb-4">
															<div class="form-outline">
																<label class="form-label"
																	for="form3Example1n">Apellido</label>

																<input required minlength="5" maxlength="30" type="text" name="apellido" id="apellido" 
																	class="form-control form-control-lg" />

															</div>
														</div>
													</div>
													
													
													
													<div class="row">
														<div class="col-md-6 mb-4">
															<div class="form-outline">
																<label class="form-label" for="lugar">Email </label>
	
																<input required type="email" id="mail" name="mail" class="form-control form-control-lg" />

															</div>
														</div>

														<div class="col-md-6 mb-4">
															<div class="form-outline">
																<div class="form-outline mb-4">
																	<label class="form-label" for="lugar">Teléfono</label>
					
																	<input required type="tel" id="fono" name="fono" class="form-control form-control-lg" />
					
																</div>

															</div>
														</div>
													</div>
													
	
												<div class="form-outline mb-4">
													<label class="form-label" for="duracion">Mensaje</label>
	
													<textarea rows="10" class="form-control form-control-lg" id="mensaje" name="mensaje"> </textarea>
	
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