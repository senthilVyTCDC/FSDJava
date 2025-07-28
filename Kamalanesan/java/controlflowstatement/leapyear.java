/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlflowstatement;
import java.util.Scanner;
public class leapyear {
    public static void main (String args[]){
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the year:");
        int y=s.nextInt();
        if (y%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
    
}
