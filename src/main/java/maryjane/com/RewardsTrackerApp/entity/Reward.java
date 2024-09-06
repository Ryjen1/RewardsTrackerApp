package maryjane.com.RewardsTrackerApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Reward {

    @Id
    @NotNull(message = "Must not be null")
    @Column(unique = true)
    private Long customerId;
    @NotNull(message = "Must not be null")
    private Long totalCashback;
    @NotNull(message = "Must not be null")
    private Long currentBalance;

    public Reward() {}

    public Reward(Long customerId, Long totalCashback, Long currentBalance) {
        this.customerId = customerId;
        this.totalCashback = totalCashback;
        this.currentBalance = currentBalance;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getTotalCashback() {
        return totalCashback;
    }

    public void setTotalCashback(Long totalCashback) {
        this.totalCashback = totalCashback;
    }

    public Long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Long currentBalance) {
        this.currentBalance = currentBalance;
    }
}
