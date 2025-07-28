/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unconditionalstatement;
import java.util.Scanner;
public class factorofnum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
