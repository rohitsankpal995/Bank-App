import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name, password , balance");

        // create user
        Scanner sc =new Scanner(System.in);
        String name =sc.next();
        String password =sc.next();
        double balance =sc.nextDouble();
        SBIUser user =new SBIUser(name,balance,password);

        //add money
        int amount =10000;
        String add =user.addMoney(amount);
        System.out.println(add);

        // Withdraw money
        System.out.println("Enter Password");
        String pass =sc.next();
        System.out.println("Enter amount to be withdraw");
        int amt =sc.nextInt();
        String massage =user.withdrawMoney(amt,pass);
        System.out.println(massage);

        // rate of interest
        System.out.println("Calculate interest/ enter no of years");
        int years =sc.nextInt();
        System.out.println(user.rateOfInterest(years));
    }
}