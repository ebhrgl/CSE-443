package SUITS;

public class RocketLauncher extends SuitDecorator {
    private  SUITS suits;

    /**
     *
     * @param suits
     * @param number
     */
    public RocketLauncher(SUITS suits,int number){

        this.suits = suits;
        num = number;
    }

    /**
     *
     * @return
     */
    @Override
    public double getCost() {

        return suits.getCost() + (150000*num);
    }

    /**
     *
     * @return
     */
    @Override
    public double getWeight() {

        return suits.getWeight() + (7.5*num);
    }
}
