/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlflowstatement;
import java.util.Scanner;

/**
 *
 * @author saran
 */
public class branchingtask2 {
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=s.nextInt();
        System.out.println("Enter the second number ");
        int b=s.nextInt();
        if (a>b){
            System.out.println("A is greater");
        }
        else
            System.out.println("B is greater");
         
        
    }
    
}
