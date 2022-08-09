////////////////////////////////////////////////////////////////////////////////////////////////////
//  Loan.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description:
//          This is where the Loan is defined
//  Date: 08/08/2022
////////////////////////////////////////////////////////////////////////////////////////////////////

public class Loan{
    private double annualInterestrate;
    private double numOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    // constructor no parameters
    public Loan(){
        this(2.5, 1, 1000);
    }

    // constructor/setter
    public Loan(double annualInterestrate, double numOfYears, double loanAmount){
        this.annualInterestrate = annualInterestrate;
        this.numOfYears = numOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    // getter
    public double getAnnualInterestrate() {
        return annualInterestrate;
    }

    public void setAnnualInterestrate(double annualInterestrate){
        this.annualInterestrate = annualInterestrate;
    }

    public double getNumOfYears(){
        return numOfYears;
    }

    public void setNumOfYears(double numOfYears){
        this.numOfYears = numOfYears;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount =loanAmount;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestrate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate
                / (1 - (1 / Math.pow(1 + monthlyInterestRate, numOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numOfYears * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate(){
        return loanDate;
    }
}
