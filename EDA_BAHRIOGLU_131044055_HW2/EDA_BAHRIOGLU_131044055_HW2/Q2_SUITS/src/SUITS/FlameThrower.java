package SUITS;

public class FlameThrower extends SuitDecorator {

    private  SUITS suits;

    /**
     *
     * @param suits
     * @param number
     */
    public FlameThrower(SUITS suits,int number){
        this.suits = suits;
        num = number;
    }

    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return suits.getCost() + (50000*num);
    }

    /**
     *
     * @return
     */
    @Override
    public double getWeight() {

        return suits.getWeight() + (2000*num);
    }
}
