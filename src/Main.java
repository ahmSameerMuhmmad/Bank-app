import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name, password, balance to create an account");

        // create user
        String name=sc.next();
        String password=sc.next();
        double balance=sc.nextDouble();
        SBIUser user=new SBIUser(name,balance,password);

        // Creation of Account No.
        SBIUser acc1=new SBIUser(name,balance,password);
        System.out.println("The account No.of SBI Account is "+acc1.getAccountNo());


        //add amount
        String message=user.addMoney(1000);
        System.out.println(message);


        // withdraw Money
        System.out.println("Enter amount you want to withdraw");
        int money=sc.nextInt();
        System.out.println("Enter your password");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        // rate of Interest
        System.out.println("The interest for 10years on "+acc1.getBalance()+" Rs will be: "+user.calculateInterest(10));
        System.out.println("This is a change");

    }
}