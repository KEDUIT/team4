package com.keduit.helloworld.dto;

import java.time.LocalDateTime;
import java.util.Date;

import com.keduit.helloworld.Time;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO {

	/** 쪽지 쪽지번호 pk, nn, ai */
	private Long messageNum;
	
	/** 쪽지 받은사람 fk, nn */
	private Long memberGet;
	
	/** 쪽지 보낸사람 fk, nn */
	private Long memberGive;
	
	/** Board_comment 고유번호 fk */
	private Long boardCommentNum;
	
	/** 쪽지 제목 nn */
	private String title;
	
	/** 쪽지 내용 nn */
	private String content;

	/** 쪽지 보기권한 0:기본, 1:보낸사람이 삭제, 2:받은사람이 삭제, 3:모두 삭제 */
	private Long view;
	
	/** 쪽지 상대 닉네임 */
	private String nickname;

	/** 쪽지 사진 */
	private String url;
	
	/** 멤버 프로필 사진 */
	private String memUrl;
	
	/** 쪽지 등록날짜 */
	protected LocalDateTime regDate;
	
	/** 쪽지 수정날짜 */
	protected LocalDateTime updateDate;
	
//	/** n 분(시간/일)전 으로 표시 */
//	private String date;
//	
//	public String getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = Time.calculateTime(date);
//	}	
	
	
}
