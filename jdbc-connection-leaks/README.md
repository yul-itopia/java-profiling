# App Hanging by JDBC Connection Leaks

## Project ``` jdbc-connection-leaks ```

### Profiling to find out jdbc connection leaks

- ``` $ java -Xms32M -Xmx32M -jar target/jdbc-connection-leaks-2022.03-SNAPSHOT.jar ```
- Starts JProfiler
  - Enabling Native Methods Instrumentation (profiling & more expensive)
  - Database / JDBC / Call Tree
  - Database / JDBC / Hot Spots (for SQL Statements)
  - Database / JDBC / Connection Leaks
- Call ``` $ curl -s -w '\nTotal: %{time_total}s\n'  http://127.0.0.1:8080/api/products ```