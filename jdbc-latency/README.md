# Retrieve SQL Queries from JDBC

## Project ``` jdbc-queries ```

### Profiling to find out invocation count of a SQL query

- ``` $ java -Xms32M -Xmx32M -jar target/jdbc-queries-2022.03-SNAPSHOT.jar ```
- Starts JProfiler
  - Enabling Native Methods Instrumentation (profiling & more expensive)
  - CPU Views / Call Tree
  - CPU Views / Hot Spots
    - Filter ``` java.net.HttpURLConnection ```
  - Database / JDBC / Call Tree
  - Database / JDBC / Hot Spots (for SQL Statements)
- Call ``` $ curl -s -w 'Total: %{time_total}s\n'  http://127.0.0.1:8080/api/products ```