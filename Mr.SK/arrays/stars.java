/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;
import java.util.Scanner;


/**
 *
 * @author saran
 */
public class stars {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number of stars");
        int a=s.nextInt();
        for(int i= a;i >=1;i --){
            for (int j= 1;j <=i;j ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
