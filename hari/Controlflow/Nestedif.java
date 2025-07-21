/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlflow;
import java.util.Scanner;
import java.io.PrintStream.*;
import java.lang.String;




/**
 *
 * @author Dhara
 */
public class Nestedif {
    public static void main(String args[]) {
        System.out.println("Enter the first number");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the second number");   
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("A is greater");
             if(b>=c && b>=a){
                System.out.println("B is greater");}}
        else 
            System.out.println("c is greater");
    }
    
}
