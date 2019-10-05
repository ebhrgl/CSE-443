package SUITS;

public class ORA implements SUITS {
    private int num;

    /**
     *
     * @param number
     */
    public ORA(int number){
        num = number;
    }

    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return 1500000*num;
    }

    /**
     *
     * @return
     */
    @Override
    public double getWeight() {
        return 30*num;
    }
}
