/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Jimena
 */
public class Usuario {
   @Id 
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private String nombre;
   private String apellido;
   private String correo;
   private String contrasenia;
   
   Conexion cn=new Conexion();
   Connection con;
   PreparedStatement PS;
   ResultSet rs;
   

   
    public Usuario() {
    }
    public Usuario(int id, String nombre, String apellido, String correo, String contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;

    }
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
     public int validar(String nombre, String contrasenia) {        
     int r = 0;
      Usuario us=new Usuario();
   
      String sql="Select * from usuarios where nombre=? and contrasenia=?";
      try{
         // con=cn.Conexion();
          PS=cn.getConexion().prepareStatement(sql);
          PS.setString(1, nombre);
          PS.setString(2, contrasenia);
          //System.out.println("holaaaaaaaaaa");
          rs=PS.executeQuery();
          while(rs.next()){
              r=r+1;
              us.setCorreo(rs.getString("nombre"));
              us.setContrasenia(rs.getString("contrasenia"));
          }
          if(r==1){
              return 1;
          }
          else{
              return 0;
          }
      }catch(SQLException e){
           return 0;
      }

}


}
