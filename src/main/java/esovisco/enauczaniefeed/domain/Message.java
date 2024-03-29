package esovisco.enauczaniefeed.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "messages")
public class Message {

    public Message(String message, String author, Date date) {
        this.message = message;
        this.author = author;
        this.date = date;
        this.image = null;
    }

    public Message(String message, String author, Date date, String image) {
        this.message = message;
        this.author = author;
        this.date = date;
        this.image = image;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String message;

    private String author;

    private Date date;

    private String image;
}
