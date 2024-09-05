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
        return rewardHistoryRepository.findAll();  // Add your filtering logic here
    }

    public RewardHistory saveRewardHistory(RewardHistory rewardHistory) {
        return rewardHistoryRepository.save(rewardHistory);
    }
}
