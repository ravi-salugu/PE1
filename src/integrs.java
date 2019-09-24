import java.util.Scanner;

public class integrs {

    public static void main(String[] args) {

        int n, m, a = 0,x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        if(n>20 && n<30)
        {
            if(n%2==0) {System.out.print("Jerry");}
            else{System.out.print("Tom");}

        }
    }
}
