package Inheritance;

import java.util.List;

public class InheritanceMain {
    public static void main(String[] args) {

        Engine truckEngine=new Engine(6,EngineType.DIESEL,900);//We are creating
        // object of Engine so we can use everything from class Engine => from Piston too.
        Truck truck= new Truck("Volvo","VNL 300",truckEngine,300,500,10000);
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

        Engine busEngine =new Engine(3.5,EngineType.DIESEL,150);//We are creating
        // object of Engine so we can use everything from class Engine => from Piston too.
        Bus bus=new Bus("Mercedes","Sprinter",busEngine,50,120,45);
        bus.fuelUp(30);
        bus.pickUpPassengers(25);
        bus.start();
        bus.releasePassengers();
        Engine engine=bus.getEngine();
        System.out.println(engine.getEngineType());
        List<Piston> pistons= engine.getPistons();
        System.out.println(pistons);


    }
}
