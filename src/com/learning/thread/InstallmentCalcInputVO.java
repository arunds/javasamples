package com.learning.thread;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Input VO for the installment calculation.
 * 
 * @author BilendranM
 */
public class InstallmentCalcInputVO {

    /** The loan repayment amount. */
    private BigDecimal loanRepaymentAmount = null;

    /** The annuity amount. */
    private BigDecimal annuityAmount = null;

    /** The current interest. */
    private float currentInterest = 0;

    /** The new interest. */
    private double newInterest = 0;

    /** The remaining loan balance. */
    private BigDecimal remainingLoanBalance = null;

    /** The loan id. */
    private String loanId = null;

    /** The modification file id. */
    private String modificationFileId = null;

    /** The current product type. */
    private String currentProductType = null;

    /** The new product type. */
    private String newProductType = null;

    /** The loan end date. */
    private Date loanEndDate = null;

    /** The modification file creation date. */
    private Date modificationFileCreationDate = null;

    /** The modification file start date lb. */
    private Date modificationFileStartDateLB = null;

    /** The first repayment date. */
    private Date firstRepaymentDate = null;

    /** The repayment freq. */
    private int repaymentFreq = 0;

    /**
     * Gets the annuity amount.
     * 
     * @return the annuityAmount
     */
    public BigDecimal getAnnuityAmount() {
        return this.annuityAmount;
    }

    /**
     * Sets the annuity amount.
     * 
     * @param annuityAmount the annuityAmount to set
     */
    public void setAnnuityAmount(final BigDecimal annuityAmount) {
        this.annuityAmount = annuityAmount;
    }

    /**
     * Gets the current interest.
     * 
     * @return the currentInterest
     */
    public float getCurrentInterest() {
        return this.currentInterest;
    }

    /**
     * Sets the current interest.
     * 
     * @param currentInterest the currentInterest to set
     */
    public void setCurrentInterest(final float currentInterest) {
        this.currentInterest = currentInterest;
    }

    /**
     * Gets the first repayment date.
     * 
     * @return the firstRepaymentDate
     */
    public Date getFirstRepaymentDate() {
        return this.firstRepaymentDate;
    }

    /**
     * Sets the first repayment date.
     * 
     * @param firstRepaymentDate the firstRepaymentDate to set
     */
    public void setFirstRepaymentDate(final Date firstRepaymentDate) {
        this.firstRepaymentDate = firstRepaymentDate;
    }

    /**
     * Gets the loan end date.
     * 
     * @return the loanEndDate
     */
    public Date getLoanEndDate() {
        return this.loanEndDate;
    }

    /**
     * Sets the loan end date.
     * 
     * @param loanEndDate the loanEndDate to set
     */
    public void setLoanEndDate(final Date loanEndDate) {
        this.loanEndDate = loanEndDate;
    }

    /**
     * Gets the loan id.
     * 
     * @return the loanId
     */
    public String getLoanId() {
        return this.loanId;
    }

    /**
     * Sets the loan id.
     * 
     * @param loanId the loanId to set
     */
    public void setLoanId(final String loanId) {
        this.loanId = loanId;
    }

    /**
     * Gets the loan repayment amount.
     * 
     * @return the loanRepaymentAmount
     */
    public BigDecimal getLoanRepaymentAmount() {
        return this.loanRepaymentAmount;
    }

    /**
     * Sets the loan repayment amount.
     * 
     * @param loanRepaymentAmount the loanRepaymentAmount to set
     */
    public void setLoanRepaymentAmount(final BigDecimal loanRepaymentAmount) {
        this.loanRepaymentAmount = loanRepaymentAmount;
    }

    /**
     * Gets the modification file creation date.
     * 
     * @return the modificationFileCreationDate
     */
    public Date getModificationFileCreationDate() {
        return this.modificationFileCreationDate;
    }

    /**
     * Sets the modification file creation date.
     * 
     * @param modificationFileCreationDate the modificationFileCreationDate to
     *            set
     */
    public void setModificationFileCreationDate(final Date modificationFileCreationDate) {
        this.modificationFileCreationDate = modificationFileCreationDate;
    }

    /**
     * Gets the modification file id.
     * 
     * @return the modificationFileId
     */
    public String getModificationFileId() {
        return this.modificationFileId;
    }

    /**
     * Sets the modification file id.
     * 
     * @param modificationFileId the modificationFileId to set
     */
    public void setModificationFileId(final String modificationFileId) {
        this.modificationFileId = modificationFileId;
    }

    /**
     * Gets the modification file start date lb.
     * 
     * @return the modificationFileStartDateLB
     */
    public Date getModificationFileStartDateLB() {
        return this.modificationFileStartDateLB;
    }

    /**
     * Sets the modification file start date lb.
     * 
     * @param modificationFileStartDateLB the modificationFileStartDateLB to set
     */
    public void setModificationFileStartDateLB(final Date modificationFileStartDateLB) {
        this.modificationFileStartDateLB = modificationFileStartDateLB;
    }

    /**
     * Gets the new interest.
     * 
     * @return the newInterest
     */
    public double getNewInterest() {
        return this.newInterest;
    }

    /**
     * Sets the new interest.
     * 
     * @param newInterest the newInterest to set
     */
    public void setNewInterest(final double newInterest) {
        this.newInterest = newInterest;
    }

    /**
     * Gets the new product type.
     * 
     * @return the newProductType
     */
    public String getNewProductType() {
        return this.newProductType;
    }

    /**
     * Sets the new product type.
     * 
     * @param newProductType the newProductType to set
     */
    public void setNewProductType(final String newProductType) {
        this.newProductType = newProductType;
    }

    /**
     * Gets the current product type.
     * 
     * @return the currentProductType
     */
    public String getCurrentProductType() {
        return this.currentProductType;
    }

    /**
     * Sets the current product type.
     * 
     * @param currentProductType the currentProductType to set
     */
    public void setCurrentProductType(final String currentProductType) {
        this.currentProductType = currentProductType;
    }

    /**
     * Gets the remaining loan balance.
     * 
     * @return the remainingLoanBalance
     */
    public BigDecimal getRemainingLoanBalance() {
        return this.remainingLoanBalance;
    }

    /**
     * Sets the remaining loan balance.
     * 
     * @param remainingLoanBalance the remainingLoanBalance to set
     */
    public void setRemainingLoanBalance(final BigDecimal remainingLoanBalance) {
        this.remainingLoanBalance = remainingLoanBalance;
    }

    /**
     * Gets the repayment freq.
     * 
     * @return the repaymentFreq
     */
    public int getRepaymentFreq() {
        return this.repaymentFreq;
    }

    /**
     * Sets the repayment freq.
     * 
     * @param repaymentFreq the repaymentFreq to set
     */
    public void setRepaymentFreq(final int repaymentFreq) {
        this.repaymentFreq = repaymentFreq;
    }

}
