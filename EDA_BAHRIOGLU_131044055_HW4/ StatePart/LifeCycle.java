package StatePart;

public class LifeCycle {
    private State readyState;
    private State needingSleepState;
    private State chronicIlnessState;
    private State graduateState;
    private State fitState;
    private State unabeleToBecome;
    private State currentState;

    public LifeCycle()
    {
        readyState = new Ready(this);
        needingSleepState = new NeedingSleep(this);
        chronicIlnessState = new ChronicIllness(this);
        graduateState = new Graduate(this);
        fitState = new Fit(this);
        unabeleToBecome = new UnableToBecome(this);
        currentState = readyState;
        System.out.println("Ready");

    }

    public void setCurrentState(State state){
        this.currentState = state;
    }

    public State getCurrentState(){
        return currentState;
    }

    public State getReadyState(){
        return readyState;
    }

    public State getNeedingSleepState(){
        return needingSleepState;
    }

    public State getChronicIlnessState(){
        return chronicIlnessState;
    }

    public State getGraduateState(){
        return graduateState;
    }

    public State getFitState(){
        return fitState;
    }

    public State getUnabeleToBecome(){
        return unabeleToBecome;
    }

    public void CoffeeAndWork(){
        this.currentState.CoffeeAndWork();
    }

    public void Sleep(){
        this.currentState.Sleep();
    }

    public void PerseveranceAndHardWork(){
        this.currentState.PerseveranceAndHardWork();
    }

    public void Exercise(){
        this.currentState.Exercise();
    }

    public void OutTillLate(){
        this.currentState.OutTillLate();
    }

    public void BuyingGTX1080orMore(){
        this.currentState.BuyingGTX1080orMore();
    }

    public void Cheating(){
        this.currentState.Cheating();
    }


}
