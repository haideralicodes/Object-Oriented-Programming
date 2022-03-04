import java.util.Scanner;

public class question1{
    public static void main(String args[]){

        try (Scanner console = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int a = console.nextInt();

			System.out.print("Enter the power of that number: ");
			int b = console.nextInt();
			power(a, b);
			System.out.print(a +  " power of " + b + " is " +  power(a, b));
		}
    }
    public static int power(int x, int y){
        int z = (int)(Math.pow(x, y));
        return z;
}
}