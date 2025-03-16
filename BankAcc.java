abstract class BankAccount {  
    abstract void deposit();  
    abstract void withdraw();  
    abstract void balance();  
}  
  
class DigitalBank extends BankAccount {  
    @Override
    void deposit() {  
        System.out.println("Deposited");  
    }  
     
    @Override
    void withdraw() {  
        System.out.println("Withdraw");  
    }  
     
    @Override
    void balance() {  
        System.out.println("Balance is checked");  
    }  
 
    void payOnline() {  
        System.out.println("Paid Online");  
    }  
}  
  
public class BankAcc {  
    public static void main(String[] args) {  
        BankAccount acc = new DigitalBank();   
        acc.deposit();   
        acc.withdraw();   
        acc.balance();   
         
        DigitalBank dig = new DigitalBank();   
 dig.payOnline();   
    }  
} 