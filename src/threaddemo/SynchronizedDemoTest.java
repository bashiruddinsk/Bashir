package threaddemo;

public class SynchronizedDemoTest {

    public static void main(String[]args)
    {
        PetrolStation petrolStation=new PetrolStation();

        Thread ap01ee1234=new Vehicle(3,"empty","petrol",petrolStation);
        ap01ee1234.setName("ap01ee1234");
        Thread ap02ee1234=new Vehicle(5,"empty","petrol",petrolStation);
        ap02ee1234.setName("ap02ee1234");
        Thread ap03ee1234=new Vehicle(7,"empty","petrol",petrolStation);
        ap03ee1234.setName(" ap03ee1234");
        Thread ap04ee1234=new Vehicle(9,"empty","petrol",petrolStation);
        ap04ee1234.setName("ap04ee1234");

        ap01ee1234.start();
        ap02ee1234.start();
        ap03ee1234.start();
        ap04ee1234.start();

    }
}
