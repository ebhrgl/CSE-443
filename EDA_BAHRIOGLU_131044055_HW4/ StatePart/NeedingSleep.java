package StatePart;

public class NeedingSleep implements State {
    private LifeCycle lifeCycle;

    public NeedingSleep(LifeCycle lifeCycle){
        this.lifeCycle = lifeCycle;
    }
    @Override
    public void CoffeeAndWork() {
        System.out.println("Coffee And Work");
        lifeCycle.setCurrentState(lifeCycle.getChronicIlnessState());
    }

    @Override
    public void Sleep() {
        System.out.println("Sleep");
        lifeCycle.setCurrentState(lifeCycle.getReadyState());
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
