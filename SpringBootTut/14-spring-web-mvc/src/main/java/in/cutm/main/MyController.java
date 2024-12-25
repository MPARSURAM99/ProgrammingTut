package in.cutm.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {
	
	
	@GetMapping("/hello")
	public ModelAndView helloPage() {
		System.out.println("helloPage() method executed successsfully");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		
		 return mav;
	}
}
