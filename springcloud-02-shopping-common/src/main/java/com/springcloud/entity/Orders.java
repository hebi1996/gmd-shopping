package com.springcloud.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private Integer orderId;
    
    private Users user;

    private Integer userId;
    /**
     * 	�ջ�������
     */
    private String consigneeName;
    /**
     * 	�ջ��˵绰
     */
    private String consigneeNumber;

    private String consigneeSite;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderTime;

    private Double orderAmount;
    /**
     * 	����״̬
     */

    private Integer orderStatus;
    /**
     * 	������ʼʱ��
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDateMin;
    /**
     * 	������ֹʱ��
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDateMax;
    /**
     * 	��ѯ��������ʼ����
     */
    private String startMonth;
    /**
     * 	��ѯ��������ֹ����
     */
    
    private String endMonth;
    /**
     * 	ͳ�ƽ��������
     */
    private String orderMonth;
    /**
     * 	ͳ�ƽ�������۶�
     */
    private Double orderPrice;
   
}