package com.valurin.os;

import java.sql.*;

public class Database {

  // JDBC driver name and database URL
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost/EMP";

  // Database credentials
  static final String USER = "username";
  static final String PASS = "password";

  public void connect() {

    Connection conn = null;

    try {
      // STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      // STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      // STEP 6: Clean-up environment
      conn.close();
    } catch (SQLException se) {
      // Handle errors for JDBC
      se.printStackTrace();
    } catch (Exception e) {
      // Handle errors for Class.forName
      e.printStackTrace();
    } finally {
      // finally block used to close resources
      System.out.println("connected");
      try {
        if (conn != null)
          conn.close();
      } catch (SQLException se) {
        se.printStackTrace();
      } // end finally try
    } // end try

    
  }

}
