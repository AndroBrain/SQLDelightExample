import com.example.YourDatabaseName

class DesktopAppModule : AppModule {
    private val db by lazy {
        YourDatabaseName(
            driver = DatabaseDriverFactory().create()
        )
    }

    override fun provideExampleDataSource() = ExampleDataSource(db)
}
