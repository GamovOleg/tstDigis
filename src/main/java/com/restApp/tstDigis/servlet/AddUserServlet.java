package com.restApp.tstDigis.servlet;

import com.restApp.tstDigis.Gender;
import com.restApp.tstDigis.controller.UserController;
import com.restApp.tstDigis.model.User;
import com.restApp.tstDigis.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/adduser")
public class AddUserServlet extends HttpServlet {

    private UserController userController;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        response.setContentType("text/html");
//        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();
        writer.append("<!DOCTYPE html>\r\n")
                .append("<html>\r\n")
                .append("<head>\r\n")
                .append("<title>Add new user</title>\r\n")
                .append("<head>\r\n")
                .append("<body>\r\n")
                .append("<form action = \"adduser\" method=\"post\">\r\n")
                .append("<input name=\"login\" type=\"text\" />\r\n")
                .append("<input name=\"fullName\" type=\"text\" />\r\n")
                .append("<input name=\"dateOfBirth\" type=\"text\" />\r\n")
                .append("<input name=\"gender\" type=\"text\" />\r\n")
                .append("<input type=\"submit\" value=\"Add\" />\r\n")
                .append("</form>\r\n")
                .append("</body>\r\n")
                .append("</html>\r\n");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");
        String fullName = request.getParameter("fullName");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String gender = request.getParameter(String.valueOf(Gender.class));

//        response.setContentType("text/html");
//        response.setCharacterEncoding("UTF-8");

        PrintWriter writer = response.getWriter();
        writer.append("<!DOCTYPE html>\r\n")
                .append("<html>\r\n")
                .append("<head>\r\n")
                .append("<title>Add new user</title>\r\n")
                .append("<head>\r\n")
                .append("<body>\r\n");
        if ((login != null && !login.trim().isEmpty()) ||
                (fullName !=null && !fullName.trim().isEmpty()) ||
                (dateOfBirth !=null && !dateOfBirth.trim().isEmpty()) ||
                (gender !=null && !gender.trim().isEmpty())) {
            writer.append("User successfully added\r\n");
        } else {
            writer.append("Check the input!\r\n");
            }
        writer.append("</body>\r\n")
                .append("</html>\r\n");

    }
}
