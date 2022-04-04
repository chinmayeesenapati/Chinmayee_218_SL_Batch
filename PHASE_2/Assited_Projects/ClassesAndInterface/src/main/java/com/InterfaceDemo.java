package com;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InterfaceDemo
 */
public class InterfaceDemo extends HttpServlet {
    ServletConfig config=null;
    public void init(ServletConfig config){
        this.config=config;
        System.out.println("Initialization complete");
    }
    public void service(ServletRequest req,ServletResponse res)
            throws IOException,ServletException{
                res.setContentType("text/html");
                PrintWriter pwriter=res.getWriter();
                pwriter.print("<html>");
                pwriter.print("<body>");
                pwriter.print("In the service() method<br>");
                pwriter.print("</body>");
                pwriter.print("</html>");
            }
            public void destroy(){
                System.out.println("In destroy() method");
            }
            public ServletConfig getServletConfig(){
                return config;
            }
            public String getServletInfo(){
                return "This is a sample servlet info";
            }
 }