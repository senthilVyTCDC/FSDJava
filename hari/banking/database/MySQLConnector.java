package banking.database;
import java.sql.*;
public class MySQLConnector{
    private static final String DB_URL="jdbc:mysql://localhost:3306/bank_db";
    private static final String USER="root";
    private static final String PASS="Harish@21062004";   
    
    public static Connection getConnection() throws SQLException {
//         Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

public static void main(String args[]){
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    try {
        

        System.out.println("Connecting to database...");
        conn = getConnection();
        System.out.println("Connected to database SUCCESSFULLY");
        System.out.println("Creating statement...");
        stmt=conn.createStatement();
        String sql;
       sql = "SELECT id, name, email FROM customer";
        rs = stmt.executeQuery(sql);
        while(rs.next())
                {
                int id=rs.getInt("customer_id");
                String name=rs.getString("customer_name");
                String email=rs.getString("customer_email");
                    System.out.println("id" +id);
                    System.out.println("name" +name);
                    System.out.println("email" +email);

                }
    }
            catch (SQLException se){
                       se.printStackTrace();
                   }
            catch (Exception e){
                   e.printStackTrace();
            }


           
            finally {
                try{
                    if(rs!=null)
                        rs.close();
            }   catch (SQLException se2){ }
            try {
                if(stmt!= null)
                stmt.close();
            }
            catch (SQLException se2){}
            try {
                if(conn!= null)
                conn.close();
            }
            catch (SQLException se2){
                //se.printStackTrace();
}
                System.out.println("Database connection closed.");
                }
                }

   
}