import java.util.ArrayList;

/*
파일명: MainUsingPizza.java
작성자: 변성훈
작성일: 2024-11-22
내용: 데코레이터 패턴 테스트 클래스
 */

class MainUsingPizza {
    public static void main(String[] args) {
        System.out.println("hw10_1 : 변성훈");
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Pepperoni");
        list.add("Cheese");

//        SelectToppingPizza pizza = new SelectToppingPizza(15); // 완성 후 아래 코드 실행
        AbstractPizza pizza = new Pizza(15);
        
        
        for (String topping : list) {
//            pizza.addTopping(topping);  // 완성 후 아래 코드 실행
            if (topping.equals("Cheese")) {
                pizza = new CheeseToppingDecorator(pizza);
            }
            else if (topping.equals("Pepperoni")) {
                pizza = new PepperoniToppingDecorator(pizza);
            }
        }
        
        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
    }
}
