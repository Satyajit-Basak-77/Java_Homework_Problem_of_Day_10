//Write a program to toggle a bit a position = “pos” in a number “n”.
package Java_Homework_Problem_of_Day_10;
import java.util.*;
public class toggle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();
        System.out.print("Enter your position of bit which you want to toggle: ");
        int pos = sc.nextInt();
        int bitMax = 1<<pos;
        boolean deter;

        if((bitMax & n) == 0){
            deter = false;
        } else {
            deter = true;
        }

        if(deter == false){
            int newNum = (bitMax | n);
            System.out.println(newNum);
        } else {
            int newNum = ((~(bitMax)) & n);
            System.out.print(newNum);
        }
    }
}