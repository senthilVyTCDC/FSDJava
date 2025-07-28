/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unconditionalstatement;
import java.util.Scanner;
public class primenum {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        for(int i=2;i<=n;i++){
            boolean isPrime = true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }    
}
