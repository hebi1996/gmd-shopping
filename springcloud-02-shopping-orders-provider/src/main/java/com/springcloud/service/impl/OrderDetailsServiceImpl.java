package com.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springcloud.dao.OrderDetailMapper;
import com.springcloud.entity.OrderDetail;
import com.springcloud.service.OrderDetailsService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService{
	@Autowired
	private OrderDetailMapper orderDetailMapper;
	@Override
	public PageInfo<OrderDetail> selectByOrderId(Integer orderId, Integer pageNUmber) {
		PageHelper.startPage(pageNUmber+1,5);
		List<OrderDetail> list = this.orderDetailMapper.selectByOrderId(orderId);
		
		return new PageInfo<>(list);
		
	}

}


