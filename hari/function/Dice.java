/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dhara
 */
public class Dice {public static void main(String[] args) {
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        int Computer=r.nextInt(1,6);
        while(true){
            int user=s.nextInt();
            if(Computer==user){
                System.out.println("Game is draw");
                
            }
            else if(user%2==0 && Computer%2==0){
                System.out.println("you won the Game");
                
            }
            else if(user%2==1 && Computer%2==1){
                System.out.println("you won the Game");   
            }
            else {
                System.out.println("Computer won the Game,Better luck next time");}
            System.out.println();
        }
    }
    
    
    
}
