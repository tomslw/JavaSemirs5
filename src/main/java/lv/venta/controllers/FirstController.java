package lv.venta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FirstController {

	
	@GetMapping("/hello")
	public String getHelloFunc() {
		System.out.println("ay baus");
		return "hello-page";
	}
	
	@GetMapping("/msg")
	public String handleMsg(Model model) {
		model.addAttribute("message", "this is a message");
		return "msg-page";
	}
	
	@GetMapping("/new-prod")
	public String getNewProduct(Model model) {
		model.addAttribute("message", "this is a message");
		return "prod-page";
	}
	
}
