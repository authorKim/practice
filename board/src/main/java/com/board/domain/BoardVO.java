package com.board.domain;

import java.util.Date;

public class BoardVO {
	
	/*  TBL_BOARD의 테이블 생성 SQL
	 
	CREATE TABLE TBL_BOARD
	(
	    BDNUM NUMBER(8) NOT NULL        -- 게시글넘버
	    , BDTITLE VARCHAR2(100) NOT NULL    -- 게시글제목
	    , CONTENT VARCHAR2(4000) NOT NULL       -- 게시글내용
	    , WRITER VARCHAR2(30) NOT NULL      -- 작성자
	    , REGDATE DATE NOT NULL     -- 등록날짜 
	    , HITCOUNT NUMBER(8) NOT NULL -- 조회수
	    ,CONSTRAINT PK_BOARD PRIMARY KEY(BDNUM) -- PK 설정
	);
	*/

	// 자료를 담는 변수
	private int bdNum;
	private String bdTitle;
	private String content;
	private String writer;
	private Date regDate;
	private int hitCount;
	
	
	// getter / setter 메소드
	public int getBdNum() {
		return bdNum;
	}
	public void setBdNum(int bdNum) {
		this.bdNum = bdNum;
	}
	public String getBdTitle() {
		return bdTitle;
	}
	public void setBdTitle(String bdTitle) {
		this.bdTitle = bdTitle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getHitCount() {
		return hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	

}
