package com.example

import com.foo.User
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@ComponentScan("com.example, com.foo, com.toysforshots")
@SpringBootApplication
@EnableConfigurationProperties
class DemoWebApplication extends WebMvcConfigurerAdapter {


	@Bean
	User user(){
		return new User("Manish", "Kapoor")
	}

	static void main(String[] args) {
//		SpringApplication.run DemoWebApplication, args

		ApplicationContext ctx = SpringApplication.run(DemoWebApplication.class, args)
		List<String> beanNames = ctx.getBeanDefinitionNames().sort()
		println"============================="
		beanNames.each {println(it)}
		println"============================="
		ctx.getBean('notificationService').toString();
		ctx.getBean('user').toString();
	}
}
