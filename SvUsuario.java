/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

//import config.Operaciones;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Artesano;
import modelo.Operaciones;
import modelo.Usuario;


/**
 *
 * @author Jimena
 */
@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {
    
    //UsuarioDAO dao= new UsuarioDAO();
    Operaciones nOp= new Operaciones();
    Artesano art=new Artesano();
    //Artesano art=new Artesano();
    Usuario u=new Usuario();
    int r;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
            
            
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

               if((request.getParameter("ingresar") != null)){
            String nombre=request.getParameter("nombre");
            String contrasenia=request.getParameter("contrasenia");

            r=u.validar(nombre, contrasenia);   
            //String nom= u.getNombre();
            if(r==1){
                request.getSession().setAttribute("nombre", nombre);
                
                if ("artesano".equals(request.getParameter("tipUs"))) {                
                 request.getRequestDispatcher("cuentaArt.jsp").forward(request, response);
                 }
                if ("comprador".equals(request.getParameter("tipUs"))) {
                 request.getRequestDispatcher("cuentaComp.jsp").forward(request, response);
                 }                 
               
            }
            else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
               }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
