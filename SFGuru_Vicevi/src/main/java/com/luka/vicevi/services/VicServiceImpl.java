package com.luka.vicevi.services;

import org.springframework.stereotype.Component;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Component
public class VicServiceImpl implements VicService {

	private final ChuckNorrisQuotes chuckNorrisCitat;
	
	
	
	public VicServiceImpl() {
		this.chuckNorrisCitat = new ChuckNorrisQuotes();
	}
	
	public String getVic() {
		// TODO Auto-generated method stub
		return chuckNorrisCitat.getRandomQuote();
	}

}
