package org.paldo.service;

import org.paldo.domain.ShopMemberVO;

public interface MemberService {

	public ShopMemberVO memberLogin(ShopMemberVO member) throws Exception;
}
