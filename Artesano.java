/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jimena
 */
public class Artesano extends Usuario{
    String redSocial;
    String especialidad;

    public Artesano() {
    }

    public Artesano(String redSocial, String especialidad, int id, String nombre, String apellido, String correo, String contrasenia) {
        super(id, nombre, apellido, correo, contrasenia);
        this.redSocial = redSocial;
        this.especialidad = especialidad;
    }

    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    /*public Artesano mostrar(){
    //int r = 0;
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
      }*/
//}
   
}
