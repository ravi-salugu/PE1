import java.util.Scanner;

public class stringq3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();

        s = s.toLowerCase();
        for(int i = 0; i < s.length()-1; ++i)
        {

            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                System.out.println(ch+"  Vowel ");
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                System.out.println(ch + "  Consonant ");
            } else{System.out.println(ch+"  Not an alphabet");}
        }
    }
}
