package sample.simple.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("mock")
open class WelcomeServiceMock @Autowired constructor(): WelcomeService{

  override fun sayHello(name: String): String {
    return "Hello, dummy!"
  }
}