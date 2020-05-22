package com.ict.edu01;

import java.util.LinkedList;

public class Ex10 {
public static void main(String[] args) {
	// Queue(큐) 인터페이스 : FIFO
	//			 구현클래스 : LinkedList
	LinkedList<String> list = new LinkedList<String>();
	
	// 추가, 삽입 : add, addFirst, addLast, offer,offerFirst, offerLast
	list.add("고길동");
	list.offer("도우너");
	list.addFirst("둘리");
	list.offerFirst("희동이");
	list.addLast("둘리");
	list.offerLast("희동이");
	System.out.println(list);
System.out.println("================================");
	// 검색
	if (list.contains("둘리")) {
		System.out.println(list.indexOf("둘리")+"번째 위치");
		System.out.println(list.lastIndexOf("둘리")+"번째 위치");
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	System.out.println(list.get(list.indexOf("둘리")));//둘리의 위치꺼내기
	
	// 삭제 : remove(Object), remove(index), removeFirst(), removeLast();
	list.removeFirst();
	list.remove("둘리");
	list.remove(2);
	list.removeLast();
	System.out.println(list);
	}
	
	// 출력
	for (String k : list) {
		System.out.println(k);
	}



}
}
