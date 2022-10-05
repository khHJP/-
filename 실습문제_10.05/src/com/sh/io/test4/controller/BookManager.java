package com.sh.io.test4.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Scanner;

import com.sh.io.test4.model.vo.Book;

public class BookManager {

	Scanner sc = new Scanner(System.in);
	File file = new File("books.dat"); // File객체 필드로 선언
	
	public BookManager() {}
	
	public void fileSave() {
		// 1. Book 객체 배열 선언, 5개 초기화함 //샘플데이터 임의 작성
		// public Book(String title, String author, int price, LocalDate dates)
		Book[] book = {
				new Book("Java의 정석", "남궁성", 30_000, LocalDate.of(2016, 1, 28)),
				new Book("Do it! 점프 투 파이썬", "박응용", 18_800, LocalDate.of(2019, 6, 20)),
				new Book("비전공자를 위한 이해할 수 있는 IT지식", "최원영", 16_800, LocalDate.of(2020, 7, 14)),
				new Book("모던 자바스크립트 Deep Dive", "이웅모", 45_000, LocalDate.of(2020, 9, 25)), // 09 outofrange?? 
				new Book("Clean Code", "로버트 C. 마틴", 33_000, LocalDate.of(2013, 12, 24))
		};
		
		// 2. "books.dat" 파일에 객체 기록 저장함 -> 저장 = 객체를 파일에 출력?
		// 3. try with resource 문 사용할 것
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){
			oos.writeObject(book);
			
		// 4. "books.dat 에 저장 완료!" 출력	
			System.out.println(file.getName() + "에 저장 완료!");
			
		} catch (IOException e) { // FileNotFoundException 상위
			e.printStackTrace();
		}
	}
	
	
	public void fileRead() {
		
		// 4. try with resource 문 사용할 것
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))){


				
				// 1. Book 객체 배열 선언 	// 2. "books.dat" 파일에서 데이터 읽어서 배열에 저장함
				Book[] book2 = (Book[]) ois.readObject(); // ois.readObject로 읽어온 객체는 Book[] 형식이기 때문에 형변환 가능 
				// ClassNotFoundException 발생
				
				// 3. 객체 정보를 화면에 출력함
				for(Book book : book2) {
					System.out.println(book);
				}
			    // 5. "books.dat 읽기 완료!" 출력
				System.out.println(file.getName() + "읽기 완료!");
		
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
				
	}
	
}
