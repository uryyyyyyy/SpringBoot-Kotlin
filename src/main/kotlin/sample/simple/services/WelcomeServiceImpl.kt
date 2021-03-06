package sample.simple.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import sample.simple.daos.WelcomeDao
import sample.simple.repositories.SampleRepository

@Service
@Profile("prod")
open class WelcomeServiceImpl @Autowired constructor(private val repository: SampleRepository): WelcomeService{

  @Transactional
  override fun sayHello(name: String): String {
//    val id = welcomeDao.insert("hoge")
//    println(id)
//
//    welcomeDao.selectAllName().forEach{ v -> println(v) }

    repository.findByName("haha").forEach{ v -> println(v) }
    return "Hello, ${name}!"
  }
}