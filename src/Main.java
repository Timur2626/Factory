public class Main {
    public static void main(String[] args) {
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Application app1 = new Application(victorianFactory);
        app1.useFurniture();


        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Application app2 = new Application(modernFactory);
        app2.useFurniture();
    }
}

class Application {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public Application(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
    }

    public void useFurniture() {
        chair.sitOn();
        sofa.lieOn();
        coffeeTable.putCoffee();
    }
}