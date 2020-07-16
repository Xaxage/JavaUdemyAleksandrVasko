package Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {

        Truck truck= new Truck("Volvo","VNL 300",EngineType.PETROL,300,500,10000);
        truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUp(50);
        truck.load();
        truck.unLoad();
        System.out.println("\n");

        ElectricCar car=new ElectricCar("Tesla","Supertruck",78000,5);
        car.start();
        car.stop();
        car.charge();
        System.out.println("\n");

        Bus bus=new Bus("Mercedes","Sprinter",EngineType.DIESEL,50,120,45);
        bus.fuelUp(30);
        bus.pickUpPassengers(25);
        bus.start();
        bus.releasePassengers();


    }
}
