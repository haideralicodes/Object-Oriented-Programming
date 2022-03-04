import java.util.Scanner;

public class question6 {
    public static void main(String arsg[]){
        double[] array = new double[10];

        double myAverage = 0;

        double myDouble =  average(array, myAverage);  

        System.out.println("The average of array elements is: " + myAverage);
    }
    public static double average(double[] array, double average){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the input in array: ");
            
            double sum = 0;

            //  loop for geeting input in the array
            for(int i = 0; i < array.length; i++){
                array[i] = sc.nextDouble();
            }

            //  loop for printing the array elements
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
            
            //  loop for finding the sum of array elements
            for(int i = 0; i < array.length; i++){
                sum = sum + array[i];
            }
            average = sum/ array.length;
            
            return average;
        }
    }
}
