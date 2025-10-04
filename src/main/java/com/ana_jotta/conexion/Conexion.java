package com.ana_jotta.conexion;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

  public static Connection getConexion() {
    Connection conexion = null;
    Properties props = new Properties();

    try {
      // Cargar configuración desde archivo externo
      props.load(new FileInputStream("config.properties"));

      String baseDatos = props.getProperty("db.baseDatos");
      String url = props.getProperty("db.url") + baseDatos;
      String usuario = props.getProperty("db.user");
      String password = props.getProperty("db.password");

      // Cargar driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      conexion = DriverManager.getConnection(url, usuario, password);

    } catch (IOException e) {
      System.out.println("Error leyendo config.properties: " + e.getMessage());
    } catch (ClassNotFoundException | SQLException e) {
      System.out.println("Ocurrió un error en la conexión: " + e.getMessage());
    }

    return conexion;
  }

  public static void main(String[] args) {
    var conexion = Conexion.getConexion();
    if (conexion != null)
      System.out.println("Conexión exitosa: " + conexion);
    else
      System.out.println("Error al conectarse.");
  }
}
