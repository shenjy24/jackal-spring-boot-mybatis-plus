package com.jonas.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.jonas.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/06
 */
@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {

    List<User> selectMyPage(RowBounds rowBounds, @Param("ew") Wrapper<User> wrapper);
}
