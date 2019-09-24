
import java.util.Scanner;

public class ques6 {
    public static void main(String[] args)  {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String line = sc.nextLine();

            char ch = line.charAt(0);
            if((ch >= 'A'&& ch <= 'Z')) {
                System.out.println("Capital letters");
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                System.out.println("Small letters");
            }
            else if( ch >= '0' && ch <= '9')
            {
                System.out.println("Numbers");

            }
            else
            {
                System.out.println("Special Characters");

            }


    }
}
