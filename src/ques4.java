import java.util.Scanner;

public class ques4{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }

        }
    }
}
