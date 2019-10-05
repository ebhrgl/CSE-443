package SUITS;

public class AutoRifle extends SuitDecorator {

    private  SUITS suits;

    /**
     *
     * @param suits
     * @param number
     */
    public AutoRifle(SUITS suits,int number){
        this.suits = suits;
        num = number;
    }

    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return suits.getCost()+(30000*num);
    }

    /**
     *
     * @return
     */
    @Override
    public double getWeight() {
        return suits.getWeight() + (1.5*num);
    }
}
