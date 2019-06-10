package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.NewsService;

/**
 * Servlet implementation class delete_news_achieveServlet
 */
@WebServlet("/delete_news_achieve")
public class delete_news_achieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NewsService newsService = new NewsService();

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		int id = Integer.valueOf(request.getParameter("id"));
		newsService.deleteNews(id);
		response.sendRedirect(request.getContextPath() + "html/delete.jsp");

		
	}

}