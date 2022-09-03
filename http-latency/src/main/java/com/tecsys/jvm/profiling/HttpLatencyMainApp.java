package com.tecsys.jvm.profiling;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 * JProfiler:
 *   - CPU Views / Call Tree
 *   - CPU Views / Hot Spots
 *
 * curl -v http://127.0.0.1:8080/api/latency/demo/5
 * curl -s -w '\nTotal: %{time_total}s\n' http://127.0.0.1:8080/api/latency/demo/5
 */
@SpringBootApplication
public class HttpLatencyMainApp {

    public static void main(String[] args) {
        SpringApplication.run(HttpLatencyMainApp.class, args);
    }

}