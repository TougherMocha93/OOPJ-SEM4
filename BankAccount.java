package JavaCourseAKS;

class Account{
    double bal = 0.0;
    int ACno;

    void deposit(double amt){
        bal += amt;
    }

    void withdraw(double amt){
        bal -= amt;
    }
}
public class BankAccount {

    int a;

    Account acc = new Account();
    public static void main(String[] args) {
    }
}