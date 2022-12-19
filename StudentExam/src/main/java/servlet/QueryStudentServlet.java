package servlet;

import net.sf.json.JSONObject;
import pojo.PageInfo;
import pojo.Student;
import dao.StudentDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
@WebServlet({"/QueryStudentServlet"})
public class QueryStudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public QueryStudentServlet() {
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String sno = request.getParameter("sno");
        String uname = request.getParameter("userName");
        StudentDao sd = new StudentDao();

        try {
            List<Student> list = sd.queryListStudent(sno, uname);
            request.setAttribute("slist", list);
            request.setAttribute("sn", sno);
            request.setAttribute("uname", uname);
            RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
            dis.forward(request, response);
        } catch (Exception var8) {
            var8.printStackTrace();
        }

    }
}
