import java.util.Scanner;

public class question7 {
    public static void main(String args[]){
        double[] array = new double[10];

        Scanner input  = new Scanner(System.in);

        //  loop for entering the array elements
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        double minimum = array[0];

        double myMinimum = min(array, minimum);
        System.out.println("The minimum number in array is: " + minimum);
    }
    public static double min(double[] array, double minimum){
        
        //   loop for finding the minimum in the array
        for(int i = 0; i < array.length; i++){
            if(array[i] < minimum){
                minimum = array[i];
            }
        }
        return minimum;
    }
}
