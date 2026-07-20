// Write a program to count the number of 1’s in a binary representation of the number.
package Java_Homework_Problem_of_Day_10;
import java.util.*;
public class count {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 31; // int stores only 32 bit so that 31 is max (from 0) 1<<32 is = 1<<0 basically so that there is no point of doint that.
        int ones = 0;
        for(int i=0; i<=pos; i++){
            int bitMax = 1<<i;
            int newNum = bitMax & n;
                if(newNum != 0)
                    ones++;
        }
        System.out.println("No. of ones in the " + n + " is " + ones + "." );
        sc.close();
    }
}