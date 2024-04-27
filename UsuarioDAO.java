/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jimena
 */
public class UsuarioDAO implements Validar {
    PreparedStatement ps;
    
    Conexion cn; 
   
    ResultSet rs;
    //cn=new Conexion();
    int r;
    @Override
    public int validar(Usuario us) {
      String sql="Select * from usuario where correo=? and contrasenia=?";
      try{
          ps=cn.getConexion().prepareStatement(sql);
          ps.setString(1, us.getCorreo());
          ps.setString(2, us.getContrasenia());
          System.out.println("holaaaaaaaaaa");
          rs=ps.executeQuery();
          while(rs.next()){
              r=r+1;
              us.setCorreo(rs.getString("correo"));
              us.setContrasenia(rs.getString("contrasenia"));
          }
          if(r==1){
              return 1;
          }
          else{
              return 0;
          }
      }catch(Exception e){
           return 0;
      }
    }
    
}
    