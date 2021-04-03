package springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springboot.web.dto.HelloResponseDto;

@RestController
public class HelloController {

	//@RequestMapping(value = "/hello", method = RequstMethod.GET)
	//@RequestMapping("/hello")
	@GetMapping("/hello")	
	public String hello() {
		return "hello";
	}
	
	// http://localhost:8080/hello/dto?name=honggildong&amount=23
	@GetMapping("/hello/dto")
	public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
		return new HelloResponseDto(name, amount);
	}
}
