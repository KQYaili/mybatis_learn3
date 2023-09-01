package com.lgd.dao;

import com.lgd.pojo.Member;
import com.lgd.pojo.MemberSearchCondition;
import com.lgd.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class MemberDAOTest {

    @Test
    public void searchMember() {
//        HashMap<String,Object> params=new HashMap<String,Object>();
//        params.put("gender","女");
//        params.put("minAge",18);
//        params.put("maxAge",23);
//        params.put("city","武汉");
//        MemberDAO memberDAO = MyBatisUtil.getMapper(MemberDAO.class);
//        List<Member> members = memberDAO.searchMember(params);
//        System.out.println(members);
        MemberSearchCondition params2=new MemberSearchCondition();
        params2.setGender("女");
//        params2.setMinAge(18);
        params2.setMaxAge(23);
        params2.setCity("武汉");
        MemberDAO memberDAO=MyBatisUtil.getMapper(MemberDAO.class);
        List<Member> members= memberDAO.searchMember(params2);
        System.out.println(members);
    }

    @Test
    public void searchMemberByCity() {
        List<String> cities=new ArrayList<String>();
        cities.add("厦门");
        cities.add("宜昌");
        MemberDAO memberDAO=MyBatisUtil.getMapper(MemberDAO.class);
        List<Member> members = memberDAO.searchMemberByCity(cities);
        System.out.println(members);
    }

    @Test
    public void searchMemberByNick() {
        MemberDAO memberDAO=MyBatisUtil.getMapper(MemberDAO.class);
        HashMap<String,Object> params=new HashMap<>();
        params.put("keyWord","力");
        List<Member> members = memberDAO.searchMemberByNick(params);
        System.out.println(members);
    }

    @Test
    public void testSearchMemberByNick() {
        MemberDAO memberDAO=MyBatisUtil.getMapper(MemberDAO.class);
        List<Member> members = memberDAO.searchMemberByNick("力");
        System.out.println(members);
    }

    @Test
    public void queryMemberById() {

        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        MemberDAO memberDAO = sqlSession.getMapper(MemberDAO.class);
        Member member = memberDAO.queryMemberById(1);
        System.out.println(member);
        memberDAO.updateMember(1,39);
        sqlSession.clearCache();

    }
}