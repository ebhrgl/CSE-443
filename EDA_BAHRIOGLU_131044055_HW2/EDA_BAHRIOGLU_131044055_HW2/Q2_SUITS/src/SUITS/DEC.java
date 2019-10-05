package SUITS;

public class DEC implements SUITS {

    private int num;

    /**
     *
     * @param number
     */
    public DEC(int number){
        num = number;
    }

    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return 500000*num;
    }

    /**
     *
     * @return
     */
    @Override
    public double getWeight() {
        return 25*num;
    }
}
