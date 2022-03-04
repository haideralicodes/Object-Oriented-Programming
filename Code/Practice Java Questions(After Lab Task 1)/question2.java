import java.util.Scanner;

public class question2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = input.next();
        System.out.print("Enter string 2: ");
        String s2 = input.next();
        System.out.print("Enter string 3: ");
        String s3 = input.next();
        System.out.print("Enter string 4: ");
        String s4 = input.next();

        concatedString(s1, s2, s3, s4);
    }
    public static void concatedString(String s1, String s2, String s3, String s4){
        String s5 = s1 + " " + s2 + " " + s3 + " " + s4;
        System.out.println(s5); 
    }
}
