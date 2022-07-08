package org.paldo.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class ShopProductVO {

	private int productId;
	private int companyId;
	private String productName;
	private int stock;
	private int price;
	private int discount;
	private int lastPrice;
	private Date regDate;
	private Date lastUpdate;
	private List<ShopProductVO> sProductVO;
	
}
