package com.lgd.dao;

import com.lgd.pojo.Clazz;
import com.lgd.utils.MyBatisUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassDAOTest {

    @Test
    public void queryClass() {
        ClassDAO classDAO = MyBatisUtil.getMapper(ClassDAO.class);
        Clazz clazz = classDAO.queryClass(1);
        System.out.println(clazz);
    }
}