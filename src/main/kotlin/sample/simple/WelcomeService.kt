package sample.simple

import org.springframework.stereotype.Service

@Service
open class WelcomeService {

  open fun sayHello(name: String): String {
    return "Hello, ${name}!"
  }
}