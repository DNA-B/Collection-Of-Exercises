import java.util.Random;

/*
파일명: RandomGenerator.java
작성자: 변성훈
작성일: 2024-11-12
내용: 랜덤하게 number를 생성해내는 ConcreteSubject로써 값이 랜덤하게 생설될 때마다 옵저버들에게 notify한다.
 */
public class RandomGenerator extends Subject {
    private Random random = new Random();
    private int number;

    public int getNumber() {
        return number;
    }

    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}

/*
Subject의 하위 클래스
난수를 생성한다
java.util.Random 클래스 이용
number 필드: 생성된 난수를 저장하는 변수
getNumber(): number 필드의 값을 반환함
execute():
0~49까지의 난수 20개를 생성하고, 그 때마다 notifyObservers를 호출하여, 관찰자들에게 통지한다
Random 클래스의 nextInt() 이용
*/