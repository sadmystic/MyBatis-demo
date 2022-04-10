package com.biu.mapper;

import com.biu.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();

    /*
    * 注解开发
    * */
    @Select("select * from tb_user where id = #(id) ")
    User selectByID(int id);
}
