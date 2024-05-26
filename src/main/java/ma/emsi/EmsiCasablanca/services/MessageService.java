package ma.emsi.EmsiCasablanca.services;

import ma.emsi.EmsiCasablanca.entities.Message;
import ma.emsi.EmsiCasablanca.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    public Message getMessageById(Long messageId) {
        return messageRepository.getById(messageId);
    }

    // Add other methods as needed
}

