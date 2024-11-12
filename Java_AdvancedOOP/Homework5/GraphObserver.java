/*
파일명: GraphObserver.java
작성자: 변성훈
작성일: 2024-11-12
내용: Subject의 number를 받아와 number만큼 *로 출력하는 옵저버
 */
public class GraphObserver implements Observer {
    public void update(Subject generator) {
        System.out.print("GraphObserver:");

        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }

        System.out.println("");
    }
}

/*
Observer 인터페이스를 구현한 구체적인 관찰자
관찰한 수를 ‘간단한 그래프’로 표시함
관찰한 숫자만큼의 ‘*‘를 출력
*/