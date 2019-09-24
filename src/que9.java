// Java program to Reverse a String by
// converting string to characters one
// by one
import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseString
class que9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String line = sc.nextLine();

        // convert String to character array
        // by using toCharArray
        char[] try1 = line.toCharArray();

        for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);
    }
}

