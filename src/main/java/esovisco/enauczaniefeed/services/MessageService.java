package esovisco.enauczaniefeed.services;

import esovisco.enauczaniefeed.domain.Message;
import esovisco.enauczaniefeed.repositories.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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

    public List<Message> getNumberOfMessages(int number) {
        Comparator<Message> dateComparator = Comparator.comparing(Message::getDate);
        List<Message> fetchedMessages = messageRepository.findAll();
        List<Message> result = new ArrayList<>();

        for(int i=0; i<number; i++){
            Optional<Message> messageOptional = fetchedMessages.stream().max(dateComparator);
            if(messageOptional.isEmpty()) break;

            Message latestMessage = messageOptional.get();
            fetchedMessages.remove(latestMessage);
            result.add(latestMessage);

        }

        return result;
    }

    public void deleteMessageById(Long id){
        messageRepository.delete(messageRepository.getById(id));
    }
}
