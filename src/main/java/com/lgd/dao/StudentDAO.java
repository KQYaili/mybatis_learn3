package com.lgd.dao;

import com.lgd.pojo.Student;

import java.util.List;

public interface StudentDAO {
//    public List<Student> listStudentsByCid(int cid);
    public Student queryStudentBySid(String sid);
    public List<Student> queryStudentsByCourseId(int courseId);
}
