import java.util.Scanner;

public class question3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int standardHours  = 3;
        System.out.print("Enter the no. of hours: ");
        int noOfHours = sc.nextInt();

        carParked(standardHours, noOfHours);
    }
    public static void carParked(int standardHours,int noOfHours){
        float extraCharges = 0.5F;  // 0.5$
        int standardCharges = 2;    // 2$
        int hours = noOfHours - standardHours;
        if(hours == 0){
            System.out.println("The total parking charges are: 2$");
        }
        else{
            float totalCharges = (hours * extraCharges) + standardCharges;
            System.out.println("Your total parking charges are: " + (int)(totalCharges) + "$");             
        }
    }
}



/*

3 hours = 2$ .......>> standard hours
if late:               
per hour = 0.5$ ....>> extra charges

5 hours===>> .......>> no. of hours

2 hours late---->> (no. of hours - standard hours) = total hours >>>====<<< total hours *              

total parking charges =  3$
*/  
