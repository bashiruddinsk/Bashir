package threaddemo;

public class Vehicle extends Thread {

    int liters;
    String status;
    String type;
    PetrolStation petrolStation;

    public Vehicle(int liters, String status, String type, PetrolStation petrolStation) {
        this.liters = liters;
        this.petrolStation = petrolStation;
        this.status = status;
        this.type = type;
    }

    public void run() {
        if (type.equals("petrol")) {
            System.out.println("Vehicle number == " + Thread.currentThread().getName());
            petrolStation.petrol(Thread.currentThread().getName(), this.liters);
        } else {
            System.out.println("Vehicle number == " + Thread.currentThread().getName());
            petrolStation.diesel(Thread.currentThread().getName(), this.liters);
        }

    }


}
