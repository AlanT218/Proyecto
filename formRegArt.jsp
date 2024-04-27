<%-- 
    Document   : index
    Created on : 19/04/2024, 6:54:44 p. m.
    Author     : Jimena
--%>


<%@page import="modelo.Artesano"%>
<%@page import="modelo.Operaciones"%>
<%@page import="modelo.Conexion"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
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
        <div class="boxTit"><h1>Registro de Artesano</h1></div>
            <div class="boxFormReg">
                <div class="formReg">
                    <form action="formRegArt.jsp" method="post">
                        <div class="form_inputReg">
                            <label for="nombre">Nombre: </label>
                            <input type="text" class="form_control" id="nombre" name="nombre">
                        </div>
                        <div class="form_inputReg">
                            <label for="apellido">Apellido: </label>
                            <input type="text" class="form_control" id="apellido" name="apellido">
                        </div>
                        <div class="form_inputReg">
                            <label for="correo">Dirección de correo electrónico: </label>
                            <input type="text" class="form_control" id="correo" name="correo">
                        </div>            
                        <div class="form_inputReg">
                            <label for="telefono">Teléfono: </label>
                            <input type="text" class="form_control" id="telefono" name="telefono" >
                        </div>
                        <div class="form_inputReg">
                            <label for="redSocial">Red Social: </label>
                            <input type="text" class="form_control" id="redSocial" name="redSocial">
                        </div>
                        <div class="form_inputReg">
                            <label for="especialidad">Especialidad: </label>
                            <input type="text" class="form_control" id="especialidad" name="especialidad" >
                        </div>
                        <div class="form_inputReg">
                            <label for="contrasenia">Contraseña: </label>
                            <input type="password" class="form_control" id="contrasenia" name="contrasenia" >
                        </div>
                        <div class="form_inputReg">
                            <label for="confConf">Cofirma tu contraseña: </label>
                            <input type="password" class="form_control" id="confCont" name="confCont" >
                        </div>
                        <button type="submit" name="enviar" class="botonReg">Guardar</button>
                    </form>
                </div>
            </div>
         <%
            if (request.getParameter("enviar") != null) {
                //String id = request.getParameter("id");              
                
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String correo = request.getParameter("correo");              
                String telefono = request.getParameter("telefono");
                String redSocial = request.getParameter("redSocial");
                String especialidad= request.getParameter("especialidad");
                String contrasenia = request.getParameter("contrasenia");
                String confCont = request.getParameter("confCont");
                
                
                Operaciones prueba = new Operaciones();
                prueba.insertArt(nombre,apellido,correo,telefono,redSocial,especialidad,contrasenia,confCont);
                prueba.insertUs(nombre,apellido,correo,contrasenia,confCont);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        %> 
    
    </body>
</html>




