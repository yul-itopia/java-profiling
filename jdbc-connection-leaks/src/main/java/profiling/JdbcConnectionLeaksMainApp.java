package profiling;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JdbcConnectionLeaksMainApp {

    public static void main(String[] args) {
        SpringApplication.run(JdbcConnectionLeaksMainApp.class, args);
    }

}