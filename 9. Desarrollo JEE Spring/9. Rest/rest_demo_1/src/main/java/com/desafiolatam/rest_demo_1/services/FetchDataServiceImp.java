package com.desafiolatam.rest_demo_1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafiolatam.rest_demo_1.model.Quote;

@Service
public class FetchDataServiceImp implements FetchDataService {

	@Value("${endpoints.quote}")
	private String quoteEndpoint;
	private RestTemplate restTemplate;

	@Autowired
	public FetchDataServiceImp(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public Quote fetchQuote() {
		return restTemplate.getForObject(quoteEndpoint, Quote.class);
	}

}
