package com.vivek.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@ModelAttribute("course")
	public String courseName() {
		return "Java";
	}

	@RequestMapping("/")
	public String home() {
//		System.out.println("Home Method called");
		return "index";
	}

	@RequestMapping("add")
//	public String add(HttpServletRequest req, HttpSession session) {
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {

//		int num1 = Integer.parseInt(req.getParameter("num1"));
//		int num2 = Integer.parseInt(req.getParameter("num2"));
		int result = num1 + num2;
//		System.out.println(result);
//		session.setAttribute("result", result);
//		model.addAttribute("result", result);

		// ModelAndView
		mv.addObject("result", result);
		mv.setViewName("result");
		return mv;
	}

	@RequestMapping("addAlien")
//	public String add(HttpServletRequest req, HttpSession session) {
//	public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv) {

//	public String addAlien(@ModelAttribute Alien alien) {
	public String addAlien(Alien alien) {

//		Alien alien = new Alien();
//		alien.setAid(aid);
//		alien.setAname(aname);

		// ModelAndView
//		mv.addObject("alien", alien);
//		mv.setViewName("result");

		return "result";
	}

}