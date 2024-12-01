/*
파일명: PizzaStore.java
작성자: 변성훈
작성일: 2024-11-28
내용: 팩토리 메서드 패턴에서 Creator를 담당하는 클래스로
      createPizza라는 피자 생성 코드에 변화가 일어날 가능성이 크기 때문에
      해당 부분을 ConcreteCreator가 구현하게 한다.
 */
public abstract class PizzaStore {
    
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
    // Factory Method. 각 Store(ConcreteCreator)에서 구현 Factory Method로 구현해야 함
    public abstract Pizza createPizza(String type);
}
