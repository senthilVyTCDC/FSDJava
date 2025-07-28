/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopingstatement;
import java.util.Scanner;
public class reverseofnum {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=s.nextInt();
        int rev=0;
        while(num !=0){
            int digit = num%10;
            rev=rev*10+digit;
            num /=10;
        }
        System.out.println(rev);
    }
    
}
