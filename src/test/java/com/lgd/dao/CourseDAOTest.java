package com.lgd.dao;

import com.lgd.pojo.Course;
import com.lgd.utils.MyBatisUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseDAOTest {

    @Test
    public void queryCourse() {
        CourseDAO courseDAO = MyBatisUtil.getMapper(CourseDAO.class);
        Course course = courseDAO.queryCourseById(1);
        System.out.println(course);
    }
}