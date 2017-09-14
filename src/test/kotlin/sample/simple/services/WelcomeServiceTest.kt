package sample.simple.services

import org.junit.Assert.assertEquals

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import sample.simple.services.WelcomeService

@RunWith(SpringRunner::class)
@SpringBootTest
class WelcomeServiceTest {

  @Autowired
  internal var welcomeService: WelcomeService? = null

  @Test
  fun testSayHello() {
    assertEquals("Hello, World!", welcomeService!!.sayHello("World"))
  }

}