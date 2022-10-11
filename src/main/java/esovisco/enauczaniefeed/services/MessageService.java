package esovisco.enauczaniefeed.services;

import esovisco.enauczaniefeed.domain.Message;
import esovisco.enauczaniefeed.repositories.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> getAllMessages(){
        return messageRepository.findAll();
    }

    public void saveMessage(Message message){
        messageRepository.save(message);
    }
}
