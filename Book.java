package com.sh.oop.book.model;

public class Book {

	// 필드
	private String title;
	private int price;
	private double discountRate;
	private String author; 
	
	// 생성자
	// 기본
	public Book() {}
	
	// 4개
	public Book(String title, int price, double discountRate, String author) {
		this.title = title; 
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	// setter getter
	public String getTitle() {
		return title; 
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getDiscountRate() {
		return discountRate; 
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author; 
	}
	
	// 메소드
	public void bookInformation() {
		System.out.printf("%s  %d  %.1f  %s\n", title, price, discountRate, author);
	}
	
}
