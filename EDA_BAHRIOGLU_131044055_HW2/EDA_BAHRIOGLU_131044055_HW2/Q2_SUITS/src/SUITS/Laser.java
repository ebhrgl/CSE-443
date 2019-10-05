package SUITS;

public class Laser extends SuitDecorator {
    private  SUITS suits;

    /**
     *
     * @param suits
     * @param number
     */
    public Laser(SUITS suits,int number){
        this.suits = suits;
        num = number;
    }

    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return suits.getCost() + (200000*num);
    }

    /**
     *
     * @return
     */
    @Override
    public double getWeight() {
        return suits.getWeight() + (5.5*num);
    }
}
