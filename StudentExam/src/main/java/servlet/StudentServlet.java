package servlet;

import pojo.Student;
import dao.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
@WebServlet({"/StudentServlet"})
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public StudentServlet() {
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String sno = request.getParameter("sno");
        Integer sn = Integer.parseInt(sno);
        String userName = request.getParameter("userName");
        String sex = request.getParameter("sex");
        Integer sx = Integer.parseInt(sex);
        String[] course = request.getParameterValues("course");
        HttpSession session = request.getSession();
        session.setAttribute("uname", userName);
        session.setAttribute("sx", sex);
        StudentDao sd = new StudentDao();
        Student student = new Student(sn, userName, sx, (String)null, (String)null, 1);

        try {
            sd.saveStudent(student);
            System.out.println(session.getId());
        } catch (Exception var13) {
            var13.printStackTrace();
        }

    }
}

