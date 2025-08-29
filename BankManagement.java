// a datialed code for banking management system  in java

import java.util.*;

 class Person{
    long accNo ;
    String name;
    int age;
    String gender;
    void getPersonalDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Account Number; ");
        accNo = sc.nextInt();
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter your gender: ");
        gender = sc.next();

    }
}

class Account extends Person{
    String accType;
    double balance;

    void getAccountDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account type: ");
        accType = sc.next();
        System.out.println("Enter the initial balance: ");
        balance = sc.nextDouble();
    }

}

class ShowDetails extends Account{
    double annualInterest = 0.04;
    int transaction;
    
    void Withdraw(){
        System.out.println("Enter amt to withdraw: ");
        Scanner sc = new Scanner(System.in);
        transaction = sc.nextInt();
        if(transaction <= balance){
            balance -= transaction;
        }
        else{ System.out.println("Insufficient balance ");}
        
    }

    void Deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        transaction = sc.nextInt();
        balance +=transaction;
        System.out.println("Ammount deposited");
    }

    void annualInt(){
        balance = balance + (balance * annualInterest);
        System.out.println("Balance after interest: " +balance);
    }

    void DisplayDetails(){
        System.out.println("name of Account Holder is: "+ name);    
        System.out.println("age of Account Holder is: " + age);
        System.out.println("gender of Account Holder is: " + gender);
        System.out.println("Account Number  of Account Holder is: " + accNo);
        System.out.println("Account Type is: " + accType);
        System.out.println("Balance in account is: " + balance);
        
    }




}

public class BankManagement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ShowDetails sd = new ShowDetails();
        sd.getPersonalDetails();
        sd.getAccountDetails();
        sd.Withdraw();
        sd.Deposit();
        sd.annualInt();
        sd.DisplayDetails();
        sc.close();
    }
}
