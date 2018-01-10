package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingTranslator {
	
	public String sayHelloIn(String lang) {
		String hello;
		if ("en".equals(lang)) {
			hello = "hello";
		} else if ("es".equals(lang)) {
			hello = "hola";
		} else {
			hello = "no hablo tu idioma";
		}
	}

}
