public interface BankInterface {
    double checkBalance();
    String addMoney(int amount);
    String withdrawMoney(int amount, String pass);
    double rateOfInterest(int years);

}
