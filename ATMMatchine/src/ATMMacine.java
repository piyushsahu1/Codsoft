package ATMMachine;


import java.util.Scanner;

class ATM{
    float Balance;
    int PIN=1234;

    public void checkpin(){
        System.out.println("enter your pin");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if(enterpin== PIN){
            manu();
        }
        else{
            System.out.println("enter a valid pin");
            checkpin();
        }
    }
    public void manu(){
        System.out.println("enter your choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if (opt == 2){
            withdrawMoney();
        }
        else if (opt == 3) {
            depositMoney();
        }
        else if (opt == 4){
            return;
        }
        else {
            System.out.println("enter a valid choice");
        }
    }

    public void checkBalance(){
        System.out.println("Balance"+ Balance);
        manu();
    }

    public void withdrawMoney(){
        System.out.println("enter amount");
        Scanner sc = new Scanner(System.in);
        float amount =sc.nextFloat();
        if(amount>Balance){
            System.out.println("insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Amount withdraw succefully");
        }
        manu();
    }
    public void depositMoney(){
        System.out.println("Enter the Amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance= Balance + amount;
        System.out.println("Money Deposit Succefully");
        manu();
    }
}




public class ATMMacine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}