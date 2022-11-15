package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTemplate {
   public static Connection getConnection() {
      Connection con = null;

      try {
         Class.forName("oracle.jdbc.OracleDriver");

         String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
         String username = "hr";
         String password = "a1234";

         con = DriverManager.getConnection(url, username, password);
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      }

      return con;
   }// end getConnection()

   public static void close(Connection con) {
      if (con != null) {
         try {
            con.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }

   public static void close(ResultSet rs) {
      if (rs != null) {
         try {
            rs.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }

   public static void close(Statement stmt) {
      if (stmt != null) {
         try {
            stmt.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }

   public static void close(PreparedStatement pstmt) {
      if (pstmt != null) {
         try {
            pstmt.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }

}// end class
