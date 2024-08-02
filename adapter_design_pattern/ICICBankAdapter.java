public class ICICBankAdapter implements BankAPI {

    ICICBank icicBank = new ICICBank();

    @Override
    public void sendMoney(String from,String to){
        icicBank.doTransaction(from, to);
    }

}
