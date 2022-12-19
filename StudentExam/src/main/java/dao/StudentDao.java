package dao;


import pojo.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public StudentDao() {
    }

    public void saveStudent(Student student) throws Exception {
        Connection con = JdbcUtils.createConnection();
        String sql = "insert into student values(?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, student.getSno());
        ps.setString(2, student.getsName());
        ps.setInt(3, student.getSsex());
        ps.setString(4, student.getsClass());
        ps.setString(5, student.getBirthday());
        ps.setInt(6, student.getTag());
        ps.execute();
        con.close();
    }

    public void removeStudent(Integer sno) throws Exception {
        Connection con = JdbcUtils.createConnection();
        String sql = "delete from student where sno=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, sno);
        ps.execute();
        con.close();
    }

    public void updateStudent(Student st) throws Exception {
        Connection con = JdbcUtils.createConnection();
        String sql = "update student set sname=? where sno=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, st.getsName());
        ps.setInt(2, st.getSno());
        ps.execute();
        con.close();
    }

    public List<Student> queryListStudent(String sn, String sname) throws Exception {
        Connection con = JdbcUtils.createConnection();
        int i = 1;
        String sql = "select * from student where 1=1 ";
        if (sn != null && !"".equals(sn)) {
            sql = sql + " and sno=? ";
        }

        if (sname != null && !"".equals(sname)) {
            sql = sql + " and sname=? ";
        }

        sql = sql + " limit 0,30";
        PreparedStatement pre = con.prepareStatement(sql);
        if (sn != null && !"".equals(sn)) {
            pre.setInt(i, Integer.parseInt(sn));
            ++i;
        }

        if (sname != null && !"".equals(sname)) {
            pre.setString(i, sname);
        }

        ResultSet res = pre.executeQuery();
        List<Student> list = new ArrayList();

        while(res.next()) {
            Integer sno = res.getInt(1);
            String sName = res.getString(2);
            int ssex = res.getInt(3);
            String sClass = res.getString(4);
            String birthday = res.getString(5);
            Integer tag = res.getInt(6);
            Student st = new Student(sno, sName, ssex, sClass, birthday, tag);
            list.add(st);
        }

        con.close();
        return list;
    }

    public void queryTotal() throws Exception {
        Connection con = JdbcUtils.createConnection();
        String sql = "select count(*) from student";
        PreparedStatement pre = con.prepareStatement(sql);
        ResultSet res = pre.executeQuery();
        if (res.next()) {
            int total = res.getInt(1);
            System.out.println(total);
        }

    }

    public Student queryStudentBySno(Integer sn) throws Exception {
        Connection con = JdbcUtils.createConnection();
        String sql = "select * from student where sno=?";
        PreparedStatement pre = con.prepareStatement(sql);
        pre.setInt(1, sn);
        ResultSet res = pre.executeQuery();
        Student st = null;
        if (res.next()) {
            Integer sno = res.getInt(1);
            String sName = res.getString(2);
            int ssex = res.getInt(3);
            String sClass = res.getString(4);
            String birthday = res.getString(5);
            Integer tag = res.getInt(6);
            st = new Student(sno, sName, ssex, sClass, birthday, tag);
        }

        con.close();
        return st;
    }
}

