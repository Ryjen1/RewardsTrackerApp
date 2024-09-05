package maryjane.com.RewardsTrackerApp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class RewardHistory {

    @Id
    private Long transactionId;
    private Long customerId;
    private LocalDate transactionDate;
    private double amountEarned;
    private String description;

    public RewardHistory() {}

    public RewardHistory(Long transactionId, Long customerId, LocalDate transactionDate, double amountEarned, String description) {
        this.transactionId = transactionId;
        this.customerId = customerId;
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

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
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
