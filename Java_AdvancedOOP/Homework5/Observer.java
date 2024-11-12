/*
파일명: Observer.java
작성자: 변성훈
작성일: 2024-11-12
내용: 옵저버 패턴에서 옵저버들이 상속받게 될 인터페이스
 */
public interface Observer {
	public abstract void update(Subject generator);
}


/*
관찰자를 표현하는 인터페이스
Java의 클래스 라이브러리에 있는 java.util.Observer와는 다르다
update(NumberGenerator)
NumberGenerator가 “나의 내용이 갱신되었습니다. 표시도 갱신해주세요”라고 관찰자에게 알려줄 때 호출하는 메소드
*/