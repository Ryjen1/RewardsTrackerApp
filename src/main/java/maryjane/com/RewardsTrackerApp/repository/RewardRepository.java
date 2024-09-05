package maryjane.com.RewardsTrackerApp.repository;

import maryjane.com.RewardsTrackerApp.entity.Reward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardRepository extends JpaRepository<Reward, Long> {
    Reward findByCustomerId(Long customerId);
}
