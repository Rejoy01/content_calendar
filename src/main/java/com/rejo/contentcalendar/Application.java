package com.rejo.contentcalendar;


import com.rejo.contentcalendar.config.ContentCalenderProps;
import com.rejo.contentcalendar.model.Content;
import com.rejo.contentcalendar.model.Status;
import com.rejo.contentcalendar.model.Type;
import com.rejo.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
@EnableConfigurationProperties(ContentCalenderProps.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//To see all the bean inside applicationContext
//	ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
//	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
	// created startup data in resource
//	@Bean
//	CommandLineRunner commandLineRunner(ContentRepository repository){
////		return args -> System.out.println("hello dan");
//		// insert some data into database
//		return args -> {
//			Content content = new Content(null,"myFirst Blog"," All About Chat GPT", Status.IDEA, Type.VIDEO, LocalDateTime.now(),null,"");
//			repository.save(content);
//		};
//	}
}
