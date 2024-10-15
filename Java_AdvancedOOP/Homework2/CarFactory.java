/*
파일명: CarFactory.java
작성자: 변성훈
작성일: 2024-10-15
내용: 자동차를 생산하는 싱글톤 패턴의 Factory 클래스
*/
public class CarFactory {
    private static CarFactory carFactory = null;
    private int carCount;

    private CarFactory() {
        this.carCount = 10000;
    }

    public synchronized static CarFactory getInstance() {
        if (carFactory == null) { // 만약 CarFactory가 만들어지지 않은 상황이라면
            carFactory = new CarFactory(); // CarFactory 객체를 생생한다.
        }
        return carFactory;
    }

    public Car createCar() {
        synchronized (this) { // carCount를 갱신하는 코드에 동시 접근할 수 없도록 동기화를 진행한다.
            carCount++; // 현재까지 만들어진 자동차의 개수를 증가시킨다.
            return new Car(carCount);
        }
    }
}
