package CardPayments;

public class TestClass {


    public static void main(String args[])
    {
        ModernCardPayment modernCardPayment = new ModernCardPayment();
        TurboPayment turboPayment = new TurboCardPayment();

        TurboPayment birdAdapter = new ModernCardAdapter(modernCardPayment);

        modernCardPayment. pay("1234567", 0,  "x",  "5");
        turboPayment.payInTurbo("2345678", 1,  "y", "8");
        birdAdapter.payInTurbo("1111111",2,"z","12");
    }
}
