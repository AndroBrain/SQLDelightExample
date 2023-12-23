import com.example.YourDatabaseName

class IosAppModule : AppModule {
    private val db by lazy {
        YourDatabaseName(
            driver = DatabaseDriverFactory().create()
        )
    }

    override fun provideExampleDataSource() = ExampleDataSource(db)
}
