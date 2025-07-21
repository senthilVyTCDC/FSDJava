/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;
import java.util.Scanner;
import java.util.Random;
import java.lang.RuntimeException;


/**
 *
 * @author Dhara
 */
public class game1 {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        int Computer=r.nextInt(1,100);
        while (true){
            int user=s.nextInt();
            if(Computer==user){
                System.out.println("You Won the game");
                
            }
            else if(user>=Computer){
                System.out.println("Too high");
                
            }
            else if(user<Computer){
                System.out.println("Too low");   
            }
            else {
                System.out.println("Computer won");}
            System.out.println();
        }
    }
    
}
