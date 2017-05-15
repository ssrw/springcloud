/**
 * 
 */
package com.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.servlet.ModelAndView;

/**
 * @author SMALLTALK
 *
 */
@Controller
public class StudentController {
	
	   @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
	   public ModelAndView student() {
		  ModelAndView model = new ModelAndView("student");
	      return  model;
	   }
	   
	   @RequestMapping(value = "/result", method = RequestMethod.POST)
	   public ModelAndView addStudent(@RequestParam("name") String studentName, @RequestParam("hobby") String studentHobby) {
	      ModelAndView model = new ModelAndView("result");
	      model.addObject("name",studentName);
	      model.addObject("hobby", studentHobby);
	      return model;
	   }

}
