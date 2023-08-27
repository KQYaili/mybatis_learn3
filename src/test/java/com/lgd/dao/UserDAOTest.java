package com.lgd.dao;

import com.lgd.pojo.Detail;
import com.lgd.pojo.User;
import com.lgd.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDAOTest {

    @Test
    public void insertUser() {

        Detail detail=new Detail(0,"尽快回传咋说","12345688921","签名",0);
        User user=new User(0,"sdcsd","32432","zcaz","04.jpg",detail);
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try {
            UserDAO userDAO= sqlSession.getMapper(UserDAO.class);
            userDAO.insertUser(user);
            detail.setUserId(user.getUserId());
            DetailDAO detailDAO = sqlSession.getMapper(DetailDAO.class);
            int j=detailDAO.insertDetail(detail);
            System.out.println(j);
            sqlSession.commit();

        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }
    }
    @Test
    public void testQueryUser(){
        UserDAO userDAO=MyBatisUtil.getMapper(UserDAO.class);
        User user=userDAO.queryUser("wangwu");
        System.out.println(user);
    }
}