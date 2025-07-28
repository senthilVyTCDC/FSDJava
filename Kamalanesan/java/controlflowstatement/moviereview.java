/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlflowstatement;
import java.util.Scanner;
public class moviereview {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the rate for the movie 1 to 5:");
        int a=s.nextInt();
        if (a==5) {
            System.out.println("Excellent");
        }
        else if (a==4) {
            System.out.println("Great");
        }
        else if (a==3) {
            System.out.println("Very Good");
        }
        else if (a==2) {
            System.out.println("Good");
        }
        else{
            System.out.println("Not Satisfied");
        }
    }
    
}
