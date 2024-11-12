/*
파일명: DigitObserver.java
작성자: 변성훈
작성일: 2024-11-12
내용: Subject의 number를 받아와 number를 그대로 출력하는 옵저버
 */
public class DigitObserver implements Observer {
	  public void update(Subject generator) {
	    System.out.println("DigitObserver:" + generator.getNumber());

	  }
	}

/*
Observer 인터페이스를 구현한 구체적인 관찰자
관찰한 수를 ‘숫자’로 표시
*/