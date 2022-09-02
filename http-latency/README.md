# Latency Caused by HTTP

## Project ``` http-latency ```

### Sampling to find out which method cause the latency

-  ``` $ java -Xms32M -Xmx32M -jar target/http-latency-2022.03-SNAPSHOT.jar ```
- Starts JProfiler
  * Enabling Native Methods Instrumentation (profiling & more expensive)
  * CPU Views / Call Tree
-  ``` curl -s -w '\nTotal: %{time_total}s\n' http://127.0.0.1:8080/api/latency/demo/7 ```

### Profiling to find out invocation count of a method

- CPU Views / Hot Spots
- Filter ``` java.net.HttpURLConnection ```~~~~~~~~