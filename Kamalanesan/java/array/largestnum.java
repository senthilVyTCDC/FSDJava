/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;
import java.util.Scanner;
public class largestnum {
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size =s.nextInt();
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
        System.out.println("Largest number in the array is: "+largest);
    }    
}
