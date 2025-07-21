/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlflowstatement;
import java.util.Scanner;

/**
 *
 * @author saran
 */
public class ebcals {
    public static void main (String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter eb current value");
        int m=s.nextInt();
        if (m>=0&&m<=100){
            System.out.println("free amount"+m);
    }else if(m>=101&&m<=200){
        int n=m;
        n=n-100;
        n=n*1;
            System.out.println(n);
    }else if(m>=201&&m<=300){
        int n=m;
        n=n-100;
        n=n*2;
            System.out.println(n);
    }else if(m>=301&&m<=400){
        int n=m;
        n=n-100;
        n=n*3;
            System.out.println(n);
    }else if(m>=401&&m<=500){
        int n=m;
        n=n-100;
        n=n*4;
            System.out.println(n);
    }else{
     int n=m;
        n=n-100;
        n=n*10;
            System.out.println(n);
    }
    }}
