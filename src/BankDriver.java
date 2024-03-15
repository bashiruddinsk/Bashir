public class BankDriver {
    public static void main(String[]args)
    {
        IciciBank cus1=new IciciBank("Bashir",123,2500);
        cus1.cusDetails();
        cus1.deposit(500);
        cus1.cusDetails();
    }
}
