package esovisco.enauczaniefeed.bootstrap;

import esovisco.enauczaniefeed.domain.Message;
import esovisco.enauczaniefeed.services.MessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.Month;
import java.util.Date;


@Component
@Profile("dev")
public class Bootstrap implements CommandLineRunner {

    private final MessageService messageService;

    public Bootstrap(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running in dev profile!");
        Message m1 = new Message("Pierwsza wiadomość", "Mixss", new Date(122, 9, 8));
        Message m2 = new Message("Druga wiadomość", "Mixss", new Date(122, 9, 9),
                "https://media.discordapp.net/attachments/914906630993363015/1029509371585118318/unknown.png");
        Message m3 = new Message("Trzecia wiadomość", "Mixss", new Date(122, 9, 10));

        messageService.saveMessage(m1);
        messageService.saveMessage(m2);
        messageService.saveMessage(m3);
    }
}
