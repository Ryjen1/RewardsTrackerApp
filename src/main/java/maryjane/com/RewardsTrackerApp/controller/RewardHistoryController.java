package maryjane.com.RewardsTrackerApp.controller;

import maryjane.com.RewardsTrackerApp.entity.RewardHistory;
import maryjane.com.RewardsTrackerApp.service.RewardHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rewards")
public class RewardHistoryController {

    @Autowired
    private RewardHistoryService rewardHistoryService;

    // Get Cashback History by Customer ID (using Path Variable)
    @GetMapping("/history/{customerId}")
    public List<RewardHistory> getRewardHistory(@PathVariable Long customerId) {
        return rewardHistoryService.getRewardHistoryByCustomerId(customerId);
    }

    // Post new Reward History
    @PostMapping("/post_history")
    public RewardHistory addRewardHistory(@RequestBody RewardHistory rewardHistory) {
        return rewardHistoryService.saveRewardHistory(rewardHistory);
    }
}
