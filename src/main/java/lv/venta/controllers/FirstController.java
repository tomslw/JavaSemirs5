package lv.venta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lv.venta.models.*;


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
	
	@GetMapping("/product")
	public String getNewProduct(Model model) {
		Product prod = new Product("iphone", "Unrepairable smartphone.", 1, 999.99f);
		
		model.addAttribute("packet", prod);
		return "product-page";
	}
	
}
