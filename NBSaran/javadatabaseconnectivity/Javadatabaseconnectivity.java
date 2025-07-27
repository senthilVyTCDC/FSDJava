/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadatabaseconnectivity;
import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Javadatabaseconnectivity {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/delivery";
        String user="root";
        String password="saran2911@bala";
        Scanner sc=new Scanner (System.in);
        System.out.println("customer delivery info");
       
        System.out.println("ENTER YOUR NAME");
        String cus_name =sc.nextLine();
        System.out.println("ENTER YOUR ADDRESS");
        String address=sc.nextLine();
        System.out.println("ENTER YOUR PHONE NUMBER");
        long  phoneno=sc.nextLong();
       try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection(url, user, password);
        String sql="insert into customer(cus_name,address,phoneno)values(?,?,?)";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1, cus_name);
        ps.setString(2,address);
         ps.setLong(3,phoneno);
        
                  int row=ps.executeUpdate();
         if(row>0){
             System.out.println("customer info saved successfully");
         }
         else{
                System.out.println("failed ");
         }
         ps.close();
         conn.close();
        }
        catch(Exception e){
            System.out.println("error"+e); 
                
               
        }
        sc.close();
        }
        
    }
    

