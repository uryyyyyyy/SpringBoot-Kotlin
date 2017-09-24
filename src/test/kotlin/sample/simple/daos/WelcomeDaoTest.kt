package sample.simple.daos

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional
import sample.simple.DataSourceConfiguration
import javax.sql.DataSource

@RunWith(SpringRunner::class)
@ContextConfiguration(classes = arrayOf(DataSourceConfiguration::class))
@SpringBootTest
open class WelcomeDaoTest {

  @Autowired
  @Qualifier("default")
  open val dataSource: DataSource? = null

  @Test
  @Rollback
  fun selectAllTest() {
    val welcomeDao = WelcomeDao(dataSource!!)
    val list = welcomeDao.selectAllName()
    list.forEach { println(it) }
  }

  @Test
  @Rollback
  fun insertTest() {
    val welcomeDao = WelcomeDao(dataSource!!)
    val id = welcomeDao.insert("hoge")
    println(id)
    val list = welcomeDao.selectAllName()
    list.forEach { println(it) }
  }

}