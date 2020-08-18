package stack;

import bankAccount.BankAccount;

/**
 * Assignment-4, exercise-2, main class
 *
 * @author Sophia Hjörnhede
 * @version 1.11 10 Aug 2020
 */

public class StackMain {

    public static void main(String[] args) {
        // creating StackImpl object
        StackImpl test = new StackImpl();
        // Creating bank accounts
        BankAccount bankAccount1 = new BankAccount("Test1", 11111);
        BankAccount bankAccount2 = new BankAccount("Test2", 2222);
        BankAccount bankAccount3 = new BankAccount("Test3", 3333);
        // Adding account to array
        test.push(bankAccount1);
        System.out.println("  ");
        System.out.println("This is a stack with one account.");
        System.out.println("Is the stack empty? " + test.isEmpty());
        System.out.println("This stack size is: " + test.size());
        test.push(bankAccount2);
        test.push(bankAccount3);
        // Checking amount of accounts
        System.out.println("  ");
        System.out.println("This is a stack with a few accounts.");
        System.out.println("Is the stack empty? " + test.isEmpty());
        System.out.println("The stack size is : " + test.size());
        // Checking peek method
        System.out.println("  ");
        System.out.println("This latest added account is: " + test.peek().getAccNo() + ", and the account balance is: " + test.peek().getBalance());
        // Checking the pop method, removing account from array
        System.out.println("  ");
        System.out.println(test.pop().getAccNo());
        System.out.println("The current stack size is: " + test.size());
        // Testing methods
        System.out.println("  ");
        System.out.println("This is a test of an empty stack:");
        System.out.println(test.pop().getAccNo());
        System.out.println(test.pop().getAccNo());
        System.out.println("The stack size is: " + test.size());
        System.out.println("Is the stack empty? " + test.isEmpty());
        // Checking peek method in an empty array
        System.out.println("  ");
        System.out.println("This latest added account is: " + test.peek().getAccNo() + ", and the account balance is: " + test.peek().getBalance());
        // Checking the pop method in en empty array
        System.out.println("  ");
        System.out.println(test.pop().getAccNo());
        System.out.println("The current stack size is: " + test.size());
    }
}



