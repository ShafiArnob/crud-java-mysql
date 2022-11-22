
package crud.java.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO customer(Customer_Name,Customer_TP ) VALUES ('ab','123')";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos","root","");
        Statement  st = connection.createStatement();
        st.executeUpdate(query);
    }
}
