package Repo.userRepository;

import com.cw.Ticketsystem.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository <Event,Integer> {
}
