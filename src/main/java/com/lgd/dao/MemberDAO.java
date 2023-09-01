package com.lgd.dao;

import com.lgd.pojo.Member;
import com.lgd.pojo.MemberSearchCondition;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface MemberDAO {
    public List<Member> searchMember(HashMap<String,Object> params);
    public List<Member> searchMember(Member member);
    public List<Member> searchMember(MemberSearchCondition params);
    public List<Member> searchMemberByCity(List<String> cities);
    public List<Member> searchMemberByNick(HashMap params);
    public List<Member> searchMemberByNick(@Param("keyWord")String keyWord);
    public Member queryMemberById(int mid);
    public Member updateMember(@Param("mid") int mid,@Param("age") int age);
}
