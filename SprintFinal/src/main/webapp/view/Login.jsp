<%@ page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="utf-8">
    <title>Los sin Accidente</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
      
		<style>
			<%@include file="/static/css/css.css" %>
		</style>
		
  </head>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


    <body class=bg-dark>

      <%@ include file="nav.jsp" %>

        <section class="h-100 bg-dark">
          <div class="container py-5 h-100">
            <div class="row d-flex justify-content-center align-items-center h-100">
              <div class="col-6">
                <div class="card card-registration my-4">
                  <div class="row g-0">




                    <div class="row justify-content-center">
                      <div class="col">
                        <form method="post" class="form row g-3 " style="margin:20px;">
                          <!-- Email input -->
                          <div class="container-fluid">
                            <label class="form-label" for="usuario">RUT</label>
                            <input required type="text" id="nombre" class="form-control" name="nombre"
                              placeholder="el RUN es mentira, va el nombre de Usuario uwu" />

                          </div>
                          <hr>
                          <!-- Password input -->
                          <div class="container-fluid">
                            <label class="form-label" for="password">Contraseña</label>
                            <input required type="password" id="password" class="form-control" name="password"
                              placeholder="Contraseña" />

                          </div>
                          <hr>
                          <div class="container-fluid">
                            <label class="form-label">Seleccione el tipo de Usuario</label>
                            <select class="form-select" name="tipo">
                              <option value="c">Cliente</option>
                              <option value="p">Profesional</option>
                              <option value="a">Administrativo</option>
                            </select>

                          </div>


                          <!-- Submit button -->
                          <button type="submit" name="submit" class="btn btn-dark btn-block mb-4">Login</button>
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