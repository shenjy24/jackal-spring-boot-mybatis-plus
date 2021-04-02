package com.jonas.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jonas.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/06
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> listUser(@Param("startTime") Integer startTime);
}
