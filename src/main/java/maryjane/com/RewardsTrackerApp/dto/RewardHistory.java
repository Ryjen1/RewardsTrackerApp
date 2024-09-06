package maryjane.com.RewardsTrackerApp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public class RewardHistory {

    @NotNull(message = "Transaction ID must not be null")
    private Long transactionId;
    @NotNull(message = "Customer ID must not be null")
    private Long customerId;
    @NotNull(message = "Transaction date must not be null")
    private LocalDate transactionDate;
    @NotNull(message = "Amount earned must not be null")
    private Double amountEarned;
    @NotEmpty(message = "Description must not be empty")
    private String description;

    public RewardHistory(Long transactionId, Long customerId, LocalDate transactionDate, Double amountEarned, String description) {
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

    public Double getAmountEarned() {
        return amountEarned;
    }

    public void setAmountEarned(Double amountEarned) {
        this.amountEarned = amountEarned;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
