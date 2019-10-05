package SUITS;

public abstract class SuitDecorator implements SUITS {
    protected int num;

    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return 0;
    }

    /**
     *
     * @return
     */
    @Override
    public double getWeight() {
        return 0;
    }
}
