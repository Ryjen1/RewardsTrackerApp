package maryjane.com.RewardsTrackerApp.repository;

import maryjane.com.RewardsTrackerApp.entity.RewardHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RewardHistoryRepository extends JpaRepository<RewardHistory, Long> {
    List<RewardHistory> findByCustomerId(Long customerId);
}
