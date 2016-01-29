package cz.morosystems.phase2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import cz.morosystems.phase2.entity.UserEntity;
import cz.morosystems.phase2.exception.UserNotFoundException;
import cz.morosystems.phase2.service.UserManager;

@Controller
public class ShowUserController {

	@Autowired
	private UserManager userManager;

	@RequestMapping("/")
	public String showUser(Model model) {
		model.addAttribute("users", userManager.getAllUsers());
		return "showuser";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET, params = { "id" })
	public String showUser(@RequestParam("id") int id, Model model) {
		List<UserEntity> users = new ArrayList<UserEntity>();
		UserEntity user = userManager.getUser(id);
		if (user == null) {
			throw new UserNotFoundException(id);
		}
		users.add(user);
		model.addAttribute("users", users);
		return "showuser";
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public String handleError(UserNotFoundException exception, Model model) {
		model.addAttribute("invalidUserId", exception.getUserId());
		model.addAttribute("exception", exception);
		//model.addAttribute("url", req.getRequestURL() + "?" + req.getQueryString());
		return "error";
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
}
