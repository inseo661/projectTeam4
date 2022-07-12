package org.paldo.service;

import org.paldo.domain.ShopMemberVO;
import org.paldo.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class MemberServicempl implements MemberService {

	@Autowired
	private MemberMapper membermapper;
	
	@Override
	public ShopMemberVO memberLogin(ShopMemberVO member) throws Exception {
		// TODO Auto-generated method stub
		log.info(member);
		return membermapper.memberLogin(member);
	}

}
