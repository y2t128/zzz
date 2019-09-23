package controller;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pojo.User;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

import service.UserService;


@Controller
@RequestMapping(value="/User")
public class UserController {
	@Resource
	private UserService userService;
	
	/**
	 * 分页查询用户列表
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public void userSelect(HttpServletRequest request,
			HttpServletResponse response)throws Exception{
		System.out.println("11111111111111");
		response.setContentType("json");
		response.setCharacterEncoding("utf-8");
		String index=request.getParameter("index");
		if (index==null) {
			index="1";
	}
	PageInfo<User> pageInfo = userService.userQueryList(Integer.valueOf(index),5,null);
		request.setAttribute("list", pageInfo.getList());
		request.setAttribute("index", pageInfo.getPageNum());
		request.setAttribute("pages", pageInfo.getPages());
		pageInfo.getList();
		PrintWriter out = response.getWriter();  
		out.print(JSON.toJSON(pageInfo));
		out.flush();
		out.close();
	}
	@RequestMapping(value="/Delete",method=RequestMethod.GET)
	public void userDelete(HttpServletRequest request,
			HttpServletResponse response,int id)throws Exception{
		System.out.println("222222222");
		PrintWriter out = response.getWriter();
		out.print(userService.userDelete(Integer.valueOf(id)));
		out.flush();
		out.close();
	}
	@RequestMapping(value="/idList",method=RequestMethod.GET)
	public void useridList(HttpServletRequest request,
			HttpServletResponse response,int id)throws Exception{
		System.out.println("3333333");
		PrintWriter out = response.getWriter();
		out.print(JSON.toJSON(userService.userIdList(Integer.valueOf(id))));
		out.flush();
		out.close();
	}
}
