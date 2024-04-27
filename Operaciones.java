 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class Operaciones {
    
    private static String SQL_Insert1="insert into artesano (nombre,apellido,correo,telefono,redSocial,especialidad,contrasenia,confCont) values (?,?,?,?,?,?,?,?)";
     private static String SQL_Insert2="insert into usuarios (nombre,apellido,correo,contrasenia,confCont) values (?,?,?,?,?)";
// private static String SQL_Insert2="insert into categorias(idCateg,nombreCateg) values (?,?)";
    //private static String SQL_Insert3="insert into productos(idProd,nombreProd, material, descripcionProd, precioProd, idCateg, idusuario) values (?,?,?,?,?,?,?)";
    //private static String SQL_Insert4="insert into artesanos(idArtesano,nombre, apellido, correo, telefono, redSocial, especialidad) values (?,?,?,?,?,?,?)";
    //private static String SQL_Insert5="insert into materiales(idMaterial,nombre) values (?,?)";
    //private static String SQL_Insert6="insert into adicionales(idAdicion,descripAdicion, material) values (?,?,?)";
    //private static String SQL_Insert3="insert into persona(identificacion, nombres, apellidos, correo) values (?,?,?,?)";
    //private static String SQL_Delete="";
    //private static String SQL_Update="";
   private static String SQL_Select1="select idusuario from usuarios";
    //private static String SQL_Select1="select usuarios.idusuario, usuarios.nombre, usuarios.apellido, usuarios.correo from usuarios where usuario.idusuario = usuarios.idusuario";
    //private static String SQL_Select3="";
    //private PreparedStatement  PS;   
  private PreparedStatement  PS;   
    Conexion cn;
    ResultSet rs;
    public Operaciones() {
        PS = null;
        cn = new Conexion();//crear el puente entre Java y mysql
    }
    
    public int insertUs(String nombre, String apellido, String correo, String contrasenia, String confCont){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_Insert2);
            //PS=cn.getConexion().prepareStatement(SQL_Insert2);                     
            PS.setString(1, nombre);
            PS.setString(2, apellido);
            PS.setString(3, correo);
            PS.setString(4, contrasenia);
            PS.setString(5, confCont);
            
            res = PS.executeUpdate(); // ejecuta la operacion
            
        }catch(SQLException e){
            System.err.println("Error guardando"+e);
        }
       
        return res;
    }
    public int insertArt(String nombre, String apellido, String correo, String telefono, String redSocial, String especialidad, String contrasenia, String confCont){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_Insert1);
            //PS=cn.getConexion().prepareStatement(SQL_Insert2);                     
            PS.setString(1, nombre);
            PS.setString(2, apellido);
            PS.setString(3, correo);
            PS.setString(4, telefono);
            PS.setString(5, redSocial);
            PS.setString(6, especialidad);
            PS.setString(7, contrasenia);
            PS.setString(8, confCont);
            
            res = PS.executeUpdate(); // ejecuta la operacion
            
        }catch(SQLException e){
            System.err.println("Error guardando"+e);
        }
       
        return res;
    }
}
    
    /*public int validar(Usuario us) {        
    int r = 0;
   
      String sql="Select * from usuarios where correo=? and contrasenia=?";
      try{
          PS=cn.getConexion().prepareStatement(sql);
          PS.setString(1, us.getCorreo());
          PS.setString(2, us.getContrasenia());
          //System.out.println("holaaaaaaaaaa");
          rs=PS.executeQuery();
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
      }catch(SQLException e){
           return 0;
      }

}
}
   /*
  
    public int validar(String correo, String contrasenia) {
       int res=0;
       int r = 0;
      String sql="Select * from usuario where correo=? and contrasenia=?";
      try{
          PS=cn.getConexion().prepareStatement(sql);
          PS.setString(1, correo);
          PS.setString(2, contrasenia);
          rs=PS.executeQuery();
          while(rs.next()){
              r=r+1;
              correo=(rs.getString("correo"));
              contrasenia=(rs.getString("contrasenia"));
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
    

    /*public int insertCat(int idCat, String nomCat){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_Insert2);
            PS.setInt(1, idCat);
            PS.setString(2, nomCat);  
            res = PS.executeUpdate(); // ejecuta la operacion
            
        }catch(SQLException e){
            System.err.println("Error guardando"+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión 1 cerrada");
        }
       
        return res;
    }
    
    public int insertProd(int idProd, String nomProd, int material, String descriProd, double precProd, int idCat, int idUs){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_Insert3);
            PS.setInt(1, idProd);
            PS.setString(2, nomProd);
            PS.setInt(3, material);
            PS.setString(4, descriProd);
            PS.setDouble(5, precProd);
            PS.setInt(6, idCat);
            PS.setInt(7, idUs);   
            res = PS.executeUpdate(); // ejecuta la operacion
            
        }catch(SQLException e){
            System.err.println("Error guardando"+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión 1 cerrada");
        }
       
        return res;
    }
    
    public int insertArt(int idArt, String nom, String ape, String correo, String telef, String redSoc, String espec){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_Insert4);
            PS.setInt(1, idArt);
            PS.setString(2, nom);
            PS.setString(3, ape);
            PS.setString(4, correo);
            PS.setString(5, telef);
            PS.setString(6, redSoc);
            PS.setString(7, espec);
            res = PS.executeUpdate(); // ejecuta la operacion
            
        }catch(SQLException e){
            System.err.println("Error guardando"+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión 1 cerrada");
        }
       
        return res;
    }
    
    public int insertMat(int idMat, String nom){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_Insert5);
            PS.setInt(1, idMat);
            PS.setString(2, nom);   
            res = PS.executeUpdate(); // ejecuta la operacion
            
        }catch(SQLException e){
            System.err.println("Error guardando"+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión 1 cerrada");
        }
       
        return res;
    }
    
    public int insertAdic(int idAdic, String descriAdic, int material){
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_Insert6);
            PS.setInt(1, idAdic);
            PS.setString(2, descriAdic);
            PS.setInt(3, material);    
            res = PS.executeUpdate(); // ejecuta la operacion
            
        }catch(SQLException e){
            System.err.println("Error guardando"+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión 1 cerrada");
        }
       
        return res;
    }

    
    public persona consultaId(int id){
        
        ResultSet rs=null;
        //persona p = new persona();
        try{
            PS=cn.getConexion().prepareStatement(SQL_Select1);
            PS.setInt(1, id);
            rs = PS.executeQuery();
            if(rs!= null){
                rs.next();
                p.nombre = rs.getString(2);
                p.apellido = rs.getString(3);
                p.email = rs.getString(4);             
                //System.out.println("siiii");
            }
        }catch(SQLException e){
            System.err.println("Error consultando "+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión 2 cerrada");
        }
        
        return p;
    }
    
    
    public void deleteDatos (){
        String SQL_Delete="delete from usuarios where nombre= 'Lauraaaa'";
        int res=0;
        try{
            PS=cn.getConexion().prepareStatement(SQL_Delete);
            res = PS.executeUpdate();
            if (res>0) {
                System.out.println("Registro eliminado");
            }
        }
        catch(SQLException e){
             System.err.println("Error al eliminar los datos "+e);
        }finally{
            PS= null;
            cn.close();
            System.out.println("Conexión cerrada");
        }
    }
}*/
