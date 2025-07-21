/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;
import java.util.Scanner;
import java.util.Random;



/**
 *
 * @author saran
 */
public class game1 {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        int comp=r.nextInt(1,100);
        while(true){
            int user=s.nextInt();
            if(comp==user){
                System.out.println("you won");
                break;
            }
            else if(user>comp){
                System.out.println("too high");
                
            }
            else if(user<comp){
                System.out.println("too low");
            }
            else{
                System.out.println("computer won");
            }
            System.out.println();
        }
    }
    
}
