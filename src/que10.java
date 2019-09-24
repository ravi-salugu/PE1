import java.util.Scanner;

class que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String line = sc.nextLine();
        System.out.print("Input a number ");
        int n = sc.nextInt();
        int l=line.length();
        String ss=line.substring(l-n);

        System.out.println(line+ss.repeat(n));
    }
}