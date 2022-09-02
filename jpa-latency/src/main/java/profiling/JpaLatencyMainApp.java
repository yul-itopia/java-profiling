package profiling;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JpaLatencyMainApp {

    public static void main(String[] args) {
        SpringApplication.run(JpaLatencyMainApp.class, args);
    }

}