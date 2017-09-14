package sample.simple.services

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import java.sql.Timestamp
import java.time.LocalDateTime


@Service
open class WelcomeService @Autowired constructor(private val jdbcTemplate: JdbcTemplate){

  open fun sayHello(name: String): String {
    val sql = "insert into sample(name, created_at) values(?, ?)"
    jdbcTemplate.update(sql, "name", Timestamp.valueOf(LocalDateTime.now()))


    val list = jdbcTemplate.queryForList("SELECT * FROM sample")
    list.forEach{ v -> println(v) }
    return "Hello, ${name}!"
  }
}