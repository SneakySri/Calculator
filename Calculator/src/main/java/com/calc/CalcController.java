package com.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
	
	@Autowired
	private CalcService calc;
	
	int res;
	
	@GetMapping("/test")
	public String test() {
		return ("working");
	}
	
	@GetMapping("/add/{a}/{b}")
	public String exe1(@PathVariable int a,@PathVariable int b) {
		
		res=calc.add(a,b);
		
		return "result = "+res;
		
	}
	
	@GetMapping("/sub/{a}/{b}")
	public String exe2(@PathVariable int a,@PathVariable int b) {
		
		res=calc.sub(a,b);
		
		return "result = "+res;
		
	}
	
	@GetMapping("/mul/{a}/{b}")
	public String exe4(@PathVariable int a,@PathVariable int b) {
		
		res=calc.mul(a,b);
		
		return "result = "+res;
		
	}
	
	@GetMapping("/mod/{a}/{b}")
	public String exe3(@PathVariable int a,@PathVariable int b) {
		
		res=calc.mod(a,b);
		
		return "result = "+res;
		
	}
	
	

}
