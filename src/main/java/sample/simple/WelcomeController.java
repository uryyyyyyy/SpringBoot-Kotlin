package sample.simple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class WelcomeController {

  @GetMapping("/")
  public Map<String, String> welcome() {
    return Collections.singletonMap("message", "Hello, World!");
  }

}