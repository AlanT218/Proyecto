/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jimena
 */
public class Conexion {
   private static String driver="com.mysql.jdbc.Driver"; //Driver conexión al motor BD
    private static String user="root"; //usuario del servidor de BD
    private static String pass="12345"; //contraseña del usuario BD
    private static String url="jdbc:mysql://localhost:3306/bdprueba"; //ubicación del servidor y nombre de BD
    private static Connection  conn;

    public Conexion() {
        conn= null;
        try{//excepciones: control de errores en ejecución
            Class.forName(driver); //Vincular las clases del conector de BD
            conn=DriverManager.getConnection(url,user, pass); //creación del puente hacia la BD
            if(conn!= null){
                System.out.println("Conectado");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("error al conectar " + e);
        }
    }
    public Connection getConexion(){
        return conn;
    }
}