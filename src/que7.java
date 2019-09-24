
import java.util.*;

public class que7 {
    public static void main(String[] args) {
        String s; int esum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String line = sc.nextLine();
        int num = Integer.parseInt(line);
        int len=line.length();
        int a[]=new int[len];
        for(int i=0;i<len;i++)
        {
            a[i]=num%10;
            num=num/10;
        }
         Arrays.sort(a);
        for(int i=len-1;i>=0;i--)
        {
            if(a[i]%2==0) {esum=esum+a[i];}
            System.out.print(a[i]);

        }
        System.out.println();
        System.out.print(esum);

    }
}