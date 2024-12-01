/*
파일명: NYCheesePizza.java
작성자: 변성훈
작성일: 2024-11-28
내용: 팩토리 메서드 패턴에서 ConcreteProduct에 해당하며, NY 치즈 피자를 생성하는 클래스이다. 생성자에서 NY 치즈 피자에 대한 정보를 갱신한다.
 */
public class NYCheesePizza extends Pizza {
    
    public NYCheesePizza() {
        name = "NY Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
    }
}
