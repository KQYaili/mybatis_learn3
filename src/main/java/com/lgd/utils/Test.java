package com.lgd.utils;

import com.lgd.dao.MemberDAO;
import com.lgd.pojo.Member;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        MemberDAO memberDAO=MyBatisUtil.getMapper(MemberDAO.class);
        List<Member> members=memberDAO.searchMemberByNick("力");
        System.out.println(members);
    }
}
