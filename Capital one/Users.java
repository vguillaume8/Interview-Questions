import java.util.Scanner;

public class Users {

    static String name;
    int id;
    int balance;
    static int amount;
    static int finalbal;
    static Scanner sc = new Scanner(System.in);
    

    public Users(String newName, int newId, int newBalance) {
        
        name = newName;
        id = newId;
        balance = newBalance;
        
        finalbal = printValue(balance);
        printInfo(name, id, balance);
       
        
        if(balance > 10000) {
            System.out.println(name + " is rich!!");


        }
        else {
            System.out.println("Your balance is: " + printValue(balance));
            balance = balance + addMoney();
            System.out.println(name + " has a balance of: " + printValue(balance));
        }
   

    }
    
     static int addMoney() {
        System.out.println("How much money would you like to add to " + name + "'s balance?");
        int money = sc.nextInt();
        return money;

        
      
    }
    
    static void printInfo(String name, int id, int balance) {
         System.out.println(name + " has an id of: " + id + " and has a total balance of: " + balance);
    }

    static public int printValue(int _balance) {
        amount = amount + _balance;
        return amount;
    }

    static public void addUsers() {
         Users Vince = new Users("Vince", 323, 10000);
         Users Tom = new Users("Tom", 456, 20000);
         Users Kim = new Users("Kim", 878, 34000);

    }

    public static void main(String[] args) {
        addUsers();
        System.out.println("The total balance is: " + finalbal );
      
    
       // System.out.println(addUsers.Vince);
    
    
    }
}