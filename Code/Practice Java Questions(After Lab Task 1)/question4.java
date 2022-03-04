import java.util.Scanner;

public class question4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point x1: ");
        double x1 = sc.nextDouble();
        
        System.out.print("Enter point x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter point y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter point y2: ");
        double y2 = sc.nextDouble();

        distanceOfpoints(x1, y1, x2, y2);
    }
    public static void distanceOfpoints(double x1, double x2, double y1, double y2){
        double distanceFormula = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
        System.out.print("THe distance between " + "(" + x1 + "," + y1 + ")" + " and " + " (" + x2 + "," + y2 + " )" + " is " + distanceFormula);
    }
}

/**
 * double distanceFormula = Math.sqrt((x2-x1)^2 + (y2-y1)^2).
 */
