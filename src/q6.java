import java.util.Scanner;

public class q6 {
 public static void main()  {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
       String line = sc.nextLine();

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
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
                System.out.println("Capital letters");

            }
        }

    }
}