

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        int n, m, a = 0,x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        m = n;
        int sumeven=0;
        while(n > 0)
        {
            x = n % 10;
            if(x%2==0)
            {sumeven=sumeven+x;}
            a = a * 10 + x;
            n = n / 10;
        }
        if(a == m)
        {
            if(sumeven>25) {
                System.out.println(m + " is Palindrome and the sum of even numbers is greater than 25");
            } else{System.out.println(m+" is Palindrome and the sum of even numbers is not greater than 25");
        }
        else
        {
            if(sumeven>25) {
                System.out.println(m + " is Not Palindrome and the sum of even numbers is greater than 25");
            }else{System.out.println(m + " is Not Palindrome and the sum of even numbers is less than 25");}
        }
    }
}





