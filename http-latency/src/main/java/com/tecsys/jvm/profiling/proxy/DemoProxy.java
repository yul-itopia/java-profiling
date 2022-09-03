package com.tecsys.jvm.profiling.proxy;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * Httpbin.org is an open-source web app and tool written in Python that exposes
 * mock endpoints you can use to test different things you’re implementing
 *
 * In the current case, we call an endpoint where httpbin.org responds with a
 * given delay
 *
 * We’ll use a 5-second delay for this example
 *
 * We’ll use this simple example to simulate a latency scenario in our app,
 * and httpbin.org simulates the root cause of the problem
 *
 * {@code curl -v http://127.0.0.1:8080/demo}
 * {@code curl -s -w 'Total: %{time_total}s\n'  http://127.0.0.1:8080/demo}
 */
@FeignClient(name = "httpBin", url = "${httpBinUrl}")
public interface DemoProxy {

    @PostMapping("/delay/{n}")
    void delay(@PathVariable int n);

}