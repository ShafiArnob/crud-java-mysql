/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.java.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author Arnob
 */
public class db {
    public static Connection mycon(){
       Connection con = null ;
       
       try {
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?zeroDateTimeBehavior=convertToNull","root","");
          return con;
       } catch (Exception e) {
           System.err.println(e);
           return null;
       }
   } 
}

