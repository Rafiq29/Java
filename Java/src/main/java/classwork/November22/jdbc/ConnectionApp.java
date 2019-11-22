package classwork.November22.jdbc;

import classwork.November22.web.CalcServlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionApp {
  public static void main(String[] args) throws SQLException {
    Connection conn = DbConnection.getConnection();



    final String SQLS = "SELECT * FROM history";
    PreparedStatement stmt = conn.prepareStatement(SQLS);
    ResultSet rset = stmt.executeQuery();
    // processing data
    while (rset.next()) {
      String line = String.format("id: %d, sender:%d, receiver:%d, message:%s",
          rset.getInt("id"),
          rset.getInt("user_from"),
          rset.getInt("user_to"),
          rset.getString("content"));
      System.out.println(line);
    }

    final String SQLI = "INSERT INTO history (num_1, num_2, operation, result) values (?, ?, ?, ?)";
    CalcServlet calcs = new CalcServlet();
    PreparedStatement stmt_insert = conn.prepareStatement(SQLI);
    stmt_insert.setString(1, "new message");
    stmt_insert.setInt(2, 33);
    stmt_insert.setInt(3, 44);
    stmt_insert.execute();
  }
}
