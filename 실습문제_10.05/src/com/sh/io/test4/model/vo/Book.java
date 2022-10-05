package com.sh.io.test4.model.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 객체클래스 (직렬화처리)
 */

public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	private String title; // 도서명
	private String author; // 저자
	private int price; // 가격
	private LocalDate dates; // Calendar? 

	public Book() {
		super();
	}

	public Book(String title, String author, int price, LocalDate dates) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getDates() {
		return dates;
	}

	public void setDates(LocalDate dates) {
		this.dates = dates;
	}

	@Override
	public String toString() { // 날짜에 포멧적용
		return "Book [title= " + title + ", author= " + author + ", price= " + price + 
				", dates= " + dates.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 출간")) + "]";
	}
	
	
	
}
