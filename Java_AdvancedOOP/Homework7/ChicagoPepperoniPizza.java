/*
파일명: ChicagoPepperoniPizza.java
작성자: 변성훈
작성일: 2024-11-28
내용: 팩토리 메서드 패턴에서 ConcreteProduct에 해당하며, 시카고 페퍼로니 피자를 생성하는 클래스이다. 생성자에서 시카고 페퍼로니 피자에 대한 정보를 갱신한다.
 */
public class ChicagoPepperoniPizza extends Pizza {
    
    public ChicagoPepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        
    }
    
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
    
}
