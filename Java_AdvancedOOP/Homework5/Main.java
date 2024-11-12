/*
파일명: Main.java
작성자: 변성훈
작성일: 2024-11-12
내용: Observer 패턴 테스트 클래스
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("hw9_1 : 변성훈");
        // Subject generator = new RandomGenerator();
        Subject generator = new IncrementGenerator(10, 40, 4);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}