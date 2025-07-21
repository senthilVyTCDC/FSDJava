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
public class dice {
    public static void main(String[] args) {
         Random r=new Random();
        Scanner s=new Scanner(System.in);
        int comp=r.nextInt(1,6);
        while(true){
            int user=s.nextInt();
            if(comp==user){
                System.out.println("draw match");
                break;
            }
            else if(user %2==0&&comp%2==0){
                System.out.println("you won");
                
            }
            else if(user %2==1&&comp%2==1){
                System.out.println("you won");
            }
            else{
                System.out.println("computer won");
            }
            System.out.println();
        }
    }
    
}
    
    

