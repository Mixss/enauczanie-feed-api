package esovisco.enauczaniefeed.bootstrap;

import esovisco.enauczaniefeed.domain.Message;
import esovisco.enauczaniefeed.services.MessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Month;
import java.util.Date;


@Component
public class Bootstrap implements CommandLineRunner {

    private final MessageService messageService;

    public Bootstrap(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        Message m1 = new Message("Pierwsza wiadomość", "Mixss", new Date(122, 9, 11));
        Message m2 = new Message("Druga wiadomość", "Mixss", new Date(122, 9, 12));
        Message m3 = new Message("Trzecia wiadomość", "Mixss", new Date(122, 9, 13));

        messageService.saveMessage(m1);
        messageService.saveMessage(m2);
        messageService.saveMessage(m3);
    }
}
