# Indispensable JVM Profiler

## HTTP Latency

- ``` java -Xms32M -Xmx32M -jar http-latency/target/http-latency-2022.03-SNAPSHOT.jar ```
- ``` curl -s -w '\nTotal: %{time_total}s\n' http://127.0.0.1:8080/api/latency/demo/7 ```


## JDBC Latency

- ``` java -Xms32M -Xmx32M -jar jdbc-latency/target/jdbc-latency-2022.03-SNAPSHOT.jar ```
- ``` curl -s -w 'Total: %{time_total}s\n'  http://127.0.0.1:8080/api/products ```


## JPA Latency

- ``` java -Xms32M -Xmx32M -jar jpa-latency/target/jpa-latency-2022.03-SNAPSHOT.jar ```
- ``` curl -s -w 'Total: %{time_total}s\n'  http://127.0.0.1:8080/api/products ```


## JDBC Connection Leaks

- ``` java -Xms32M -Xmx32M -jar jdbc-connection-leaks/target/jdbc-connection-leaks-2022.03-SNAPSHOT.jar ```
- ``` curl -s -w '\nTotal: %{time_total}s\n'  http://127.0.0.1:8080/api/products ```


## JProfiler - Call Tree


## JProfiler - Call Graph


## JProfiler - Flame Graph 