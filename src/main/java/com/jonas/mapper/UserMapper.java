package com.jonas.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jonas.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/08/06
 */
@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {
}
