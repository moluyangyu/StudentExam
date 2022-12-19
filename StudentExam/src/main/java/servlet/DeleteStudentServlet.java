package servlet;

import dao.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/DeleteStudentServlet"})
public class DeleteStudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DeleteStudentServlet() {
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sno = request.getParameter("sno");
        StudentDao sd = new StudentDao();
        Integer sn = Integer.parseInt(sno);

        try {
            sd.removeStudent(sn);
            response.sendRedirect("QueryStudentServlet");
        } catch (Exception var7) {
            var7.printStackTrace();
        }

    }
}