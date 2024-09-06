package maryjane.com.RewardsTrackerApp.controller;

import maryjane.com.RewardsTrackerApp.dto.RewardBalance;
import maryjane.com.RewardsTrackerApp.entity.Reward;
import maryjane.com.RewardsTrackerApp.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/rewards")
public class RewardController {

    @Autowired
    private RewardService rewardService;

    @GetMapping("/balance/{customerId}")
    public String getRewardBalanceForView(@PathVariable Long customerId, Model model) {
        RewardBalance rewardBalance = rewardService.getRewardByCustomerId(customerId);
        model.addAttribute("rewardBalance", rewardBalance);
        return "balance";
    }




    @PostMapping("/balance")
    @ResponseBody
    public Reward createOrUpdateReward(@RequestBody Reward reward) {
        return rewardService.saveOrUpdateReward(reward);
    }
}
