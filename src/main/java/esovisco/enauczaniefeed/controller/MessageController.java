package esovisco.enauczaniefeed.controller;

import esovisco.enauczaniefeed.domain.Message;
import esovisco.enauczaniefeed.services.MessageService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping("/all")
    public List<Message> getAllMessages(){
        return messageService.getAllMessages();
    }

    @RequestMapping("/newest/{number}")
    public List<Message> getNumberOfMessages(@PathVariable int number){
        return messageService.getNumberOfMessages(number);
    }
}
