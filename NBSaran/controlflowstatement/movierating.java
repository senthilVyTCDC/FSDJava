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
public class movierating {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the star for the movie 1to5");
        int a=s.nextInt();
        
        if (a==5){
            System.out.println("Excellent");
        }
        else if(a==4){
            System.out.println("Great");
        }
        else if(a==3){
            System.out.println(" very Good");
        }
        else if(a==2){
            System.out.println("Good");
        }
        else{
            System.out.println("not satisfied");
        }
        
    }
    
}
