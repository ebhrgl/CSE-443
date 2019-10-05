package AbstractFactory;

public class ModelFactory extends AbstractFactory {

    @Override
    public Model getModel(String model){

        if(model == null){
            return null;
        }

        if(model.equalsIgnoreCase("TPX100")){
            return new TPX100();

        }else if(model.equalsIgnoreCase("TPX200")){
            return new TPX200();

        }else if(model.equalsIgnoreCase("TPX300")){
            return new TPX300();
        }

        return null;
    }

    @Override
    Market getMarket(String market) {
        return null;
    }
}
