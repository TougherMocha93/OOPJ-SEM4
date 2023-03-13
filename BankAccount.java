package JavaCourseAKS;


import java.util.Scanner;

class Account{
    String name;
    int ACno;
    double bal = 0.0;

    int getAC(){
        return ACno;
    }

    String getName(){
        return name;
    }

    double chkbal(){
        return bal;
    }

    double credit(double amt){
        return bal += amt;
    }

    double debit(double amt){
        return bal -= amt;
    }
}


public class BankAccount{

    public void newaccount(String a){
        Account a = new Account();
    }

    public static void main(String[] args) throws Exception{
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter account username: ");
            String n = in.next();
            Account n = new Account();

            System.out.println("Select Function:\n\n1) Check Balance\n2)Check Account Username\n3)Deposit\n4)Withdraw\n\nEnter your choice: ");
            int op = in.nextInt();
            switch (op){
                case 1: n.chkbal();break;
                case 2: n.getName();break;
                case 3: n.credit(in.nextInt());break;
                case 4: n.debit(in.nextInt());break;
                default:
                    System.out.println("Invalid input!");
            }

        }
    }

}
