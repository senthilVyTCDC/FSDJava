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
public class largestofnumber {
    public static void main (String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int largest=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>largest){
                largest=arr[i];
            } 
        }
        System.out.println( "largest number in the array is"+ largest);
    }
}
