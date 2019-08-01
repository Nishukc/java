package controller;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ref.ReferenceQueue;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter p= response.getWriter();

        String name = request.getParameter("username");
        String password = request.getParameter("password");

        if (password.equals("pass")){

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("servlet2");
            requestDispatcher.forward(request, response);

        }
        else {
            p.print("wrong password");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index/html");
            requestDispatcher.include(request, response);
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
