package StatePart;

public class LifeTest {
    public static void main(String[] args)
    {
        try {


            System.out.println("ready -> needingSleep");
            LifeCycle lifeCycle = new LifeCycle();
            lifeCycle.OutTillLate();
            System.out.println();

            System.out.println("needingSleep -> ready");
            LifeCycle lifeCycle1 = new LifeCycle();
            lifeCycle1.Sleep();
            System.out.println();

            System.out.println("ready -> graduate");
            LifeCycle lifeCycle2 = new LifeCycle();
            lifeCycle2.PerseveranceAndHardWork();
            System.out.println();

            System.out.println("ready -> fit -> graduate");
            LifeCycle lifeCycle3 = new LifeCycle();
            lifeCycle3.Exercise();
            lifeCycle3.PerseveranceAndHardWork();
            System.out.println();

            System.out.println("needingSleep -> chronic illness");
            LifeCycle lifeCycle4 = new LifeCycle();
            lifeCycle4.CoffeeAndWork();
            System.out.println();

            System.out.println("ready -> unable to become");
            LifeCycle lifeCycle5 = new LifeCycle();
            lifeCycle5.BuyingGTX1080orMore();
            LifeCycle lifeCycle6 = new LifeCycle();
            lifeCycle6.Cheating();
        }
        catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

    }
}
