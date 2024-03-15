public class IciciBank {
    String cusName;
    int accNum;
    double balance;

    IciciBank(String cusName, int accNum, double balance) {
        this.cusName = cusName;
        this.accNum = accNum;
        this.balance = balance;
    }

    void cusDetails() {
        System.out.println("customer name : "+ cusName);
        System.out.println("customer name : "+ accNum);
        System.out.println("customer name : "+ balance);
        System.out.println("hai hello");
    }

    void deposit(double balance) {
        if (balance > 0) {
            this.balance += balance;
        } else
            System.out.println("deposit amount should be > 0 ");
    }

    void withdraw(double balance)
    {
        if (balance<this.balance)
        {
            System.out.println("insuffient balance");
        }
        else
            balance-=this.balance;
    }

}
