package com.test.servlet;

import com.test.pojo.Admin;
import com.test.service.AdminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AddAdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        session.removeAttribute("mess");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Admin admin =new Admin();
        admin.setUsername(username);
        admin.setPassword(password);
        int i = AdminService.registerAdmin(admin);
        if (1==0){
            session.setAttribute("mess","注册失败");
            response.sendRedirect("registerAdmin.jsp");
        }else {
            session.setAttribute("mess","注册成功");
            response.sendRedirect("registerAdmin.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
