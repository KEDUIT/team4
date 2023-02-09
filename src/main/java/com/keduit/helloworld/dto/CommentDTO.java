package com.keduit.helloworld.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {

	/** Board_comment 고유번호 pk */
	private Long boardCommentNum;
	
	/** member 테이블과 fk  */
	private Long boardNum;    // 맴버 테이블과 fk
	
	/** Board_comment 내용 */
	private String commentContent; 
	
	/** Board_comment 미리보기 사진 */
	private String viewpicture;
	
	/** Board_comment 가격 */
	private Long price;
	
	/** Board_comment 사진 */
	private String url;
	
	/** Board_comment 작성,수정 날짜 */
	private LocalDateTime regdate, updatedate; 
}
