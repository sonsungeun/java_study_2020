package com.ict.edu01;

public class Ex01 {
	// 제네닉과 컬렉션(자료구조)
	// 제네닉 : 컬렉션이 어떤 객체들로 이루어졌는지를 표시하는 객체(클래스) 타입을 말한다.
	// 컬렉션 : 객체들을 모아서 관리하는 인터페이스들을 말함
	// API : <T> => 객체타입, <E> => 요소, 컬렉션 안에 존재하는 객체 하나를 뜻한다.
	//		 Map 형식 : <K,V> => Key(키값), Value(데이터값)
	//							 key와 value는 1:1대응,	** key를 호출하면 value가 나온다.
	// 형식 : 컬렉션<제네닉>
	
	// 최상위 컬렉션은 Collection<E>, Map<K,V>
	// Collection<E>을 상속받은 자식들 : Set<E>, List<E>, Queue<E>
	// Collection의 주요 메소드
	// add(E e) : boolean => 해당 컬렉션에 객체 추가, 성공하면 true, 실패하면 false
	//					  => 보통은 리턴값을 잘 받지 않는다.
	// addAll(Collection<? extends E> c) : boolean
	//	=> 특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가
	// clear() : void => 모든 요소 삭제
	// contains(Object o) : boolean => 해당 컬렉션에 인자로 들어온 객체가 존재하면 true, 존재하지 않으면 false
	// isEmpty() : boolean => 해당 컬렉션이 비어있으면 true, 비어있지 않으면 false
	// iterator() : Iterator<E> => 컬렉션 안에 존재하는 객체들을 순서대로 접근하기 위한 Iterator 객체를 반환
	//							   컬렉션 안에 존재하는 객체를 하나씩 꺼내서 작업할때(확인,출력,변경) 사용
	// remove(Object o) : boolean => 인자로 들어오는 객체 삭제, 성공하면 true, 실패하면 false
	// size : int => 컬렉션 안에 존재하는 객체의 수(for문에서 사용)
	// toArray() : Object[] => 컬렉션을 배열로 만들때 사용
	
}
