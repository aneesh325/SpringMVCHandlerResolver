package com.test.controller;

import javax.annotation.Generated;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.annotation.StaticWelcomeMesasge;
import com.test.annotation.Welcome;
import com.test.core.AddForm;
import com.test.core.WelcomeMessage;

@Controller
@RequestMapping("/")
public class TestController {
	
	
	@GetMapping("")
	public ModelAndView welcomeApp(@Welcome WelcomeMessage welcomeMessage) {
		ModelAndView mav = new ModelAndView("welcome");
		mav.addObject("greet", WelcomeMessage.greeting());
		mav.addObject("addForm",new AddForm());
		return mav;
		
	}
	
	@PostMapping("addition")
	public ModelAndView welcomeAddition(@ModelAttribute("addForm") AddForm addForm) {
		ModelAndView mav = new ModelAndView("welcome");
		mav.addObject("greet", "The addition of the numbers is ...");
		mav.addObject("addition", addForm.getNum1()+addForm.getNum2());
		return mav;
		
	}

	@PostMapping("/subtraction")
	public ModelAndView welcomeSubtraction(@ModelAttribute("addForm") AddForm addForm) {
		ModelAndView mav = new ModelAndView("welcome");
		mav.addObject("greet", "The subtraction of the numbers is ...");
		mav.addObject("addition", addForm.getNum1()-addForm.getNum2());
		return mav;
		
	}
	
	
	

}
