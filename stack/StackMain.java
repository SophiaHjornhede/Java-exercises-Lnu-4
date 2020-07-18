package stack;

import bankAccount.BankAccount;

/**
 * Assignment-4, exercise-2
 *
 * @author Sophia Hjörnhede
 * @version 1.10 11 July 2020
 */

public class StackMain {

    public static void main(String[] args) {
        // creating StackImpl object
        StackImpl test = new StackImpl();
        // Testing methods
        System.out.println("Size: " + test.size());
        System.out.println("Is empty " + test.isEmpty());
        // Creating bank accounts
        BankAccount bankAccount1 = new BankAccount("Test1", 11111);
        BankAccount bankAccount2 = new BankAccount("Test2", 2222);
        BankAccount bankAccount3 = new BankAccount("Test3", 3333);
        BankAccount bankAccount4 = new BankAccount("Test4", 4444);
        BankAccount bankAccount5 = new BankAccount("Test5", 5555);
        // Adding account to array
        test.push(bankAccount1);
        System.out.println("Is empty " + test.isEmpty());
        System.out.println("Size: " + test.size());
        // test.push(bankAccount1);
        System.out.println("Size: " + test.size());
        System.out.println("Is empty " + test.isEmpty());
        test.push(bankAccount2);
         test.push(bankAccount3);
         test.push(bankAccount4);
         test.push(bankAccount5);
        // Checking amount of accounts
        System.out.println("Size: " + test.size());
        // Checking peek method
        System.out.println("Peek: BankId " + test.peek().getAccNo() + " and balance: " + test.peek().getBalance());
        // Removing account from array
        System.out.println("Pop: BankId " + test.pop().getAccNo());
        System.out.println("Size: " + test.size());
        System.out.println("Pop: BankId " + test.pop().getAccNo());
        System.out.println("Size: " + test.size());
        System.out.println("Pop: BankId " + test.pop().getAccNo());
        System.out.println("Size: " + test.size());

    }


}



