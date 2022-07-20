<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


	<c:if test="${ingreso == 'si'}">

		<!-- nav cliente -->

		<c:if test="${tipo == 'c'}">
			<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top" aria-label="Fourth navbar example">
				<div class="container-fluid">
					<a class="navbar-brand" href="${pageContext.request.contextPath}/index">Los sin Accidente&trade;</a>
					<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
						data-bs-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>

					<div class="collapse navbar-collapse" id="navbarsExample04">
						<ul class="navbar-nav me-auto mb-2 mb-md-0">

							<li class="nav-item">
								<a class="nav-link" href="${pageContext.request.contextPath}/contacto"> Contacto </a>
							</li>

							<li class="nav-item dropdown">
								<a class="nav-link dropdown-toggle" href="#" id="dropdown10" data-bs-toggle="dropdown"
									aria-expanded="false">Capacitaci&oacute;n</a>
								<ul class="dropdown-menu" aria-labelledby="dropdown10">

									<li> <a class="dropdown-item"
											href="${pageContext.request.contextPath}/ListarCapacitaciones"> Listar</a>
									</li>
									<li><a class="dropdown-item"
											href="${pageContext.request.contextPath}/crearcapacitacion"> Crear</a></li>

									<li>
										<p class="dropdown-item bg-dark text-light">Asistentes</p>
									</li>
									<li><a class="dropdown-item" href="#"> Listar </a></li>
									<li><a class="dropdown-item" href="#"> Agregar</a></li>
									<li><a class="dropdown-item" href="#">Eliminar</a></li>

								</ul>
							</li>

							<li class="nav-item dropdown">
								<a class="nav-link dropdown-toggle" href="#" id="dropdown10" data-bs-toggle="dropdown"
									aria-expanded="false">Accidentes</a>
								<ul class="dropdown-menu" aria-labelledby="dropdown10">

									<li><a class="dropdown-item" href="#"> Listar </a></li>
									<li><a class="dropdown-item" href="#"> Agregar</a></li>
									<li><a class="dropdown-item" href="#">Eliminar</a></li>

								</ul>
							</li>


							<li>
								<form method="post">

									<a class="nav-link" href="${pageContext.request.contextPath}/Logout?op=salir">
										logout </a>
								</form>
							</li>

						</ul>

					</div>
				</div>
			</nav>

		</c:if>


		<!-- nav administrativo -->
		<c:if test="${tipo == 'a'}">

			<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top" aria-label="Fourth navbar example">
				<div class="container-fluid">
					<a class="navbar-brand" href="${pageContext.request.contextPath}/index">Los sin Accidente&trade;</a>
					<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
						data-bs-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>

					<div class="collapse navbar-collapse" id="navbarsExample04">
						<ul class="navbar-nav me-auto mb-2 mb-md-0">



							<li class="nav-item dropdown">
								<a class="nav-link dropdown-toggle" href="#" id="dropdown10" data-bs-toggle="dropdown"
									aria-expanded="false">Usuario</a>
								<ul class="dropdown-menu" aria-labelledby="dropdown10">

									<li>
										<p class="dropdown-item bg-dark text-light">Crear</p>
									</li>
									<li><a class="dropdown-item"
											href="${pageContext.request.contextPath}/CrearUsuario?op=cc">Cliente</a></li>
									<li><a class="dropdown-item"
											href="${pageContext.request.contextPath}/CrearUsuario?op=cp">Profesional</a>
									</li>
									<li><a class="dropdown-item"
											href="${pageContext.request.contextPath}/CrearUsuario?op=ca">Administrativo</a>
									</li>
									<li>
										<hr class="dropdown-divider">
									</li>
									<li>
										<p class="dropdown-item bg-dark text-light">Listar/Editar</p>
									</li>
									<li><a class="dropdown-item" href="${pageContext.request.contextPath}/ListadoDeUsuarios?op=ec">Clientes</a></li>
									<li><a class="dropdown-item" href="${pageContext.request.contextPath}/ListadoDeUsuarios?op=ep">Profesionales</a></li>
									<li><a class="dropdown-item" href="${pageContext.request.contextPath}/ListadoDeUsuarios?op=ea">Administrativos</a></li>

								</ul>

							<li class="nav-item dropdown">
								<a class="nav-link dropdown-toggle" href="#" id="dropdown10" data-bs-toggle="dropdown"
									aria-expanded="false">Pagos</a>
								<ul class="dropdown-menu" aria-labelledby="dropdown10">
									<li><a class="dropdown-item" href="#"> Listar </a></li>
									<li><a class="dropdown-item" href="#"> Agregar</a></li>

								</ul>
							</li>

							<li class="nav-item dropdown">
								<a class="nav-link dropdown-toggle" href="#" id="dropdown10" data-bs-toggle="dropdown"
									aria-expanded="false">Administrar Chequeos</a>
								<ul class="dropdown-menu" aria-labelledby="dropdown10">
									<li><a class="dropdown-item" href="#"> Mostrar Chequeos a Cliente </a></li>
									<li><a class="dropdown-item" href="#"> Agregar Chequeo</a></li>
									<li><a class="dropdown-item" href="#"> Editar Estado de Chequeo</a></li>

								</ul>
							</li>

							<li>
								<form method="post">

									<a class="nav-link" href="${pageContext.request.contextPath}/Logout?op=salir">
										logout </a>
								</form>
							</li>

						</ul>

					</div>
				</div>
			</nav>

		</c:if>


		<!-- nav profesional -->
		<c:if test="${tipo == 'p'}">

			<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top" aria-label="Fourth navbar example">
				<div class="container-fluid">
					<a class="navbar-brand" href="${pageContext.request.contextPath}/index">Los sin Accidente&trade;</a>
					<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
						data-bs-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>

					<div class="collapse navbar-collapse" id="navbarsExample04">
						<ul class="navbar-nav me-auto mb-2 mb-md-0">


							<li class="nav-item dropdown">
								<a class="nav-link dropdown-toggle" href="#" id="dropdown10" data-bs-toggle="dropdown"
									aria-expanded="false">Visitas a Terreno</a>
								<ul class="dropdown-menu" aria-labelledby="dropdown10">

									<li> <a class="dropdown-item" href="#"> Listar</a></li>
									<li><a class="dropdown-item" href="#"> Crear</a></li>
									<li>
										<hr class="dropdown-divider">
									</li>
									<li><a class="dropdown-item" href="#"> Checklist</a></li>

								</ul>
							</li>

							<li class="nav-item dropdown">
								<a class="nav-link dropdown-toggle" href="#" id="dropdown10" data-bs-toggle="dropdown"
									aria-expanded="false">Asesor&iacute;as</a>
								<ul class="dropdown-menu" aria-labelledby="dropdown10">

									<li> <a class="dropdown-item" href="#"> Listar</a></li>
									<li><a class="dropdown-item" href="#"> Crear</a></li>

								</ul>
							</li>

							<li class="nav-item">
								<a class="nav-link" href="#"> Reportes</a>
							</li>


							<li>
								<form method="post">

									<a class="nav-link" href="${pageContext.request.contextPath}/Logout?op=salir">
										logout </a>
								</form>
							</li>

						</ul>

					</div>
				</div>
			</nav>

		</c:if>
	</c:if>

	<c:if test="${ingreso == 'no'}">
		<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top" aria-label="Fourth navbar example">
			<div class="container-fluid">
				<a class="navbar-brand" href="${pageContext.request.contextPath}/index">Los sin Accidente&trade;</a>
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
					data-bs-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarsExample04">
					<ul class="navbar-nav me-auto mb-2 mb-md-0">

						<li>
							<a class="nav-link" href="${pageContext.request.contextPath}/Login"> Login </a>
						</li>

					</ul>

				</div>
			</div>
		</nav>
	</c:if>