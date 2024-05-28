/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triliumapp.config;
import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author USER
 */
public class dbConnection {
  private static Connection dbconnection;
  public static Connection getConnection() {
      if (dbconnection == null) {
          try {
              String url = "jdbc:mysql://localhost:3306/test";
              String user = "root";
              String pass = "";
              DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
              dbconnection = (Connection) DriverManager.getConnection(url,user,pass);
          } catch (Exception e) {
              Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE,null,e);
              
          }
      }
      return dbconnection;
  }
}
