package com.tecsys.jvm.profiling.controller;


import com.tecsys.jvm.profiling.proxy.DemoProxy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/*
 * curl -v http://127.0.0.1:8080/api/latency/demo/5
 * curl -s -w '\nTotal: %{time_total}s\n' http://127.0.0.1:8080/api/latency/demo/5
 */
@Slf4j
@RestController
public class DemoController {

    private final DemoProxy demoProxy;

    public DemoController(DemoProxy demoProxy) {
        this.demoProxy = demoProxy;
    }

    @GetMapping("/api/latency/demo/{n}")
    public void demo(@PathVariable int n) {
        log.debug(">>> Calling endpoint latency demo with {} seconds", n);
        demoProxy.delay(n);
    }

}