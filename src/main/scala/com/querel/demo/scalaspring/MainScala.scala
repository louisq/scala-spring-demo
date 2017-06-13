package com.querel.demo.scalaspring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{ComponentScan, Configuration}

@Configuration
@EnableAutoConfiguration
@ComponentScan
class MainScala

object Main extends App {
  SpringApplication.run(classOf[MainScala])
}


