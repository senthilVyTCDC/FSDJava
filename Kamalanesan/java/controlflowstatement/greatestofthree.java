/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlflowstatement;
import java.util.Scanner;
public class greatestofthree {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 1st numnber:");
        int a=s.nextInt();
        System.out.println("Enter the 2nd numnber:");
        int b=s.nextInt();
        System.out.println("Enter the 3rd numnber:");
        int c=s.nextInt();
        if (a>b&&a>c){
            System.out.println("a is greater");
        }
        if (b>c&&b>a){
            System.out.println("b is greater");
        }
        else {
            System.out.println("c is greater");
        }
    }
    
}
