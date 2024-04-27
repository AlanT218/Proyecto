<%-- 
    Document   : formIng
    Created on : 22/04/2024, 7:05:44 p. m.
    Author     : Jimena
--%>

<%@page import="modelo.Artesano"%>
<%@page import="modelo.Usuario"%>
<%@page import="modelo.Operaciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar</title>
        <link rel="stylesheet" type="text/css" href="form.css"/>
         <link rel="stylesheet" type="text/css" href="diseño.css"/>
        
        <header> 
              
            <nav>
                <ul>
                    <li><a href="index.jsp" >Inicio</a></li>
                    <li><a href="formRegArt.jsp" >Registro</a></li>
                    <li><a href="formIng.jsp" >Ingresar </a></li>
                    <li><a href="#" >Productos </a></li>
                    <li><a href="#" > Categorias</a></li>
                </ul>
            </nav> 
         </header>
    </head>
    <body>
        <div class="boxTit"><h1>Inicio de Sesión </h1></div>
            <div class="boxFormIn">
                   <div class="formIn">
                    <form action="SvUsuario" method="post"> 

                        <div class="form_inputIn">
                            <label for="nombre">Nombre Registrado: <br> </label>
                            <input type="text" class="form_control" id="nombre" name="nombre" >
                        </div>
                        <div class="form_inputIn">
                            <label for="contrasenia">Contraseña:<br> </label>
                            <input type="password" class="form_control" id="contrasenia" name="contrasenia" >
                        </div>
                       <%-- <button type="submit" name="accion" value="Ingresar" class="botonIn">Ingresar</button>--%>
                        <fieldset >
                            <legend>¿Cuál es tu comida favorita?</legend>
                            <ul>
                              <li>
                                <label for=artesano>Artesano</label>
                                <input type="radio" name="tipUs" value="artesano" checked />
                              </li>
                              <li>
                                <label for="curry">Comprador</label>
                                <input type="radio" name="tipUs" value="comprador" />
                              </li>
                            </ul>
                        </fieldset>
                        <button type="submit" name="ingresar" class="botonReg">Guardar</button>
                    </form>   
                    </div>
                        
                        
            </div>
       
    </body>
    <footer> 
        <div class="piePag"> 
            <div>
                <p class="textPie">
                    Página web para la visibilizacion y personalización de artesanias. ¡Apoyemos el arte!
                           
                </p>
            </div>    
                    
        </div>
        
    </footer>
</html>
 <%
          if (request.getParameter("soup") != null) {
                 request.getRequestDispatcher("formRegArt.jsp").forward(request, response);
            }
        %> 
