import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.example.YourDatabaseName

actual class DatabaseDriverFactory {
    actual fun create(): SqlDriver =
        NativeSqliteDriver(YourDatabaseName.Schema, "DATABASE_NAME")
}
