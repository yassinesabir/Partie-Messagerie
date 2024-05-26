package ma.emsi.EmsiCasablanca.repositories;

import ma.emsi.EmsiCasablanca.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}

