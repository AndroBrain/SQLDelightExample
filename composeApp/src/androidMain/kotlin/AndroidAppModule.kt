import android.content.Context
import com.example.YourDatabaseName

class AndroidAppModule(
    private val context: Context,
) : AppModule {
    private val db by lazy {
        YourDatabaseName(
            driver = DatabaseDriverFactory(context).create()
        )
    }

    override fun provideExampleDataSource() = ExampleDataSource(db)
}
