# Latency Caused by JDBC

## Project ``` jdbc-latency ```

### Profiling to find out invocation count of a SQL query

- ``` $ java -Xms32M -Xmx32M -jar target/jdbc-latency-2022.03-SNAPSHOT.jar ```
- Starts JProfiler
  - Enabling Native Methods Instrumentation (profiling & more expensive)
  - Database / JDBC / Call Tree
  - Database / JDBC / Hot Spots (for SQL Statements)
- Call ``` $ curl -s -w 'Total: %{time_total}s\n'  http://127.0.0.1:8080/api/products ```