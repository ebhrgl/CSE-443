package CardPayments;

public class ModernCardPayment implements ModernPayment{

    public int pay(String cardNo, float amount, String destination, String installments){
        System.out.printf("ModernCardPayment : %s %f %s %s\n",cardNo, amount,destination, installments);
        return 1;
    }
}
