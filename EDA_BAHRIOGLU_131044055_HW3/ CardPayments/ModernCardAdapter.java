package CardPayments;

public class ModernCardAdapter implements TurboPayment {

    ModernPayment moderncard;

    public ModernCardAdapter(ModernPayment moderncard) {
        this.moderncard = moderncard;
    }

    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        moderncard.pay(turboCardNo,turboAmount,destinationTurboOfCourse,installmentsButInTurbo);
        return 1;
    }
}
