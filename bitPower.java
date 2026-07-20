// Write a program to find if a number is a power of 2 or not.

package Java_Homework_Problem_of_Day_10;
import java.util.*;
public class bitPower {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        
        int num = (n-1) & n;

        if(n>0 && num == 0){
            System.out.print(n + " was a power of 2.");
        } else {
            System.out.print(n + " was not a power of 2.");
        }
    }
}