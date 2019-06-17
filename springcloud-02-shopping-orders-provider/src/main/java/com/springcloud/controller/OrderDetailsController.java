package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.entity.OrderDetail;
import com.springcloud.service.OrderDetailsService;
import com.springcloud.vo.ResultValue;

/**
 *  璁㈠崟鏄庣粏妯″潡鐨勬帶鍒跺眰
 * @author Administrator
 *
 */
@RestController
@RequestMapping("OrderDetail")

public class OrderDetailsController {
	@Autowired
	private OrderDetailsService orderDetailsService;
	
	@RequestMapping(value="/selectByOrderId")
	public ResultValue selectByOrderId(@RequestParam("orderId")Integer orderId,@RequestParam("pageNumber") Integer pageNumber) {
		ResultValue rv = new ResultValue();
		try {
			PageInfo<OrderDetail> pageInfo = this.orderDetailsService.selectByOrderId(orderId, pageNumber);
			List<OrderDetail> list = pageInfo.getList();
			if(list !=null && list.size() > 0) {
				rv.setCode(0);
				Map<String,Object> map = new HashMap<>();
				map.put("orderDetailsList", list);
				
				PageUtils pageUtils = new PageUtils(5,pageInfo.getPages()*5);
				pageUtils.setPageNumber(pageNumber);
				map.put("pageUtils", pageUtils);
				
				rv.setDataMap(map);
				return rv;
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("娌℃湁鎵惧埌婊¤冻鏉′欢鐨勮鍗曟槑缁嗕俊鎭�!!!");
		return rv;
		
	}

}
