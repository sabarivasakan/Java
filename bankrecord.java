import java.util.*;
import java.time.Clock;
interface Bank {
    void deposit(int amount);
    void withdraw(int amount);
    void balance();
}

class Operation implements Bank {
    private int bank_balance = 0;
    public void deposit(int amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid Amount");
            }
            bank_balance += amount;
            System.out.println("Deposited: " + amount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void withdraw(int amount){
        try{
            if(amount>bank_balance){
                throw new ArithmeticException("High amount");
                
            }
            if (amount<=0){
                throw new IllegalArgumentException("Invalid Input");
            }
            bank_balance-=amount;
            System.out.println("Amount Withdrawed : "+amount);
            
            System.out.println("Balnce Amount     : "+bank_balance);
            
        }
        catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    void Balance_Enquiry(){
        System.out.println("Bank Balance : "+ bank_balance);
    }
    
    public void balance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class Bankrecord {
    public static void main(String[] args) {
        Operation acc;
        acc = new Operation();
        Scanner scan;
        scan=new Scanner(System.in);
        
        do{
            System.out.println("\nBank Record");
            System.out.println("1 - Deposit ");
            System.out.println("2 - Withdrawl");
            System.out.println("3 - Check Balance ");
            System.out.println("4 - Exit");
            System.out.println("Enter choice : ");
            int ch = scan.nextInt();
            switch(ch){
                case 1:
                    System.out.print("\nAmount : ");
                    int am=scan.nextInt();
                    acc.deposit(am);
                    break;
                case 2:
                    System.out.print("\nAmount : ");
                    int amo=scan.nextInt();
                    acc.withdraw(amo);
                    break;
                case 3:
                    acc.Balance_Enquiry();
                    break;
                    
            }
            
        }while (true);
        
    }
}
