package servlet;

import dao.StudentDao;
import pojo.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/ToUpdateStudentServlet"})
public class ToUpdateStudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ToUpdateStudentServlet() {
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sno = request.getParameter("sno");
        Integer sn = Integer.parseInt(sno);
        StudentDao sd = new StudentDao();

        try {
            Student stu = sd.queryStudentBySno(sn);
            request.setAttribute("st", stu);
            RequestDispatcher dis = request.getRequestDispatcher("update.jsp");
            dis.forward(request, response);
        } catch (Exception var8) {
            var8.printStackTrace();
        }

    }
}
