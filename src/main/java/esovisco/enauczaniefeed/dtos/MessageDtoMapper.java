package esovisco.enauczaniefeed.dtos;

import esovisco.enauczaniefeed.domain.Message;

import java.util.Date;

public class MessageDtoMapper {
    public static Message map(MessageDto messageDto){
        Date date = messageDto.getDate() == null ? new Date() : messageDto.getDate();
        return new Message(messageDto.getMessage(), messageDto.getAuthor(), date, messageDto.getImage());
    }
}
