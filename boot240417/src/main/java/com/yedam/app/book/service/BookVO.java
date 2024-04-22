package com.yedam.app.book.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
//@Data 기능 이해하면서 사용하기. @Getter @Setter 등등 별개로 빼서 사용하기도 함.
public class BookVO {
	private int bookNo;
	private String bookName;
	private String bookCoverimg;
	// 날짜포맷은 한가지만 사용가능.
	// 기존 자바유틸 포맷을 사용할경우 DateTimeFormat 어노테이션 삭제해야함.
	// insert.html에 날짜입력 타입이 똑같이 따라가줘야 한다.
	@DateTimeFormat(pattern="yyyy-MM-dd")	
	private Date bookDate;					
	private int bookPrice;
	private String bookPublisher;
	private String bookInfo;
	
	private int rentCount;
	private int rentTotalPrice;
	
}
