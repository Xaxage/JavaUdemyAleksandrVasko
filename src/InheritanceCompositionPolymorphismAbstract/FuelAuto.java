package InheritanceCompositionPolymorphismAbstract;

public abstract class FuelAuto extends Auto{
    private int availablePetrolNow;
    private int tankVolume;

    public FuelAuto(String producer, String model, Engine engine, int availablePetrolNow, int tankVolume) {
        super(producer, model, engine);
        this.availablePetrolNow = availablePetrolNow;
        this.tankVolume = tankVolume;
    }

    public void fuelUp(int petrolVolume){
        availablePetrolNow +=petrolVolume;
        System.out.println("Adding fuel");
    }

    public int getAvailablePetrolNow() {
        return availablePetrolNow;
    }

    public void setAvailablePetrolNow(int availablePetrolNow) {
        this.availablePetrolNow = availablePetrolNow;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
