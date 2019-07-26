package com.test.servlet;

import com.test.pojo.Admin;
import com.test.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        HashMap hashMap = new HashMap();
        LoginService ls = new LoginService();
        String loginName = req.getParameter("loginName");
        String loginPwd = req.getParameter("loginPwd");
        hashMap.put("username", loginName);
        hashMap.put("password", loginPwd);
        Admin ad = ls.login(hashMap);
        if (ad != null) {
            session.setAttribute("adminName", loginName);
            session.setAttribute("adminPwd", loginPwd);
            resp.sendRedirect("admin.jsp");
        } else {
            req.setAttribute("loginMes", "�˺Ż����벻��ȷ");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }
}
