package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CLASS1���Ӧ��ʵ����
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class1 {
	/**
	 * ���һ���
	 */
    private Integer class1Id;
    /**
	 * ���һ����
	 */

    private String class1Name;
    /**
	 * ���һ���
	 * 
	 */

    private Integer class1Num;
    /**
	 * ��ע
	 */

    private String remark;

   
}