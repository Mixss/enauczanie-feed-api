package esovisco.enauczaniefeed.controllers;

import esovisco.enauczaniefeed.domain.Message;
import esovisco.enauczaniefeed.dtos.MessageDto;
import esovisco.enauczaniefeed.dtos.MessageDtoMapper;
import esovisco.enauczaniefeed.services.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
@CrossOrigin(origins = "http://localhost:8080/message/")
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

    @PostMapping("/add")
    public ResponseEntity<MessageDto> addNewMessage(@RequestBody MessageDto messageDto){
        Message newMessage = MessageDtoMapper.map(messageDto);
        try {
            messageService.saveMessage(newMessage);
            messageDto.setDate(newMessage.getDate());
            return ResponseEntity.ok(messageDto);
        }
        catch (Exception e){
            return (ResponseEntity<MessageDto>) ResponseEntity.status(HttpStatus.BAD_REQUEST);
        }
    }
}
