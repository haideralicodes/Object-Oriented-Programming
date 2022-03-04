import java.util.Scanner;

public class question8 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String[] topics = {"issue1", "issue2", "issue3", "issue4",  "issue5"};
        int[][] responses = new int[5][10];
        
        int checkResponse = 0;
        for(int i = 0; i < topics.length; i++){
            System.out.println("Enter the response for: " + topics[i]);
        }
        for(int i =0;  i < responses.length; i++){
            for(int j = 0; j < responses[i].length; j++){
                
                System.out.println("Rate between 1 to 10: ");
                checkResponse = sc.nextInt();
                if(checkResponse >= 11 || checkResponse<=0){
                    j--;
                }
                else{
                    checkResponse = responses[i][j];
                     }
            }
        }
        double[] average = new double[5];
        for(int i = 0; i < average.length; i++){
            for(int j = 0; j < responses[i].length; j++){
                average[i] = average[i] + responses[i][j]; 
            }
            average[i] = average[i] / 2;
        }
        for(int i =0; i < average.length; i++){
            System.out.println("Average for rating " + topics[i] + " is: " + average[i]);
        }
        int highIndex = 0;
        int lowIndex = 0; 
        double high = 0;
        double low = average[0];

        for(int i = 0; i < average.length;i++){
            if(average[i] < low){
                low = average[i];
                lowIndex = i;
            }
            if (average[i] > high) {
                high = average[i];
                highIndex = i;
            }     
        }
        System.out.println("highest average rating is for: " + topics[highIndex] + " and is: " + high);
        System.out.println("Lowest average rating is for: " + topics[lowIndex] + " and is: " + low);
    }
}
