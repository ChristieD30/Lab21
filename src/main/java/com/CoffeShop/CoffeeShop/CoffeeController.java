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

@Autowired
Persondao dao;	

@Autowired
ItemsJDBCDao dao2;
	
@RequestMapping("/")
public ModelAndView index() {
	ModelAndView mv = new ModelAndView("index");
	mv.addObject("registerLink", "/register-page");
	mv.addObject("order", "/Coffee");
	return mv;
	
}
@RequestMapping(value = "/register-page", method = RequestMethod.GET)
public ModelAndView register(){
    return new ModelAndView("register-page");
}

@RequestMapping("/newuser")
public ModelAndView registerUser(Person newPerson) {
	
	dao.addUser(newPerson.getFirstName(),newPerson.getLastName(), newPerson.getEmail(), newPerson.getPhoneNumber(), newPerson.getPassword() );
	
	return new ModelAndView("redirect:/");

}


@RequestMapping("/Coffee")
public ModelAndView listCoffee(@RequestParam(value = "brand", required = false) String category) {
	ModelAndView mv = new ModelAndView("Coffeepage");

if (category != null && !category.isEmpty()) {
		mv.addObject("items", dao2.findByCategory(category));
		mv.addObject("brand", category);

	} else {
		mv.addObject("items", dao2.findAllItems());
	}

	return mv;

}




//@RequestMapping("Coffeepage")
//public ModelAndView coffee() {
//
//	return new ModelAndView("Coffeepage");
//}
	

}
