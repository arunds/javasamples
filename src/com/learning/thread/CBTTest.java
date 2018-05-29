package com.learning.thread;

import java.math.BigDecimal;


public class CBTTest {

    public static void main(String[] args) {
        
        InstallmentCalcInputVO inputVO = new  InstallmentCalcInputVO();
        BigDecimal remainingLoanAmount = new BigDecimal(110000);//MLM.RemainingLoanAmt
        //double periodicalPrincialRepaymentAmt = 0;//MLM.periodical prpl repy amt
        //remainingLoanAmount = remainingLoanAmount - periodicalPrincialRepaymentAmt;
        inputVO.setRemainingLoanBalance(remainingLoanAmount);
        
        inputVO.setNewInterest(3.7);//intwithsurchargesanddiscount-fromprolongation interest
        inputVO.setRepaymentFreq(3);//MLM.INT PAYMENT FREQ
        
        
        //Loan End dt::2027-10-31
        //modFile start date LB::2009-09-30
        int numOfMonths = 217;
        
        
        //int nt = 72;
        int nt = numOfMonths / inputVO.getRepaymentFreq();
        System.out.println("nt : "+nt);
        
        final double interestFactor = inputVO.getNewInterest() / (1200 / inputVO.getRepaymentFreq());
        
        System.out.println(" Int Factor : "+ interestFactor);
        
        final double annuityFactor = interestFactor / (1 - Math.pow((1 + interestFactor), -nt));
        
        System.out.println(" Annuity Factor : "+ annuityFactor);
        
        
        final BigDecimal monAnuity = inputVO.getRemainingLoanBalance().multiply(new BigDecimal(annuityFactor));
        
        System.out.println("Annuity AMt : "+monAnuity.setScale(2, BigDecimal.ROUND_UP));
        
       // System.out.println((0.009250000000000001/71.990749999999999999)*110000);
        
    }

}
