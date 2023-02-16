import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {
    // Attributes
    private String Name;
    private String accountNo;
    private double balance;
    private String password;
    private static double rateOFInterest;

    public SBIUser(String name, double balance, String password) {
        Name = name;
        this.balance = balance;
        this.password = password;

        this.accountNo=String.valueOf(UUID.randomUUID());
        this.rateOFInterest =6.5;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOFInterest() {
        return rateOFInterest;
    }

    public static void setRateOFInterest(double rateOFInterest) {
        SBIUser.rateOFInterest = rateOFInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {


        balance=balance+amount;
        System.out.println(" new balance is"+ balance);
        return "Money is succesfully Deposited";
    }

    @Override
    public String withdrawMoney(int amount, String pass) {

        if(Objects.equals(password,pass)){
            if(amount>balance){
               return  "insufficient Balance";

            }else {
                balance=balance-amount;
                System.out.println("Remainning balance is"+balance);
                return "money withdrawal successful";
            }

        }else{
            return "wrong password";
        }

    }

    @Override
    public double rateOfInterest(int years) {
        return (balance*rateOFInterest*years)/100;
    }
}
