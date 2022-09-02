package profiling;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JdbcLatencyMainApp {

    public static void main(String[] args) {
        SpringApplication.run(JdbcLatencyMainApp.class, args);
    }
}