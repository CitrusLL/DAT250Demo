package oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasePage {
    
    @GetMapping("/error")
	public String basePage(){
		return "Working :)";
	}
}
