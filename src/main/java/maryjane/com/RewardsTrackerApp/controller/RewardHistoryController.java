package maryjane.com.RewardsTrackerApp.controller;

import maryjane.com.RewardsTrackerApp.entity.RewardHistory;
import maryjane.com.RewardsTrackerApp.service.RewardHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/rewards")
public class RewardHistoryController {

    @Autowired
    private RewardHistoryService rewardHistoryService;

//    @GetMapping("/history/{customerId}")
//    public List<RewardHistory> getRewardHistory(@PathVariable Long customerId) {
//        return rewardHistoryService.getRewardHistoryByCustomerId(customerId);
//    }
@GetMapping("/history/{customerId}")
public String getRewardHistory(@PathVariable Long customerId, Model model) {
    List<RewardHistory> rewardHistories = rewardHistoryService.getRewardHistoryByCustomerId(customerId);
    model.addAttribute("rewardHistories", rewardHistories);
    return "history";
}

    @PostMapping("/post_history")
    @ResponseBody
    public RewardHistory addRewardHistory(@RequestBody RewardHistory rewardHistory) {
        return rewardHistoryService.saveRewardHistory(rewardHistory);
    }
}
