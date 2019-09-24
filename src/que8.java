import java.util.*;
public class que8{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target=72,flag=0;
        while(flag==0)
        {
            System.out.print("Input a number between 1-100: ");
            int n = in.nextInt();
            if(n==target)
            {System.out.print("Number matched ");flag=1;
            break;}
            else if(n<target) {
                System.out.println("Number less than target try again ");
            } else {System.out.println("Number more than target try again ");  }
        }


    }
}
