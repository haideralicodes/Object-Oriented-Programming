public class question5 {
    public static void main(String args[]){
        double[] array = new double[10];    // part a

        arrayOperations(array);
    }
    public static void arrayOperations(double[] array){
        array[array.length-1] = 5.5;    //  part b

        double sum1 = array[0] + array[1];   
        System.out.println("The sum of first two elements is: " + sum1); // part c

        // sum of all array elements
        double sum2 = 0;
        for(int i = 0; i < array.length; i++){
            sum2 = sum2 + array[i]; 
        }   // part d
        System.out.println("The sum of all array elements is: " + sum2);


        // for(int i = 0; i < array.length; i++){
        //     System.out.print(array[i] + " "); 
        // }

        // part e(minimum number)
        double minimum  = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < minimum){
                minimum = array[i];
            }
        }

        //part g
        double[] myArray = {3.5, 5.5, 4.52, 5.6};
        for(int i = 0; i < myArray.length; i++){
                System.out.print(myArray[i] + " "); 
         }

        System.out.println("The minimum numnber in the array is: " + minimum + "\n");

        //genertating random index
        int randomIndex = (int)(Math.random() * 10);
        System.out.println(array[randomIndex]);
    }
}
