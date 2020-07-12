package bankAccount;

/**
 * Assignment-4, exercise-1
 *
 * @author Sophia Hjörnhede
 * @version 1.10 11 July 2020
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankAccount {

    public static void main(String[] args) {
        System.out.println("Welcome to the Bank of Students, by the Students, for the Students!");
        System.out.println(" ");
        IDinput();
    }

    //method of the IDinput
    private static void IDinput() {
        String ID;
        String reg1 = "^[A-Za-z][0-9]{3}+$"; //regex to fix the ID format
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter customer ID: ");
            ID = s.nextLine();
            Pattern p = Pattern.compile(reg1);
            Matcher m = p.matcher(ID);
            if(m.find()){
                accountNo();
                return;
            };
        } catch (Exception e) {
        }
        System.out.println("Incorrect Customer ID. The Customer ID must start with a letter followed by three digits.");
        System.out.println("Input Again. ");
        IDinput();
    }

    //method of the accountNo
    private static void accountNo() {
        String accNo;
        String reg2 = "^[0-9]{7}$"; //regex to fix the account format
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter account no: ");
            accNo = s.nextLine();
            Pattern p = Pattern.compile(reg2);
            Matcher m = p.matcher(accNo);
            if(m.find()){
                balanceInput();
                return;
            }
        } catch (Exception e) {
        }
        System.out.println("The Account number must be of seven digits.");
        System.out.println("Input Again. ");
        accountNo();
    }

    //method of the balanceInput
    private static void balanceInput(){
        int balance;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter balance: ");
        balance = s.nextInt();
        try {
            if(balance>999){
                System.out.println("Congratulations, your account has been create successfully! ");
                return;
            };
        } catch (Exception e) {
        }
        System.out.println("Initial balance must be equal to or higher than 1000.");
        System.out.println("Input Again. ");
        balanceInput();
        }
    }


