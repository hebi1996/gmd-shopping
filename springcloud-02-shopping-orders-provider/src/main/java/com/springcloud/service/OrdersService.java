package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Orders;


public interface OrdersService {
	
	/**
	 *     	查询满足条件的订单信息
	 * @param orders
	 * @param pageNumber
	 * @return 成功返回com.github.pagehelper.PageInfo<orders>类型的实例
	 */
	public abstract PageInfo<Orders> selectOrders(Orders orders,Integer pageNumber);
	/**
	 * 	修改指定编号订单的订单状态
	 * @param orders 修改订单的信息
	 * @return 成功返回大于0的整数，否则返回小于等于0的整数
	 */
	
	public abstract Integer updateOrdersStatus(Orders orders);
	/**
	 * 	查询指定日期范围内的销售额
	 * @param orders
	 * @return java.util.List类型的实例，否则返回null
	 */
	public abstract List<Orders> selectGroup(Orders orders);

}
