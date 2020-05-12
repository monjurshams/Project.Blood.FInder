import java.sql.*;
import javax.swing.*;

public class javaconnect {
        Connection conn=null;
    public static Connection Connecrdb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:BLOODGROUP.sqlite");
            return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}
