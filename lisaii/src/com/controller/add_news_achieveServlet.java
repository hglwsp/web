package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.News;
import com.service.NewsService;


/**
 * Servlet implementation class add_news_achieveServlet
 */
@WebServlet("/add_news_achieve")
public class add_news_achieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NewsService newsService = new NewsService();
	private News news = new News();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");	
	    String content = request.getParameter("content");
	   
	    
	    news.setContent(content);	
	    newsService.addNews(news);
	    response.sendRedirect(request.getContextPath() + "/indexServlet");
    	
	
	}

}