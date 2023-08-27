package com.lgd.dao;

import com.lgd.pojo.Student;
import com.lgd.utils.MyBatisUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDAOTest {

    @Test
    public void queryStudentBySid() {
        StudentDAO studentDAO = MyBatisUtil.getMapper(StudentDAO.class);
        Student student = studentDAO.queryStudentBySid("10001");
        System.out.println(student);
    }
}