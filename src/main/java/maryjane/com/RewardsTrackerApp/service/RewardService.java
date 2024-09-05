package maryjane.com.RewardsTrackerApp.service;

import maryjane.com.RewardsTrackerApp.dto.RewardBalance;
import maryjane.com.RewardsTrackerApp.entity.Reward;
import maryjane.com.RewardsTrackerApp.repository.RewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RewardService {

    @Autowired
    private RewardRepository rewardRepository;

    // Get Reward Balance
    public RewardBalance getRewardByCustomerId(Long customerId) {
        Reward reward = rewardRepository.findByCustomerId(customerId);
        if (reward != null) {
            return new RewardBalance(
                    reward.getTotalCashback(),
                    reward.getCurrentBalance()
            );
        }
        return null; // Handle as necessary
    }

    // Create or Update Reward
    public Reward saveOrUpdateReward(Reward reward) {
        return rewardRepository.save(reward);
    }
}
