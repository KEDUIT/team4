package com.keduit.helloworld.repositoryTests;

import java.util.List;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.keduit.helloworld.dto.FavoritesDTO;
import com.keduit.helloworld.entity.Favorites;
import com.keduit.helloworld.entity.Member;
import com.keduit.helloworld.repository.FavoritesRepository;
import com.keduit.helloworld.repository.MemberRepository;

@SpringBootTest
public class FavoritesRepogitoryTests {

	@Autowired
	private FavoritesRepository favoritesRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Test
	public void insertTest() {
		Member member = new Member();
		
		IntStream.rangeClosed(1, 30).forEach(i->{
			
			int a = (int)(Math.random()*5)+1;
			int b = (int)(Math.random()*5)+1;
			
			Favorites entity = Favorites.builder().bookmarked(a)
												  .bookmarker(b).build();
			favoritesRepository.save(entity);
			
		});
	}
	@Test
	public void selectTest() {
		
		List<Member> member = memberRepository.getMemberMarker(3);

		
		for(Member i : member) {
			System.out.println(i.getId()+ " , " + i.getIntroduce());
			
		}
	}
	

	
}