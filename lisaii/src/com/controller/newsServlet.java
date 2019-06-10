package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.NewsService;

/**
 * Servlet implementation class newsServlet
 */
@WebServlet("/news")
public class newsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private NewsService newsService = new NewsService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    request.setAttribute("newss", newsService.listNews());
	    request.getRequestDispatcher("/jsp/news.jsp").forward(request, response);
	}
}