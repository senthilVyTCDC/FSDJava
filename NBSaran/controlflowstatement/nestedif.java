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
public class nestedif {
    public static void main (String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 1st number ");
        int a=s.nextInt();
        System.out.println("Enter the 2nd number ");
        int b=s.nextInt();
        System.out.println("Enter the 3rd number");
        int c=s.nextInt();
        if(a>b&&a>c){
            System.out.println("a is greater");
        }
            if (b>c&&b>a){
                System.out.println("b is greater");
                
            }
            else{
                System.out.println("c is greater");
            }
    }
    
}
