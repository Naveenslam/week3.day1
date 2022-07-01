public class AxisBank extends BankInfo {

    public void deposit(int amount) {
        System.out.println("deposit amount is :"+amount);
    }


    public static void main(String[] args) {
        BankInfo amtDetails = new AxisBank();
        amtDetails.saving();
        amtDetails.fixed();
        amtDetails.deposit(35000);

    }
}
