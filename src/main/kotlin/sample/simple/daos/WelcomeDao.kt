package sample.simple.daos

import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Service

@Configuration
open class WelcomeDao {

  open fun sayHello(name: String): String {
    return "Hello, ${name}!"
  }
}