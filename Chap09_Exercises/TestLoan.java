////////////////////////////////////////////////////////////////////////////////////////////////////
//  TestLoan.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description:
//          Demonstrate the use of objects and methods in Java
//  Date: 08/08/2022
////////////////////////////////////////////////////////////////////////////////////////////////////

// define the packages we need
import java.text.DecimalFormat;
import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args){

        //  create input object
        Scanner input = new Scanner(System.in);

        //  enter the loan amount
        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        //  enter the interest rate
        System.out.print("Enter interest rate: ");
        double interestRate = input.nextDouble();

        //  enter number of years
        System.out.print("Enter number of years: ");
        double loanYear = input.nextDouble();

        //  create a new oan object
        Loan personalLoan = new Loan(interestRate, loanYear, loanAmount);

        //  display the loan information
        System.out.println("======================================================");

        // format our outout
        DecimalFormat ft = new DecimalFormat( "$ ###,###.##"  ) ;
        System.out.println("Loan date: " + personalLoan.getLoanDate());
        System.out.println("Loan amount: " + ft.format(personalLoan.getLoanAmount()));
        System.out.println("Interest rate: " + personalLoan.getAnnualInterestrate());
        System.out.println("Monthly payment: " + ft.format(personalLoan.getMonthlyPayment()));
        System.out.println("Total amount due: " + ft.format(personalLoan.getTotalPayment()));
        System.out.println("======================================================");
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////