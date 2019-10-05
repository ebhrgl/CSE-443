package StatePart;

public class Fit implements State {
    private LifeCycle lifeCycle;

    public Fit(LifeCycle lifeCycle){
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
        System.out.println("Perseverance And HardWork");
        lifeCycle.setCurrentState(lifeCycle.getGraduateState());
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
