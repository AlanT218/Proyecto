<%-- 
    Document   : cuenta
    Created on : 23/04/2024, 11:13:05 p. m.
    Author     : Jimena
--%>

<%@page import="modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Mi cuenta</title>        
        <link rel="stylesheet" type="text/css" href="form.css"/>
        <link rel="stylesheet" type="text/css" href="diseño.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        
        <header> 
              
            <nav>
                <ul>
                    <li><a href="index.jsp" >Inicio</a></li>
                    <li><a href="formRegArt.jsp" >Registro</a></li>
                    <li><a href="formIng.jsp" >Ingresar </a></li>
                    <li><a href="#" >Productos </a></li>
                    <li><a href="#" > Categorias</a></li>       
                     
                </ul>
                <div class="boxB">
                  <a class="botonCer" href="index.jsp">Cerrar sesion</a>  
                </div>         
            </nav>
            
             
            
           
          
                     
         </header> 
        
    </head>

    
    <body>
        <div class="boxCuen">           
            <div class="boxTit2">Bienvenid@, <a>${nombre}</a> </h2>

                <div class="boxDatos">
                    <h3><strong>Informacion Personal</strong></h3>
                    
                    
                </div>
            
        
            </div>
                            
        </div>   
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
