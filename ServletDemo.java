package com.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.Map;
import java.util.HashMap;

public class ServletDemo extends HttpServlet {

    private String message;

    @Override
    public void init() throws ServletException
    {
        // Do required initialization
        message = "Hello World";
    }

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
        throws ServletException, IOException
    {
        doPost(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
        throws ServletException, IOException
    {
        String username = request.getParameter("name");

        request.setAttribute("message", username + " NAME ");

        getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
    }

    @Override
    public void destroy()
    {
        // do nothing.
    }
}
