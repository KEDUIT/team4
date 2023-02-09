package com.keduit.helloworld.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Account extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** Account 거래내역번호 pk,nn,ai */
	private Long accountNum;
	
	@Column(nullable = false) 
	/** Account 구매회원(질문자) fk,nn */
	private Long memberBuyer; //회원번호(멤버):구매회원(질문자) = 1:n
	
	@Column(nullable = false) 
	/** Account 판매회원(답변자) fk,nn */
	private Long memberSeller; //회원번호(멤버):판매회원(답변자) = 1:n
	
	@Column(nullable = false)
	/** Account 거래금액 nn */
	private Long payment;

}
