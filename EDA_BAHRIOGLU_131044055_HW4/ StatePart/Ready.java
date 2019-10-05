package StatePart;

public class Ready implements State {
    private LifeCycle lifeCycle;

    public Ready(LifeCycle lifeCycle){
        this.lifeCycle = lifeCycle;
    }

    @Override
    public void CoffeeAndWork() {
        System.out.println("Unsupported");
    }

    @Override
    public void Sleep() {
        System.out.println("Unsupported");
    }

    @Override
    public void PerseveranceAndHardWork() {
        System.out.println("Perseverance And HardWork");
        lifeCycle.setCurrentState(lifeCycle.getGraduateState());
    }

    @Override
    public void Exercise() {
        System.out.println("Exercise");
        lifeCycle.setCurrentState(lifeCycle.getFitState());
    }

    @Override
    public void OutTillLate() {
        System.out.println("Out Till Late");
        lifeCycle.setCurrentState(lifeCycle.getNeedingSleepState());
    }

    @Override
    public void BuyingGTX1080orMore() {
        System.out.println("Buying GTX1080 or More");
        lifeCycle.setCurrentState(lifeCycle.getUnabeleToBecome());
    }

    @Override
    public void Cheating() {
        System.out.println("Cheating");
        lifeCycle.setCurrentState(lifeCycle.getUnabeleToBecome());
    }
}
