package com.restfulfirst.FirstRest.hellopkg;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {

	@Autowired
	private MessageSource messageSource;

	// There is one way : @RequestMapping(method=RequestMethod.GET,
	// path="/hello-world")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World Akash";
	}

	@GetMapping(path = "/hello-world-bean")
	public NewHelloDependecie helloworlddep() {
		return new NewHelloDependecie("HELLO FROM DEPEDENCIE CLASS");
	}

	@GetMapping(path = "/hello-world-bean/{name}")
	public NewHelloDependecie helloworlddep(@PathVariable String name) {
		return new NewHelloDependecie(String.format("Path Variables:, %s", name));
	}

	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternationalized(@RequestHeader(name="Accept-Language", required=false)Locale locale )
	{
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}

}
