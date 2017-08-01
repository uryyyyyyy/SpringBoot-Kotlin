package sample.simple

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import org.springframework.beans.factory.annotation.Autowired



@RestController
open class WelcomeController {

  @Autowired
  var welcomeService: WelcomeService? = null

  @GetMapping("/")
  fun welcome(): Map<String, String> {
    val value = this.welcomeService!!.sayHello("World")
    return Collections.singletonMap("message", value)
  }

}