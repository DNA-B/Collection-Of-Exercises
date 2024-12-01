/*
파일명: NYPepperoniPizza.java
작성자: 변성훈
작성일: 2024-11-28
내용: 팩토리 메서드 패턴에서 ConcreteProduct에 해당하며, NY 페퍼로니 피자를 생성하는 클래스이다. 생성자에서 NY 페퍼로니 피자에 대한 정보를 갱신한다.
 */
public class NYPepperoniPizza extends Pizza {
    
    public NYPepperoniPizza() {
        name = "NY Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
    }
}