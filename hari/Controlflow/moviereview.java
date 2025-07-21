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
public class moviereview {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Movie Rating (1-5)");
        int star=sc.nextInt();
        if(star==1){
            System.out.println("Excellent");
        }
        else if (star==2)
        {System.out.println("Very Good");
        }
          else if (star==3)
        {System.out.println("Good");
        }
          else if (star==4)
        {System.out.println("Average");
        
        }
        else
          {System.out.println("Not Satisfied");
          }
        
    }
    
}
