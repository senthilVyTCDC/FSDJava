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
public class add {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr1[][]=new int[3][3];
        System.out.println("enter arr 1");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr1[i][j]=s.nextInt();   
            }
        }
        int arr2[][]=new int[3][3];
         System.out.println("enter arr 2");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr2[i][j]=s.nextInt();
            }
        }
     int sum[][]=new int[3][3];
        System.out.println("sum of two array is");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
         sum[i][j]=arr1[i][j]+arr2[i][j];
        
        }}
        System.out.println("result");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(sum[i][j]+ " ");        
        }
            System.out.println();}
       
        
}}
