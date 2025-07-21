/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loop;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Dhara
 */
public class Dispname {
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name");
        String a=s.nextLine();
        System.out.println("No of times");
        int n=s.nextInt();        
        
        for(int i=1;i<=n;i++){
            System.out.println(a);
        }
    }
    
}
