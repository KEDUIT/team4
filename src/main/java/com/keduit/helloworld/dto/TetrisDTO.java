package com.keduit.helloworld.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TetrisDTO {

	private Long tno;
	
	private Long memberNum;
	
	private Long score;
	
	private String url;
	
	private String nickname;
}