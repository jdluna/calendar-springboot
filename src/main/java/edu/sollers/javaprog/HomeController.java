/**
 * 
 */
package edu.sollers.javaprog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Karanveer
 *
 */
@RequestMapping("/")
@Controller
public class HomeController {
	
	@GetMapping
	public String doGet() {
		return "index";
	}
}
