/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopingstatement;
import java.util.Scanner;
public class displayevennum {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=s.nextInt();
        for(int i=0;i<=a;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    
}
