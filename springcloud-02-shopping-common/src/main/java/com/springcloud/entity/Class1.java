package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CLASS1表对应的实体类
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class1 {
	/**
	 * 类别一编号
	 */
    private Integer class1Id;
    /**
	 * 类别一姓名
	 */

    private String class1Name;
    /**
	 * 类别一序号
	 * 
	 */

    private Integer class1Num;
    /**
	 * 备注
	 */

    private String remark;

   
}