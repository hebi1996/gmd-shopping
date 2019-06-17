package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Orders;


public interface OrdersService {
	
	/**
	 *     	��ѯ���������Ķ�����Ϣ
	 * @param orders
	 * @param pageNumber
	 * @return �ɹ�����com.github.pagehelper.PageInfo<orders>���͵�ʵ��
	 */
	public abstract PageInfo<Orders> selectOrders(Orders orders,Integer pageNumber);
	/**
	 * 	�޸�ָ����Ŷ����Ķ���״̬
	 * @param orders �޸Ķ�������Ϣ
	 * @return �ɹ����ش���0�����������򷵻�С�ڵ���0������
	 */
	
	public abstract Integer updateOrdersStatus(Orders orders);
	/**
	 * 	��ѯָ�����ڷ�Χ�ڵ����۶�
	 * @param orders
	 * @return java.util.List���͵�ʵ�������򷵻�null
	 */
	public abstract List<Orders> selectGroup(Orders orders);

}
