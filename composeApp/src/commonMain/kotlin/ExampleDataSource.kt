import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import com.example.YourDatabaseName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

class ExampleDataSource(db: YourDatabaseName) {
    private val queries = db.exampleEntityQueries

    //    Set id = null to let SQLDelight autogenerate the id
    fun insert(id: Long?, name: String) {
        queries.insert(id = id, name = name)
    }

    // If you've added the coroutines extensions you'll be able to use asFlow()
    fun getAll() = queries.getAll().asFlow().mapToList(Dispatchers.IO)

    fun update(id: Long, name: String) {
        queries.updateName(id = id, name = name)
    }

    fun delete(id: Long) {
        queries.delete(id = id)
    }
}