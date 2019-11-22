package cn.Web.Servlet;

import cn.UserDomain.User;
import cn.UserService.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Copyright LiChen
 * 用户：biyang
 * 创建时间：2019/11/22
 * 18:06
 */
@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Service service=new Service();
        //在servlet中依赖service，把结果保存在request中，然后转发给页面显示。
        User user=service.find();
        request.setAttribute("user",user);
        request.getRequestDispatcher("/show.jsp").forward(request,response);
    }
}
