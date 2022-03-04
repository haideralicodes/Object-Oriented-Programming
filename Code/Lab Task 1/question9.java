import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = "Welcome to shark tank";

        replaceChar(str);
    }
    public static void replaceChar(String s1){
        String b = s1.replace('a', 'Z');
        System.out.println(b);
    }
}
