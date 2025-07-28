/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;
import java.util.Scanner;
public class star {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of stars:");
        int a=s.nextInt();
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }    
}
