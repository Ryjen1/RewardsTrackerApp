package maryjane.com.RewardsTrackerApp.dto;

import jakarta.validation.constraints.NotNull;

public class RewardBalance {
    @NotNull(message = "Total cashback must not be null")
    private Long totalCashback;
    @NotNull(message = "Balance must not be null")
    private Long currentBalance;

    public RewardBalance(Long totalCashback, Long currentBalance) {
        this.totalCashback = totalCashback;
        this.currentBalance = currentBalance;
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
