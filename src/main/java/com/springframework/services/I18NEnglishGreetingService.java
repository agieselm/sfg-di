package com.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("EN")
public class I18NEnglishGreetingService implements GreetingService {

	@Override
	public String greet() {
		return "Hello World - EN";
	}
}
