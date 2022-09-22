/*
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  Teo Espero
  BS Cloud and Systems Administration
  BS Software Development
  Western Governors University
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
*/

package com.teoespero;


/*
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  BankAcct Class Definition
*/

import org.jetbrains.annotations.Contract;

public class BankAcct {

    /**
     * field declarations for the bank account
     * these will contain the basic information that will be stored by the bank
     */
    private int bankAcctNum;
    private String customerName;
    private double balance;
    private String emailAddress;
    private int phoneNumber;

    /**
     * class constructor w/o any parameters
     */
    public BankAcct() {
    }

    /**
     * class constructor with parameters passed in
     */
    public BankAcct(int bankAcctNum, String customerName, double balance, String emailAddress, int phoneNumber) {
        this.bankAcctNum = bankAcctNum;
        this.customerName = customerName;
        this.balance = balance;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    /**
     * getter/setter definitions
     */
    public int getBankAcctNum() {
        return bankAcctNum;
    }

    public void setBankAcctNum(int bankAcctNum) {
        this.bankAcctNum = bankAcctNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * methods for deposits/withdrawals
     */
    public void withdrawAction(double amountToWithdraw){
        if (!insufficientFunds(amountToWithdraw))
            balance = balance - amountToWithdraw;
        else
            System.out.println("Not enough funds available");
    }

    public void depositAction(double amountToDeposit){
       if (validDepositAmount(amountToDeposit))
            balance = balance + amountToDeposit;
    }

    /**
     * check if the account has enough funds for the withdrawal
     */
    public boolean insufficientFunds(double amountToWithdraw){
        if (balance < amountToWithdraw)
            return true;
        else
            return false;
    }

    /**
     * you can only deposit > 0 amounts
     */
    public boolean validDepositAmount(double amountToDeposit){
        if (amountToDeposit > 0)
            return true;
        else
            return false;
    }
}
