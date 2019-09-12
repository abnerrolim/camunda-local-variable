package abner.report.bugs.camunda

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
@EnableProcessApplication
class Application

    fun main(args: Array<String>) {
        SpringApplication.run(Application::class.java, *args)
    }
