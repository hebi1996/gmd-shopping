package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * GOODS表对应的实体类，用来保存表中一行数据
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
	/**
	 * 商品编号
	 */
    private Integer goodId;
    /**
	 * 商品姓名
	 */

    private String goodName;
    /**
	 * 商品价格
	 */

    private Double goodPrices;
    /**
	 * 商品折扣价
	 */

    private Double goodDiscount;
    /**
	 * 商品状态，0预售，1热卖中，2已下架
	 */

    private Integer goodStatus;
    /**
	 * 商品数量
	 */

    private Integer goodCount;
    /**
	 * 是否新品，0是新品，1不是新品
	 */

    private Integer goodIsNew;
    /**
	 * 是否热卖，0是热卖，1不是热卖
	 */

    private Integer goodIsHot;
    /**
	 * 商品等级
	 */

    private Integer goodLevel;
    /**
	 * 商品简介
	 */

    private String goodBrief;
    /**
	 * 商品详情
	 */

    private String goodDetails;
    /**
	 * 商品图片
	 */

    private String goodPhoto;
    /**
	 *类别二编号
	 */

    private Integer class2Id;
    
    /**
              * 商品下限
     */
    private Double goodsPriceMin;
    /**
             * 商品上限
     */
    private Double goodsPriceMax;
    /**
           * 查询条件：一级类别的编号
     */
    private Integer class1Id;
    /**
     * 		商品销量：用于保存销量的分组
     */
    private Integer goodSum;
    
    
}