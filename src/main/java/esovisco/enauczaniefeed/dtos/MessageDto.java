package esovisco.enauczaniefeed.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class MessageDto {
    public MessageDto(String message, String author, Date date) {
        this.message = message;
        this.author = author;
        this.date = date;
    }

    public MessageDto(String message, String author, Date date, String image) {
        this.message = message;
        this.author = author;
        this.date = date;
        this.image = image;
    }

    private Long id;

    private String message;

    private String author;

    private Date date;

    private String image;
}
