public class Abstract {
    public static void main(String[] args) {
        Payment p=new CreditCard();
        Payment p1=new UPIPay();
        p.Process(1000.123);
        p1.Process(3000.456);
        
    }
}
abstract class Payment{
    public abstract void  Process(double amount);

}
class CreditCard extends Payment{
    @Override
   public void Process(double amount){
        System.out.println("Creditcard Payment"+amount);

    }
}
class UPIPay extends Payment{
    @Override
    public void Process(double amount){
        System.out.println("UPI Payement"+amount);
    }

}
