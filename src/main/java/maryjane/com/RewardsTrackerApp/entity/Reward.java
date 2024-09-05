package maryjane.com.RewardsTrackerApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reward {

    @Id
    private Long customerId;
    private Long totalCashback;
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
