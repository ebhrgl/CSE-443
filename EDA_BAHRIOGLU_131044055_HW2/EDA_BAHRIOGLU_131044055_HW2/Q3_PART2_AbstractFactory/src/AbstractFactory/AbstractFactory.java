package AbstractFactory;

public abstract class AbstractFactory  {
    abstract Model getModel(String model);
    abstract Market getMarket(String market);

}

