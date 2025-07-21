
package travels;
import java.sql.*;
import java.util.Scanner;

public class travels {
    public static void main(String args[]) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/travels","root","Harish@21062004");
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select * from Driver");
        
        Scanner sc=new Scanner(System.in);
            System.out.println("Welcome to our Tours and Travels");
        int num=sc.nextInt();
        int choice;
        do{
            System.out.println("\n--- Tours and Travels ---");
            System.out.println("1. Driver details");
            System.out.println("2. Booking");
            System.out.println("3. Vehicle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the driver details");
               
                while(rs.next())
                    {System.out.println(rs.getInt("driver_id")+" "+rs.getString("driver_name")+" "+rs.getLong("contact"));
          
        }
                
                break;
            case 2:
                System.out.println("Enter the booking details");
                ResultSet rs1=stmt.executeQuery("select * from booking");
                while(rs1.next())
                    {System.out.println(rs1.getDate("from_date")+" "+rs1.getDate("to_date")+" "+rs1.getString("palce"));
          }
//                ResultSet rs=stmt.executeQuery("select * from booking");
                break;
            case 3:
                System.out.println("Enter the vehicle details");
                break;
            case 4:
                System.out.println("Thankyou for your time with us");
                break;
            default:
                    System.out.println("Invalid choice");
        }
  }
        while (choice!=4);
                sc.close();
                
    
             
                
     
       // stmt.executeUpdate("update Driver set driver_name=Kumar where driver_id = 100");
        
        
        
       
        System.out.println(rs.getString("driver_name"));
        
       conn.close();
        }
        catch(Exception e){
            System.out.println(e);}}
    
    
}
