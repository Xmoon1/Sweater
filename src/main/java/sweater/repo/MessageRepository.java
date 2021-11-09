package sweater.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sweater.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
