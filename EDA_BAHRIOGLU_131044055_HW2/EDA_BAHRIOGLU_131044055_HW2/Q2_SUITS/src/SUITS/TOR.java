package SUITS;

public class TOR implements SUITS{
    private int num;

    /**
     *
     * @param number
     */
    public TOR(int number){
        num = number;
    }

    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return 5000000*num;
    }

    /**
     *
     * @return
     */
    @Override
    public double getWeight() {
        return 50*num;
    }
}
