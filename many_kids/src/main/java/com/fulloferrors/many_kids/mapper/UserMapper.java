package com.fulloferrors.many_kids.mapper;

import com.fulloferrors.many_kids.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    @Results({
            @Result(property = "userId", column = "user_id"),
            @Result(property = "starId",column = "star_id"),
            @Result(property = "loginName", column = "login_name"),
            @Result(property = "loginPassword", column = "login_password"),
            @Result(property = "createDate", column = "create_date"),
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "userState", column = "user_state")
    })
    public List<User> getAllUser();

    @Insert("insert into user(login_name, login_password, create_time, nick_name, star_id, user_state) values(#{user.loginName},#{user.loginPassword},#{user.createTime},#{user.nickName}, #{user.starId}, #{user.userState})")
    public void registerUser(@Param("user") User user);

    @Select("select * from user where login_name=#{loginUser.loginName} and login_password=#{loginUser.loginPassword}")
    @Results({
            @Result(property = "userId", column = "user_id"),
            @Result(property = "starId",column = "star_id"),
            @Result(property = "loginName", column = "login_name"),
            @Result(property = "loginPassword", column = "login_password"),
            @Result(property = "createDate", column = "create_date"),
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "userState", column = "user_state")
    })
    public User loginUser(@Param("loginUser") User loginUser);
}
