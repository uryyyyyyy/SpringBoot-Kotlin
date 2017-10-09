package com.github.uryyyyyyy.springbootkotlin.controller

import com.github.uryyyyyyy.springbootkotlin.service.HelloService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController @Autowired constructor(private val helloService: HelloService) {

  val logger = LoggerFactory.getLogger(HelloController::class.java)!!

  @GetMapping("/")
  fun hello(): String {
    logger.info("hello log")
    return "Hello, World!"
  }

  @GetMapping("/{num}")
  fun welcome(@PathVariable("num") number: Int): String {
    logger.info("welcome {} log", number)
    return helloService.say(number.toString())
  }

}
