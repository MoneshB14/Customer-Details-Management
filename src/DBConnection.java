import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {
   final static String JDBC_Driver = "com.mysql.jdbc.Driver";
   final static String DB_URL="jdbc:mysql://localhost:3306/VM_CoustomerManagement";
   final static String USER="root";
   final static String PASS="Monesh@2001";
   
   public static Connection connection(){
       
       try{
           Class.forName(JDBC_Driver);
           
           Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
           return conn;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
   }
    
}
