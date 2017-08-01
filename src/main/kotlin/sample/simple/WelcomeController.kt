package sample.simple

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
open class WelcomeController {

  @GetMapping("/")
  fun welcome(): Map<String, String> {
    return Collections.singletonMap("message", "Hello, World!")
  }

}