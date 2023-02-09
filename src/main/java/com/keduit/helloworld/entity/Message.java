package com.keduit.helloworld.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class Message extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** Message 쪽지번호 pk, nn, ai */
	private Long messageNum;
	
	@Column(nullable = false) 
	/** Message 받은사람 fk, nn */
	private Long memberGet; //회원번호(멤버):받은사람 = 1:n

	@Column(nullable = false)
	/** Message 보낸사람 fk, nn */
	private Long memberGive; //회원번호(멤버):보낸사람 = 1:n
	
	@Column(length = 100, nullable = false)
	/** Message 제목 nn */
	private String title;
	
	@Column(length = 3000, nullable = false)
	/** Message 내용 nn */
	private String content;
	
	@Column
	/** Message 보기권한 */
	private Long view;
	
	@Column(length = 100)
	/** Message 사진 */
	private String url;

}
