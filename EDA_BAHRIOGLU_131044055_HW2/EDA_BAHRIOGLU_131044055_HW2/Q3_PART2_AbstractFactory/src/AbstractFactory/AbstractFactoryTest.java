package AbstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {

        AbstractFactory modelFactory = FactoryProducer.getFactory("MODEL");

        Model model1 = modelFactory.getModel("TPX100");
        model1.purpose();
        model1.constructSkeleton();
        model1.placeEngines();
        model1.placeSeats();

        Model model2 = modelFactory.getModel("TPX200");
        model2.purpose();
        model2.constructSkeleton();
        model2.placeEngines();
        model2.placeSeats();

        Model model3 = modelFactory.getModel("TPX300");
        model3.purpose();
        model3.constructSkeleton();
        model3.placeEngines();
        model3.placeSeats();


        AbstractFactory marketFactory = FactoryProducer.getFactory("MARKET");

        Market market1 = marketFactory.getMarket("DOMESTIC");
        market1.EnginInjection();
        market1.SeatingCover();

        Market market2 = marketFactory.getMarket("EURASIA");
        market2.EnginInjection();
        market2.SeatingCover();

        Market market3 = marketFactory.getMarket("OTHER");
        market3.EnginInjection();
        market3.SeatingCover();
    }
}
