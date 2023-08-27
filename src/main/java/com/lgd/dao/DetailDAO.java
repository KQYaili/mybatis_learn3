package com.lgd.dao;

import com.lgd.pojo.Detail;

public interface DetailDAO {
    public int insertDetail(Detail detail);
    public Detail queryDetailByUid(int uid);
}
