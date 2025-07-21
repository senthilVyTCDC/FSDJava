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
public class switchcases {
    public static void main (String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbe 1to10");
        int n=s.nextInt();
        switch(n){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;  
            case 4:
                System.out.println("four");
                break; 
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break; 
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println("invalid number please enter 1 to 10");
            }}}
