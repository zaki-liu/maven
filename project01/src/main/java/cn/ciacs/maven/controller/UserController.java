package cn.ciacs.maven.controller;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonObject;

import cn.ciacs.maven.module.User;
import cn.ciacs.maven.service.UserService;
/**
 * 
 * @author CIACs
 *
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/")
	public ModelAndView index(HttpServletRequest req, HttpServletResponse resp)
	{
		ModelAndView mv = new ModelAndView("index");
		return mv; 
	}

	/**
	 * 判断用户名是否已经被注册
	 * @param req
	 * @param resp
	 * @return
	 */
	@RequestMapping(value="/isUsed")
	@ResponseBody
	public String isUsernameExist(HttpServletRequest req, HttpServletResponse resp)
	{
		JsonObject json = new JsonObject();
		String username = req.getParameter("username");
		User user = userService.findUserByUsername(username);
		if(user == null)
		{
			json.addProperty("isUsed", 1);
		}
		else
		{
			json.addProperty("isUsed", 0);
		}
		System.out.println(json.toString());
		return json.toString();
	}
	
	/**
	 * 注册用户
	 * @param req
	 * @param resp
	 * @return
	 */
	@RequestMapping(value="/regist")
	public ModelAndView registUser(HttpServletRequest req, HttpServletResponse resp)
	{
		ModelAndView mv = new ModelAndView();
		HttpSession session = req.getSession();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		Date registDate = new Date(System.currentTimeMillis());
		User user = userService.findUserByUsername(username);
		if(user == null)
		{
			User user_ = new User();
			user_.setUsername(username);
			user_.setPassword(password);
			user_.setRegistDate(registDate);
			if(userService.addUser(user_) > 0)
			{
				session.setAttribute("username", username);
				mv.setViewName("loginSuccess");
				return mv;
			}
		}
		mv.setViewName("registFail");
		return mv;
	}
	
	/**
	 * 用户登录
	 * @param req
	 * @param resp
	 * @return
	 */
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest req, HttpServletResponse resp)
	{
		ModelAndView mv = new ModelAndView();
		HttpSession session = req.getSession();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = userService.findUserByUsername(username);
		System.out.println(user.getPassword());
		if(user != null && user.getPassword().equals(password))
		{
			session.setAttribute("username", username);
			mv.setViewName("loginSuccess");
		}
		else
		{
			mv.setViewName("loginFail");
		}
		return mv;
	}
	
	
}
