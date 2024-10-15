/* 
파일명: CarFactoryTest.java
작성자: 변성훈
작성일: 2024-10-15
내용: 싱글톤 패턴을 직접 실행해보는 코드
*/
public class CarFactoryTest {

    public static void main(String[] args) {
        System.out.println("hw6_1 : 변성훈");

        CarFactory factory = CarFactory.getInstance();    // 싱글톤 패턴
        Car myCar = factory.createCar();                // 메서드에서 Car 생성
        Car yourCar = factory.createCar();

        System.out.println(myCar.getCarNum());        // 10001 출력
        System.out.println(yourCar.getCarNum());        // 10002 출력
    }

}