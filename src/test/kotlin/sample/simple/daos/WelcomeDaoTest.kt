package sample.simple.daos

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional

@RunWith(SpringRunner::class)
@SpringBootTest
@Transactional
open class WelcomeDaoTest {

  @Autowired
  open val jdbcTemplate: JdbcTemplate? = null

  @Test
  @Rollback
  fun selectAllTest() {
    val welcomeDao = WelcomeDao(jdbcTemplate!!)
    val list = welcomeDao.selectAllName()
    list.forEach { println(it) }
  }

  @Test
  @Rollback
  fun insertTest() {
    val welcomeDao = WelcomeDao(jdbcTemplate!!)
    val id = welcomeDao.insert("hoge")
    println(id)
    val list = welcomeDao.selectAllName()
    list.forEach { println(it) }
  }

}