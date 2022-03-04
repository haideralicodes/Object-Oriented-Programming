import java.util.Scanner;

public class question3 {
   public static void main(String args[]){

    int[] myArray = new int[5];
        array(myArray);
    }

    public static void array(int[] array) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter input in array: ");

            int count1 = 0;
            int count2 = 0;

            for (int i = 0; i < 5; i++) {
                array[i] = sc.nextInt();

                if (array[i] == 0) {
                    continue;
                }

                if(array[i] % 2 == 0){
                    count1++;
                }


                if(array[i] % 2  != 0){
                    count2++;
                }
            }
            System.out.println( "The number of even numbers are: " + count1);
            System.out.println( "The number of odd numbers are: " + count2);
        }
    }
}

