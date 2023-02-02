package com.client.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.client.entities.User;



@Controller
public class Login {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/resetPassword")
	public String resetPassword() {
		return "resetpassword";
	}
	
	@PostMapping("/userlogin")
	public String userLogin(@RequestParam("userid") String userid,@RequestParam("password") String password , Model model,HttpSession session) {
		System.out.println(userid);
		System.out.println(password);
		User user=new User();
		
		user.setEmail(userid);		
		user.setPassword(password);
		int status;
		try {
		ResponseEntity<User> res=restTemplate.postForEntity("http://localhost:8091/authservice/auth", user, User.class);
		User userObj=(User) res.getBody();
		System.out.println(userObj);
		session.setAttribute("userId", userObj.getId());
		status=res.getStatusCodeValue();
		System.out.println(res.getStatusCodeValue());
		return "redirect:/welcome";
		}
		catch(Exception e)
		{
			status=400;
			model.addAttribute("message","UserName and Password invalid"+e);		
			
			return "login";
		}	
	}
	
	@PostMapping("/setUser")
	public String userRegistration(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("password") String password,@RequestParam("state") String state,@RequestParam("city") String city,@RequestParam("dob") String dob,@RequestParam("mobno") long mobno,@RequestParam("passyr") int passyr , Model model,HttpSession session) {
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(state);
		System.out.println(city);
		System.out.println(dob);
		System.out.println(mobno);
		System.out.println(passyr);
		User user=new User();
		
		user.setName(name);		
		user.setEmail(email);
		user.setPassword(password);
		user.setState(state);
		user.setCity(city);
		user.setDob(dob);
		user.setMobileNo(mobno);
		user.setYearOfCompletion(passyr);
		int status;
		try {
		ResponseEntity<User> res=restTemplate.postForEntity("http://localhost:8889/authservice/registration", user, User.class);
		User userObj=(User) res.getBody();
		System.out.println(userObj);
		session.setAttribute("userId", userObj.getId());
		status=res.getStatusCodeValue();
		System.out.println(res.getStatusCodeValue());
		return "UserRegisteredSuccessfully";
		}
		catch(Exception e)
		{
			status=400;
			model.addAttribute("message","User already exists."+e);		
			
			return "register";
		}	
	}
	
	@RequestMapping("/register")
	public String goToRegister() {
		return "register";
	}
	@GetMapping("/welcome")
	public String welcome() {
		
		return "welcome";
	}
	
	@PostMapping("/resetPasswordForUser")
	public String resetPasswordForUser(@RequestParam("userid") String userid,@RequestParam("password") String password, Model model,HttpSession session) {
		System.out.println(userid);
		System.out.println(password);
		User user=new User();
		user.setEmail(userid);	
		user.setPassword(password);	
		int status;
		try {
		ResponseEntity<User> res=restTemplate.postForEntity("http://localhost:8889/authservice/resetPassword", user, User.class);
		User userObj=(User) res.getBody();
		System.out.println(userObj);
		session.setAttribute("userId", userObj.getId());
		status=res.getStatusCodeValue();
		System.out.println(res.getStatusCodeValue());
		return "resetpasswordsuccess";
		}
		catch(Exception e)
		{
			status=400;
			model.addAttribute("message","UserName and Password invalid"+e);		
			
			return "resetpassword";
		}	
	}

}
