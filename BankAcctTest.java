/*
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  Teo Espero
  BS Cloud and Systems Administration
  BS Software Development
  Western Governors University
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
*/
package com.teoespero;

/* declare our import for inputs */
import java.util.Scanner;

//  class to test out the bank acct class
class BankAcctTest {

    /**
     * main program
     */
    public static void main(String[] args){

        /* class declaration */
        BankAcct bdoAcct = new BankAcct(9222022,"Teo Espero",
                472000.00, "teodulfo.espero@gmail.com",1234567);
        boolean again = true;

        while (again){
            showBankHeader();
            showAcctInfo(bdoAcct);
            showBalance(bdoAcct);
            showFooter();

            processTransaction(bdoAcct);
            again = runAgain();
        }
        System.out.println("GOOD BYE!!!");


    }

    /**
     * ask if there are other transactions
     */
    private static boolean runAgain() {
        System.out.println("--------------------------------------------");
        System.out.println("1 - Another transaction");
        System.out.println("2 - Exit");

        /* what do you want to do */
        System.out.print(": ");
        Scanner runMore = new Scanner(System.in);
        int again = runMore.nextInt();

        /* validate choice */
        return again == 1;
    }

    /**
     * determine the type of transaction that the customer chose
     */
    private static void processTransaction(BankAcct bankObj) {
        int transaction;
        transaction = showMenu();

        /* withdrawal */
        if (transaction == 1) makeAWithdrawal(bankObj);

        /* deposit */
        else if (transaction == 2) makeADeposit(bankObj);

        /* balance */
        else if (transaction == 3)
            balInquiry(bankObj);

        /* invalid choice */
        else System.out.println("Invalid choice.");
    }

    /**
     * show the current balance
     */
    private static void balInquiry(BankAcct bankObj) {
        System.out.println("Current balance. ");
        System.out.println(bankObj.getBalance());
    }

    /**
     * take out money from the acct
     */
    private static void makeAWithdrawal(BankAcct bankObj) {

        /* show the user what mode we are in */
        System.out.println("--------------------------------------------");
        System.out.println("WITHDRAWAL");
        System.out.println();

        /* show the current balance before the withdrawal */
        System.out.println("Current ");
        showBalance(bankObj);

        /* ask how much is to be withdrawn from the account */
        Scanner withdrawAmount = new Scanner(System.in);
        System.out.print("Amount to withdraw: ");
        double wthAmount = withdrawAmount.nextDouble();

        /* call the method for deducting money */
        bankObj.withdrawAction(wthAmount);

        /* show the current balance after the withdrawal */
        System.out.println("New ");
        showBalance(bankObj);
        System.out.println("--------------------------------------------");
    }

    /**
     * add money to the account
     */
    private static void makeADeposit(BankAcct bankObj) {

        /* show the user what mode we are in */
        System.out.println("--------------------------------------------");
        System.out.println("DEPOSIT");
        System.out.println();

        /* show the current balance before the deposit */
        System.out.print("Current ");
        showBalance(bankObj);

        /* ask how much is to be deposited from the account */
        Scanner depAmount = new Scanner(System.in);
        System.out.print("Amount to deposit: ");
        double depositAmount = depAmount.nextDouble();

        /* call the method for adding money */
        bankObj.depositAction(depositAmount);

        /* show the current balance after the deposit */
        System.out.print("New  ");
        showBalance(bankObj);
        System.out.println("--------------------------------------------");
    }

    /**
     * show the acct holder what transactions are available
     */
    private static int showMenu() {
        System.out.println("Choose a transaction");
        System.out.println("--------------------------------------------");
        System.out.println("1 -> Withdrawal");
        System.out.println("2 -> Deposit");
        System.out.println("3 -> Balance Inquiry");
        System.out.print(": ");

        /* define an input object to accept transaction type */
        Scanner myChoice = new Scanner(System.in);
        return myChoice.nextInt();
    }

    /**
     * print header info
     */
    private static void showFooter() {
        System.out.println("N O T H I G  F O L L O W S");
        System.out.println("--------------------------------------------");
        System.out.println();
    }

    /**
     * display the acct holder's info
     */
    private static void showAcctInfo(BankAcct acctObj) {
        System.out.println("Acct No. " + acctObj.getBankAcctNum());
        System.out.println("Acct Name. " + acctObj.getCustomerName());
        System.out.println("Email address. " + acctObj.getEmailAddress());
        System.out.println("Phone. " + acctObj.getPhoneNumber());
    }

    /**
     * show the bank's name
     */
    private static void showBankHeader() {
        System.out.println("ESPERO BANK");
        System.out.println("--------------------------------------------");
    }

    /**
     * show the account's balance
     */
    private static void showBalance(BankAcct acctObj) {
        System.out.println("Balance. " + acctObj.getBalance());
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////