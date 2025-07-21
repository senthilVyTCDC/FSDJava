/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;
import java.util.Scanner;
public class banckingex {
    public static int balance=50000;
    public static String name ="saran";
    public static String accountno="123456saranbankno";
    public static void deposit(){
        Scanner s=new Scanner(System.in);
            System.out.println("enter the deposit ammount");
            double rupees=s.nextDouble();
            if (rupees!=0){
                   balance+=rupees;
                System.out.println("deposit amount"+rupees);
                System.out.println("new balance is"+balance);
                System.out.println("********************************************");
            }
    }
    public static void withdraw(int amount){
    if (amount!=0){
        balance-=amount;
        System.out.println("your amount in account "+balance);
        System.out.println("************************************************");
    }
    else{
        System.out.println("enter the valid amount");
    }
    }
    public static boolean viewprofile(boolean showprofile){
        if(showprofile){
            System.out.println("your profile details");
            System.out.println("name: "+name);
            System.out.println("accountno: "+accountno);
            return(true);
        }
        else{
            System.out.println("not available");
            return (false);
        }
    }
    public static int balanceenquiry(){
        return balance;
    }
    public static void main(String[] args) {
        int choice;
        do{
        System.out.println("BANKING SYSTEM");
        System.out.println("1.deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.View Profile");
        System.out.println("4.Balance enquiry");
        System.out.println("5.exit");
        Scanner s=new Scanner(System.in);
            System.out.println("*******************************************************");
        System.out.println("Enter your choice from the above list:");
        choice=s.nextInt();
        switch(choice){
            case 1:
                deposit();
                break;
            case 2:
                System.out.println("enter the ammount withdraw");
                int amount=s.nextInt();
                withdraw(amount);
                break;
            case 3:
                boolean result=viewprofile(true);
                if (result){
                    System.out.println("profile is displayed");
                    System.out.println("******************************************");
                }
                break;
            case 4:
                int currentbalance=balanceenquiry();
                System.out.println("balance is"+currentbalance);
                System.out.println("*************************************");
                break;
            default:
                System.out.println("exit");
        }
        
        }while(choice!=5);
    }
}
        

