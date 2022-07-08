package org.paldo.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class ShopProductDetailVO {

	private int productId;
	private int companyId;
	private String location;
	private int alcohol;
	private String productContent;
	private Date regDate;
	private Date lastUpdate;
	private List<ShopProductDetailVO> spDetailVO;
	
}
