public class Account {
    int balance;
    String cnic;
    int yearofOpening ;

    public void Account(){
        // default Constructor
    }

    public void Account(int bal){
        //One-Argument Constructor
        if(bal>0){
            balance = bal;
        }
    }

    public void Account(int bal, String c, int y){
        //Three-Argument Constructor

        if(bal>0 && c.length()==13 && y>0){
            balance = bal;
            cnic = c;
            yearofOpening = y;
        }
    }

    public void setValues(int bal, String c, int y){
        if(bal>0 && c.length()==13 && y > 0){
            balance = bal;
            cnic = c;
            yearofOpening = y;
        }
    }

    public void display(){
        System.out.println("The balance is: " + balance);
        System.out.println("The cnic is: " + cnic);
        System.out.println("The year of opening account is: " + yearofOpening );
    }  

    public int deposit(int moneyToDeposit){
        if(moneyToDeposit < 0){
            System.out.println("You cannot enter negative withdrawal ammount");
            return balance;
        }
        else{
            balance = moneyToDeposit + balance;
            return balance;
        }
        
    }

    public int withdraw(int moneyToWithdraw){
        if(moneyToWithdraw < 0){
            System.out.println("You cannot enter negative deposit money ");
            return balance;
        }
        else{
            balance = moneyToWithdraw - balance;
            return balance;
        }
    }

    public int calculateAgeOfAccount(int currentYear){
        return currentYear - yearofOpening;
    }

}
