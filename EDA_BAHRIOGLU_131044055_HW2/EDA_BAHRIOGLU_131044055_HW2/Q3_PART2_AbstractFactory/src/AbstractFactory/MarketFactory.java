package AbstractFactory;

public class MarketFactory extends AbstractFactory {
    @Override
    public Model getModel(String model){

        return null;
    }

    @Override
    Market getMarket(String market) {
        if(market == null){
            return null;
        }

        if(market.equalsIgnoreCase("DOMESTIC")){
            return new Domestic();

        }else if(market.equalsIgnoreCase("EURASIA")){
            return new Eurasia();

        }else if(market.equalsIgnoreCase("OTHER")){
            return new Other();
        }

        return null;
    }
}
