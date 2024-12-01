/*
파일명: PizzaTestDrive.java
작성자: 변성훈
작성일: 2024-11-28
내용: 팩토리 메서드 패턴을 테스트하기 위한 클래스
 */

public class PizzaTestDrive {
    
    public static void main(String[] args) {
//        PizzaStore store = new PizzaStore();
//
//        Pizza pizza = store.orderPizza("cheese");
//        System.out.println("We ordered a " + pizza.getName() + "\n");
//
//
//        pizza = store.orderPizza("pepperoni");
//        System.out.println("We ordered a " + pizza.getName() + "\n");
        
        System.out.println("hw12_1 : 변성훈\n");
        
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("we ordered a " + pizza.getName() + "\n");
        
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("we ordered a " + pizza.getName() + "\n");
        
        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("we ordered a " + pizza.getName() + "\n");
        
        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("we ordered a " + pizza.getName() + "\n");
        
    }
    
}
