package com.jonas.mapper.db1;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jonas.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/06
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> selectMyPage(RowBounds rowBounds, @Param("ew") Wrapper<User> wrapper);

//    @Select("SELECT * FROM user where ctime > #{startTime}")
    List<User> listUser(@Param("startTime") Integer startTime);
}
