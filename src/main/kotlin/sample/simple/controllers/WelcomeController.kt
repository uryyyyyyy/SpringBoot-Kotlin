package sample.simple.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import sample.simple.services.WelcomeService
import java.util.*


@RestController
open class WelcomeController @Autowired constructor(private val welcomeService: WelcomeService){

  @GetMapping("/")
  fun welcome(): Map<String, String> {
    val value = this.welcomeService.sayHello("World")
    return Collections.singletonMap("message", value)
  }

}