package maryjane.com.RewardsTrackerApp.dto;

import java.util.Date;

public class RewardHistory {
    private Long transactionId;
    private Date transactionDate;
    private double amountEarned;
    private String description;

    public RewardHistory(Long transactionId, Date transactionDate, double amountEarned, String description) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.amountEarned = amountEarned;
        this.description = description;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmountEarned() {
        return amountEarned;
    }

    public void setAmountEarned(double amountEarned) {
        this.amountEarned = amountEarned;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
