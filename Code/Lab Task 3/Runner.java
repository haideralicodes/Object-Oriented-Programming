public class Runner{
    public static void main(String args[]){
        
        // // Q1
        // Account a1 = new Account();

        // a1.setValues(1200, "1234567891234", 2022);
        // a1.display();
        // // a1.Account();        //Default Constructor
        // // a1.Account(1500);    //One-Argument Constructor
        // // a1.Account(2400, "3452348976345", 2021);    //Three-Argument Constructor
        
        // a1.deposit(1000);
        // a1.withdraw(500);
        // a1.calculateAgeOfAccount(2022);
        
        // Q2
        QuadraticEquation q1 = new QuadraticEquation();

        q1.setValues(2.5, 5.1, 10.6);
        q1.display();
        q1.getDiscriminant();
        q1.checkIfDescriminantIsGretaerThan100();

    }
}