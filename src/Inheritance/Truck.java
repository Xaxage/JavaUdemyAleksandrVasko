package Inheritance;

public class Truck extends FuelAuto {

    private  int cargoWeight;

    public Truck(String producer, String model, EngineType engintype, int availablePetrol, int tankVolume, int cargoWeight) {
        super(producer, model, engintype, availablePetrol, tankVolume);
        this.cargoWeight = cargoWeight;
        System.out.println("Constructing a truck");
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
