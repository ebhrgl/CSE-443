package CardPayments;

public class TurboCardPayment implements TurboPayment {

    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo){
        System.out.printf("TurboCardPayment : %s %f %s %s\n",turboCardNo, turboAmount,destinationTurboOfCourse, installmentsButInTurbo);
        return 1;
    }
}
