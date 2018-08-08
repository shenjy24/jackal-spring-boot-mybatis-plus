package com.jonas.service.impl;

import com.jonas.entity.Order;
import com.jonas.mapper.OrderMapper;
import com.jonas.service.OrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Jonas
 * @since 2018-08-08
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
