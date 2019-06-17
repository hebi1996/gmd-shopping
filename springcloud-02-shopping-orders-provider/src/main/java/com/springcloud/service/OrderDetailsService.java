package com.springcloud.service;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.OrderDetail;

public interface OrderDetailsService {
	
	public abstract PageInfo<OrderDetail> selectByOrderId(Integer orderId,Integer pageNUmber);

}
