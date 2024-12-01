/*
파일명: ChicagoPizzaStore.java
작성자: 변성훈
작성일: 2024-11-28
내용: 팩토리 메서드 패턴에서 ConcreteCreator 역할을 담당하는 클래스로 ChicagoPizza를 생성하는 코드가 구현되어 있다.
 */
public class ChicagoPizzaStore extends PizzaStore {
    
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) { // 타입에 따라 다른 토핑을 올린 피자 생성
            pizza = new ChicagoCheesePizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        }
        return pizza;
    }
}
