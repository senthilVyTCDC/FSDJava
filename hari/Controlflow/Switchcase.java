/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
package Controlflow;
import java.util.*;


/**
 *
 * @author Dhara
 */
public class Switchcase {
    public static void main(String[] args) {
        System.out.println("Enter the number(1-9)");
        Scanner sc=new Scanner(System.in);
        int c = sc.nextInt();
        switch(c) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;    
            default:
                System.out.println("Enter the Correct input");
        }
        
    }
    
}
