package profiling;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JdbcQueriesMainApp {

    public static void main(String[] args) {
        SpringApplication.run(JdbcQueriesMainApp.class, args);
    }
}