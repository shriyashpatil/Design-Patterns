public class PhonePe{

    public static void main(String[] args) {
        
        BankAPI yesBankAPI = new YesBankAdapter();
        yesBankAPI.sendMoney("shri", "ram");

        BankAPI icicBankAPI = new ICICBankAdapter();
        icicBankAPI.sendMoney("ram", "shri");

    }

}