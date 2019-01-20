package org.soo.persistence;

import org.soo.domain.MemberVO;;

public interface MemberDAO {
	
	public String getTime();
	
	public void insertMember(MemberVO vo);
}
