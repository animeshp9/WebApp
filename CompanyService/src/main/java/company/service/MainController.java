package company.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/mainservice")
public class MainController {

	        @RequestMapping(value = "/hello", method = RequestMethod.GET)
	        public String hello(ModelMap model) {
	            model.addAttribute("msg", "JCG Hello World!");
	            return "CompanyInfo";
	        }
	
}
	