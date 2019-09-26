package com.enjoy.dao;

import org.apache.ibatis.annotations.Param;

import com.enjoy.model.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    Users findByUsernameAndPasswd(@Param("username") String username, @Param("passwd") String passwd);
}