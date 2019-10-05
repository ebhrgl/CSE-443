package AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("MODEL")){
            return new ModelFactory();

        }else if(choice.equalsIgnoreCase("MARKET")){
            return new MarketFactory();
        }

        return null;
    }
}

