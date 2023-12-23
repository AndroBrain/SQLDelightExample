import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import com.example.YourDatabaseName

actual class DatabaseDriverFactory {
    actual fun create(): SqlDriver {
        val driver: SqlDriver = JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY)
        YourDatabaseName.Schema.create(driver)
        return driver
    }
}