package maryjane.com.RewardsTrackerApp.dto;

public class RewardBalance {

    private Long totalCashback;
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
