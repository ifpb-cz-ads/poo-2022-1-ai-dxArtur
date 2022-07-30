import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conection{
    public Connection conectionBD() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/marinedatabase?user=root&password=0000";
            conn = DriverManager.getConnection(url);
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, " connection error" + error.getMessage());
        }

        return conn;
    }
}