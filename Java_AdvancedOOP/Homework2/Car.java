/*
파일명: Car.java
작성자: 변성훈
작성일: 2024-10-15
내용: 자동차 클래스, 각 자동차는 고유 번호인 carNum을 가지고 있다.
*/
public class Car {
    private int carNum;

    public Car(int carNum) {
        // CarFactory에서 현재까지 몇 개의 자동차가 만들어졌는지 count값을 받아와서 고유 번호를 갱신한다.
        this.carNum = carNum;
    }

    public int getCarNum() {
        return this.carNum; // 객체의 고유 번호를 반환한다.
    }
}
