package esovisco.enauczaniefeed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class EnauczanieFeedApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnauczanieFeedApplication.class, args);
    }

}
