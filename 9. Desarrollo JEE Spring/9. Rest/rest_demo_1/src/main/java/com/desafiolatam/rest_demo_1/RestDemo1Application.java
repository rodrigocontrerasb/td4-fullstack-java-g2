package com.desafiolatam.rest_demo_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafiolatam.rest_demo_1.model.Quote;
import com.desafiolatam.rest_demo_1.services.FetchDataService;
import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class RestDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestDemo1Application.class, args);
	}

	// private static final Logger logger =
	// LoggerFactory.getLogger(ConsumeRestApplication.class);
	private ObjectMapper mapper = new ObjectMapper();
	@Autowired
	@Lazy
	private FetchDataService fetchDataService;

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {
			Quote quote = fetchDataService.fetchQuote();
			// logger.info(mapper.writeValueAsString(quote));
			
			System.out.println("------------------------------------------");
			System.out.println("SALIDA DE API REST");
			System.out.println(mapper.writeValueAsString(quote));
			System.out.println("------------------------------------------");
			
			System.out.println("------------------------------------------");
			System.out.println("TYPE    -->" + quote.getType());
			System.out.println("ID      -->" + quote.getValue().getId());
			System.out.println("VALUE   -->" + quote.getValue().getQuote());
			System.out.println("------------------------------------------");
			
		};
	}

}
