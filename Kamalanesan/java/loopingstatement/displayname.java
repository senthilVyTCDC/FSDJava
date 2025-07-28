/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopingstatement;
import java.util.Scanner;
public class displayname {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name:");
        String a=s.nextLine();
        System.out.println("Enter the no of times to print:");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(a);
        }
    }
}
