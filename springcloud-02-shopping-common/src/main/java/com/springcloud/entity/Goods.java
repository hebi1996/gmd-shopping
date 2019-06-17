package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * GOODS���Ӧ��ʵ���࣬�����������һ������
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
	/**
	 * ��Ʒ���
	 */
    private Integer goodId;
    /**
	 * ��Ʒ����
	 */

    private String goodName;
    /**
	 * ��Ʒ�۸�
	 */

    private Double goodPrices;
    /**
	 * ��Ʒ�ۿۼ�
	 */

    private Double goodDiscount;
    /**
	 * ��Ʒ״̬��0Ԥ�ۣ�1�����У�2���¼�
	 */

    private Integer goodStatus;
    /**
	 * ��Ʒ����
	 */

    private Integer goodCount;
    /**
	 * �Ƿ���Ʒ��0����Ʒ��1������Ʒ
	 */

    private Integer goodIsNew;
    /**
	 * �Ƿ�������0��������1��������
	 */

    private Integer goodIsHot;
    /**
	 * ��Ʒ�ȼ�
	 */

    private Integer goodLevel;
    /**
	 * ��Ʒ���
	 */

    private String goodBrief;
    /**
	 * ��Ʒ����
	 */

    private String goodDetails;
    /**
	 * ��ƷͼƬ
	 */

    private String goodPhoto;
    /**
	 *�������
	 */

    private Integer class2Id;
    
    /**
              * ��Ʒ����
     */
    private Double goodsPriceMin;
    /**
             * ��Ʒ����
     */
    private Double goodsPriceMax;
    /**
           * ��ѯ������һ�����ı��
     */
    private Integer class1Id;
    /**
     * 		��Ʒ���������ڱ��������ķ���
     */
    private Integer goodSum;
    
    
}