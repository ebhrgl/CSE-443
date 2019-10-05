package StatePart;

public class Graduate implements State {
    private LifeCycle lifeCycle;

    public Graduate(LifeCycle lifeCycle){
        this.lifeCycle = lifeCycle;
    }
    @Override
    public void CoffeeAndWork() {
        throw new UnsupportedOperationException("UnSupported");
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
