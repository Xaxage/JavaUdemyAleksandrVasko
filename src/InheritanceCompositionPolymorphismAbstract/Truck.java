package InheritanceCompositionPolymorphismAbstract;

public class Truck extends FuelAuto {

    private  int cargoWeight;

    public Truck(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int cargoWeight) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.cargoWeight = cargoWeight;
        System.out.println("Truck was initialized.");
    }

    @Override
    public void start() {
        isRunning=true;
        setCurrentSpeed(10);
        System.out.println("Truck is starting. ");
    }

    @Override
    public void stop() {
        isRunning=false;
        setCurrentSpeed(0);
        System.out.println("Our truck has stopped. ");
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume()-getAvailablePetrolNow());
    }

    public void load(){
        System.out.println("Cargo loaded");
    }
    public void unLoad(){
        System.out.println("Cargo is unloaded");
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
