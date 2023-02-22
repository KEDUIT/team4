package com.keduit.helloworld.serviceImpl;

import java.util.Optional;

import com.keduit.helloworld.entity.MemberAccount;
import com.keduit.helloworld.repository.MemberAccountRepository;
import org.springframework.stereotype.Service;

import com.keduit.helloworld.entity.Member;
import com.keduit.helloworld.repository.MemberRepository;
import com.keduit.helloworld.service.PointPayService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class PointPayServiceImpl implements PointPayService {
	
	private final MemberRepository memberRepository;
	private final MemberAccountRepository memberAccountRepository;
	
	@Override
	public void modify(Long myNum, Long yourNum, Long payment) {
		Optional<Member> myResult = memberRepository.findById(myNum);
		Optional<Member> yourResult = memberRepository.findById(yourNum);

		if(myResult.isPresent() && yourResult.isPresent()){
			Member myMem = myResult.get();
			Member yourMem = yourResult.get();

			myMem.changePoint(-payment);
			yourMem.changePoint(payment);

			MemberAccount memberAccount = MemberAccount
					.builder()
					.memberBuyer(myNum)
					.memberSeller(yourNum)
					.payment(payment)
					.build();

			memberRepository.save(myMem);
			memberRepository.save(yourMem);
			memberAccountRepository.save(memberAccount);
		}
	}




}
