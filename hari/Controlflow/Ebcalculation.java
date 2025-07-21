/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlflow;
import java.util.Scanner;


/**
 *
 * @author Dhara
 */
public class Ebcalculation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the units used");
        int c=sc.nextInt();
        if(c>0 && c<=100)
            System.out.println("You have no charges");
        else if(c>101 && c<=200){
            int u=c;
            u=u-100;
            u=u*1;
            System.out.println(u);}
        else if(c>201 && c<=300){
            int u=c;
            u=u-100;
            u=u*2;
            System.out.println(u);}
        else if(c>301 && c<=400){
            int u=c;
            u=u-100;
            u=u*3;
            System.out.println(u);}
        else if(c>401 && c<=500){
            int u=c;
            u=u-100;
            u=u*4;
            System.out.println(u);}
        else { 
            int u=c;
            u=u-100;
            u=u*5;
             System.out.println(u);
        }
        }   
    }
    
    

