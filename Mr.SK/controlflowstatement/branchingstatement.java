/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlflowstatement;
import java.util.Scanner;
public class branchingstatement {
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter year");
        int y=s.nextInt();
        if (y%4==0){
            System.out.println("the leap year is "+y);    
        }
        else{
            System.out.println("not an leap year");   
        }
        
    
}
    
}
