package Lac_4;

import java.util.Scanner;

public class break_statement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        int count =0;

        while (i< n){
            if (n%i==0){   //kisi bhi no kay factore count ker sakte ho
                count++;
                break;  // For optimization of code
            }
            i++;
        }
        if (count==0){
            System.out.println("Its a prime number ");

        }
        else {
            System.out.println("Not a prime number");
        }
    }
}
