package com.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile({"ES", "default"})
public class I18NSpanishGreetingService implements GreetingService {

	@Override
	public String greet() {
		return "Hola Mundo - ES";
	}

}
