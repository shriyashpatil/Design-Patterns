public class YesBankAdapter implements BankAPI {
    
    YesBank yesBank = new YesBank();

    @Override
    public void sendMoney(String from,String to){
        yesBank.transferMoney(from, to);
    }

}
