package Controlflow;
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%4==0)
        {
            System.out.println("Leap year");    
        }
        else{
            System.out.println("Not a Leap year");
        }    
}
}
