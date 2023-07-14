package com.cookie;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestCookieA extends HttpServlet
{

	private static final long serialVersionUID = 1L;

  public void doPost(HttpServletRequest req,HttpServletResponse res) 
  {
   try 
   { 
	res.setContentType("text/html");
	String s=req.getParameter("userName");
	PrintWriter out=res.getWriter();
	out.print("<b>"+s+"</b>");  
	Cookie[] ck=req.getCookies();
	out.print("Hello"+ck[0].getValue());
	out.close();   
   }
   catch(Exception e)
   {
	  System.out.println("hi"); 
   }
  }
}
