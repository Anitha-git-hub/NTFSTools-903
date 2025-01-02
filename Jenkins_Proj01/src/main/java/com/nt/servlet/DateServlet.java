package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dateurl")
public class DateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// set the MIME type for the browser, how to render the content. here html is there
		response.setContentType("text/html");
		
		// get print writer obj to write the response/senddata to clients
		PrintWriter pw=response.getWriter();
		
		// write the content to response like html tags, outputs,text etc
		pw.println("<h1 style='color:green;text-align:center'>Todays Date is::"+new Date()+"</h1>");
		pw.println("<h3 style='color:pink;text-align:center'><a href='index.html'>Home</a></h3>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
