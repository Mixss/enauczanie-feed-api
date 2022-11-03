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

    @RequestMapping(value = "/newest/{number}")
    public List<Message> getNumberOfMessages(@PathVariable int number){
        return messageService.getNewestMessages(number);
    }

    @RequestMapping(value = "/older/{from}/{number}")
    public List<Message> getOlderMessages(@PathVariable int from, @PathVariable int number){
        return messageService.getOlderMessages(number, from);
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

    @PostMapping("/delete/{id}")
    public List<String> deleteMessage(@PathVariable Long id){
        try {
            messageService.deleteMessageById(id);
            return List.of("Message deleted successfully");
        } catch (Exception e){
            return List.of("Message deletion failed!"); // TODO not working
        }
    }
}
