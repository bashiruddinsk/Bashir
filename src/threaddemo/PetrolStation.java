package threaddemo;

public class PetrolStation {

    public synchronized  void petrol(String vehicleNumber,int numberOfLiters)
    {
        for (int i=0;i<=numberOfLiters;i++)
        {
            System.out.println("Vehicle Number"+vehicleNumber+"Filled petrol in liters == "+i);
        }

    }

    public   void diesel(String vehicleNumber, int numberOfLiters)
    {
        for (int i=0;i<=numberOfLiters;i++)
        {
            System.out.println("Vehicle Number "+vehicleNumber+"Filled diesel in liters == "+i);
        }
    }
}
