package com.springcloud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.entity.Class1;
import com.springcloud.entity.Class2;
import com.springcloud.service.TypeService;
import com.springcloud.vo.ResultValue;

/**
 * 一级与二级类别的控制器
 * @author Administrator
 *
 */
@RestController
@RequestMapping("type")

public class TypeController {
	
	@Autowired
	private TypeService typeService;
	
	@RequestMapping(value="/selectAll")
	public ResultValue selectAll() {
		ResultValue rv = new ResultValue();
		try {
			//调用service 相应的方法查询所有一级类别的信息，并保存查询的结果
			List<Class1> allClass1 = this.typeService.selectAllClass1();
			//如果查询成功
			if(allClass1!=null && allClass1.size() > 0) {
				//设置结果的状态标记为0
				rv.setCode(0);
				//创建Map集合
				Map<String,Object> map = new HashMap<>();
				//将查询结果存入到Map集合中
				map.put("allClass1", allClass1);
				//将Map集合存入ResultValue对象中
				rv.setDataMap(map);
				//返回ResultValue对象
				return rv;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
		
	}
	@RequestMapping(value="/selectById")
	public ResultValue selectById(@RequestParam("class1Id") Integer class1Id) {
		ResultValue rv = new ResultValue();
		
		try {
			//调用service 相应的方法查询二级类别的信息，并保存查询的结果
			List<Class2> list = this.typeService.selectClass2ByClass1Id(class1Id);
			//如果查询成功
			if(list !=null && list.size() > 0) {
				//设置结果的状态标记为0
				rv.setCode(0);
				//创建Map集合
				Map<String,Object> map = new HashMap<>();
				//将查询结果存入到Map集合中
				map.put("Class2", list);
				//将Map集合存入ResultValue对象中
				rv.setDataMap(map);
				//返回ResultValue对象
				return rv;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rv;
		
	}

}
