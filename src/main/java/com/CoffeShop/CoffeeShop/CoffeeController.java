package com.CoffeShop.CoffeeShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {

@Autowired
private Person p;
	
	
@RequestMapping("/")
public ModelAndView index() {
	ModelAndView mv = new ModelAndView("index");
	mv.addObject("registerLink", "/Register");
	return mv;
	
}
@RequestMapping(value = "/Register", method = RequestMethod.GET)
public ModelAndView register(){
    return new ModelAndView("Register");
}

@RequestMapping("/formresults")
public ModelAndView add(@RequestParam("firstname")String fname)
{
p.setFirstName(fname);
	
String sayHello = "Hello , " + p.getFirstName();
 return new ModelAndView("AddUser", "userData", sayHello);	
}

//@RequestMapping("/register")
//public ModelAndView register() {
//	ModelAndView mv = new ModelAndView("Register", "register", "Please Fill out the Form to Register");
//
//	return mv;
//	
//}


}
