package com.desafiolatam.rest_demo_1.services;

import org.springframework.stereotype.Service;

import com.desafiolatam.rest_demo_1.model.Quote;

public interface FetchDataService {
	
	Quote fetchQuote();

}
