package com.justin.spring.web.app;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.justin.spring.web.app.util.User;

/**
 * Deals with various requests.
 * @author Justin Alderson
 *
 */
@Controller
public class MainController {

	private static final Logger log = LoggerFactory.getLogger(MainController.class);

	@RequestMapping("/")
	public String checkUser(Model model) {
		model.addAttribute("user", new User());
		return "index";
		
	}

	@RequestMapping("/index")
	public String logOutCalled(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	@RequestMapping(value = "/unPaidMonth", method = RequestMethod.POST)
	public String unPaidMonth() {
		return "unPaidMonth";
	}

	@RequestMapping(value = "/loggedOut")
	public String workingLoggedOut(HttpServletRequest request) {
		log.info("\n\nLoggedOutController .request.getSession().invalidate(); WAS CALLED \n\n");
		request.getSession().invalidate();
		return "loggedOut";

	}

	@RequestMapping(value = "/logoutPage")
	public String loggedOut(HttpServletRequest request) {
		log.info("\n\nSession infos LogoutPageController" + request.getSession().getId() + "\n\n");
		return "logoutPage";
	}

}
