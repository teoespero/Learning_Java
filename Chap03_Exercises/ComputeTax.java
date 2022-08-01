////////////////////////////////////////////////////////////////////////////////////////////////////
//  ComputeTax.java
//  Author: Teo Espero
//          BS Cloud and System Administration
//          BS Software Development
//          Western Governors University
//  Description:
//          The U.S. federal personal income tax is calculated based on filing status and
//          taxable income. There are four filing statuses: single filers, married filing
//          jointly or qualified widow(er), married filing separately, and head of household.
//          The tax rates vary every year.
//
//          2009 U.S. Federal Personal Tax Rates
//          ------------------------------------------------------------------------------------
//          Marginal
//          Tax Rate
//          (%)       Single             Married/Joint      Married Separate        HOH
//          10        0-8350             0-16700            0-8350                  0-11950
//          15        8351-33950         16701-67900        8351-33950              11951-4500
//          25        33951-82250        67901-137050       33951-68525             45501-117450
//          28        82251-171550       137051-208850      68526-104425            117451-190200
//          33        171551-372950      208851-372950      104426-186475           190201-372950
//          35        372951+            972951+            186476+                 372951+
//  Date: 07292022
////////////////////////////////////////////////////////////////////////////////////////////////////

// define the packages we need
import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {

        // declare main vars
        String taxType = "";
        double incomeTax = 0.00;

        // get user's filing status
        System.out.println("Choose filing status below:");
        System.out.println("\t0-Single");
        System.out.println("\t1-Married/Joint");
        System.out.println("\t2-Married Separate");
        System.out.println("\t3-Head of household");
        System.out.print("> ");
        Scanner input = new Scanner(System.in);
        int filingStatus = input.nextInt();

        // get user's income
        System.out.print("Enter annual taxable income: ");
        double income = input.nextDouble();

        // determine filing status type and income tax

        //////////////////////////////////////////////////////////
        // SINGLE FILER
        if (filingStatus < 0){
            System.out.println("Invalid filing status choice...");
        } else if (filingStatus == 0) {
            taxType = "Single";
            income = 12550;
            if (income <= 8350){
                incomeTax = income * 0.10;
            } else if (income <= 33950) {
                incomeTax = (8350 * 0.10) +
                        ((income - 8350) * 0.15);
            } else if (income <= 82250) {
                incomeTax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((income - 33950) * 0.25);
            } else if (income <= 171550) {
                incomeTax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((82250 - 33950) * 0.25) +
                        ((income - 82250) * 0.28);
            } else if (income <= 372950) {
                incomeTax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((82250 - 33950) * 0.25) +
                        ((171550 - 82250) * 0.28) +
                        ((income - 372950) * 0.33);
            }else {
                incomeTax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((82250 - 33950) * 0.25) +
                        ((171550 - 82250) * 0.28) +
                        ((372950 - 171550) * 0.33) +
                        ((income - 372950) * 0.35);
            }

        //////////////////////////////////////////////////////////
        // MARRIED/JOINT FILER
        } else if (filingStatus == 1) {
            taxType = "Married/Joint";
            if (income <= 16700){
                incomeTax = income * 0.10;
            } else if (income <= 67900) {
                incomeTax = (16700 * 0.10) +
                        ((income - 16700) * 0.15);
            } else if (income <= 137050) {
                incomeTax = (16700 * 0.10) +
                        ((67900 - 16700) * 0.15) +
                        ((income - 67900) * 0.25);
            } else if (income <= 208850) {
                incomeTax = (16700 * 0.10) +
                        ((67900 - 16700) * 0.15) +
                        ((137050 - 67900) * 0.25) +
                        ((income - 137050) * 0.28);
            } else if (income <= 372950) {
                incomeTax = (16700 * 0.10) +
                        ((67900 - 16700) * 0.15) +
                        ((137050 - 67900) * 0.25) +
                        ((372950 - 208850) * 0.28) +
                        ((income - 372950) * 0.33);
            }else {
                incomeTax = (16700 * 0.10) +
                        ((67900 - 16700) * 0.15) +
                        ((137050 - 67900) * 0.25) +
                        ((208850 - 137050) * 0.28) +
                        ((372950 - 208850) * 0.33) +
                        ((income - 372950) * 0.35);
            }

        //////////////////////////////////////////////////////////
        // MARRIED FILING SEPARATELY
        } else if (filingStatus == 2) {
            taxType = "Married Filing Separately";
            if (income <= 8350){
                incomeTax = income * 0.10;
            } else if (income <= 33950) {
                incomeTax = (8350 * 0.10) +
                        ((income - 8350) * 0.15);
            } else if (income <= 68525) {
                incomeTax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((income - 33950) * 0.25);
            } else if (income <= 104425) {
                incomeTax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((68525 - 33950) * 0.25) +
                        ((income - 68525) * 0.28);
            } else if (income <= 186475) {
                incomeTax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((68525 - 33950) * 0.25) +
                        ((104425 - 68525) * 0.28) +
                        ((income - 104425) * 0.33);
            }else {
                incomeTax = (8350 * 0.10) +
                        ((33950 - 8350) * 0.15) +
                        ((68525 - 33950) * 0.25) +
                        ((104425 - 68525) * 0.28) +
                        ((186476 - 104425) * 0.33) +
                        ((income - 186476) * 0.35);
            }

        //////////////////////////////////////////////////////////
        // MARRIED FILING SEPARATELY
        } else if (filingStatus == 3) {
            taxType = "Head of Household";
            if (income <= 11950){
                incomeTax = income * 0.10;
            } else if (income <= 45500) {
                incomeTax = (11950 * 0.10) +
                        ((income - 11950) * 0.15);
            } else if (income <= 117450) {
                incomeTax = (11950 * 0.10) +
                        ((45500 - 11950) * 0.15) +
                        ((income - 45500) * 0.25);
            } else if (income <= 190200) {
                incomeTax = (11950 * 0.10) +
                        ((45500 - 11950) * 0.15) +
                        ((117450 - 45500) * 0.25) +
                        ((income - 117450) * 0.28);
            } else if (income <= 372950) {
                incomeTax = (11950 * 0.10) +
                        ((45500 - 11950) * 0.15) +
                        ((117450 - 45500) * 0.25) +
                        ((190200 - 117450) * 0.28) +
                        ((income - 190200) * 0.33);
            }else {
                incomeTax = (11950 * 0.10) +
                        ((45500 - 11950) * 0.15) +
                        ((117450 - 45500) * 0.25) +
                        ((190200 - 117450) * 0.28) +
                        ((372950 - 190200) * 0.33) +
                        ((income - 372950) * 0.35);
            }
        }

        System.out.println("========================================");
        System.out.println("Filing Status: " + taxType);
        System.out.println("Income tax: " + incomeTax);
        System.out.println("========================================");
    }
}
