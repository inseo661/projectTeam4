package org.paldo.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class ShopBoardVO {

	private int boardId;
	private String adminId;
	private String boardTitle;
	private String boardContent;
	private Date regDate;
	private Date lastUpdate;
	private List<ShopBoardVO> sboardVo;
}
