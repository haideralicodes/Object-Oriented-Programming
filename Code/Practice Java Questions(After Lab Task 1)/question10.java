import java.util.Scanner;

public class question10 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");

        String input = sc.next();

        string(input);        
    }
    public static void string(String input){
        System.out.println("The length of string is: " + input.length());
        System.out.println("The first character of the string is: " + input.charAt(0));
    }
}
