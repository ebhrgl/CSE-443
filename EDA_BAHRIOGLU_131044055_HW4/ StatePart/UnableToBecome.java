package StatePart;

public class UnableToBecome implements State {
    private LifeCycle lifeCycle;

    public UnableToBecome(LifeCycle lifeCycle){
        System.out.println("Unable To Become");
        this.lifeCycle = lifeCycle;
    }
    @Override
    public void CoffeeAndWork() {
        System.out.println("UnSupported");
    }

    @Override
    public void Sleep() {
        System.out.println("UnSupported");
    }

    @Override
    public void PerseveranceAndHardWork() {
        System.out.println("UnSupported");
    }

    @Override
    public void Exercise() {
        System.out.println("UnSupported");
    }

    @Override
    public void OutTillLate() {
        System.out.println("UnSupported");
    }

    @Override
    public void BuyingGTX1080orMore() {
        System.out.println("UnSupported");
    }

    @Override
    public void Cheating() {
        System.out.println("UnSupported");
    }
}
