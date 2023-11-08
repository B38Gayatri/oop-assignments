import java.util.Scanner;
class account {
    Scanner sc = new Scanner(System.in);
    double amount;
    double balance;
    public void getBalance() {
        System.out.println("Balance in your acc is "+balance);
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void debit(){
        System.out.println("Enter money to withdraw from account :");
        amount = sc.nextDouble();
        if(amount<=balance){
        double newbalance = balance-amount;
        System.out.println("Total balance in account "+newbalance);
        System.out.println("You have Successfully Withdrawn "+amount+"Rupees");
        }
        else if(amount==balance){
    System.out.println("Balance is zero in account");
    System.out.println("You have Successfully Withdrawn "+amount+"Rupees");
        }
        else{
    System.out.println("Debit amount exceeded the Balance !! \nPlease tryagain");
        }
  }
}
public class practiceset3 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        account n = new account();
        n.setBalance(5000);
        n.getBalance();
        n.debit();
        }
}
