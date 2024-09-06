package maryjane.com.RewardsTrackerApp.service;

import maryjane.com.RewardsTrackerApp.entity.RewardHistory;
import maryjane.com.RewardsTrackerApp.repository.RewardHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardHistoryService {

    @Autowired
    private RewardHistoryRepository rewardHistoryRepository;

    public List<RewardHistory> getRewardHistoryByCustomerId(Long customerId) {
        return rewardHistoryRepository.findByCustomerId(customerId);
    }

    public RewardHistory saveRewardHistory(RewardHistory rewardHistory) {
        if (rewardHistoryRepository.existsByTransactionId(rewardHistory.getTransactionId())) {
            throw new RuntimeException("Transaction ID already exists.");
        }
        return rewardHistoryRepository.save(rewardHistory);
    }
}
