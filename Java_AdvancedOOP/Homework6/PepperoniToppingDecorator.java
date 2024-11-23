/*
파일명: PepperoniToppingDecorator.java
작성자: 변성훈
작성일: 2024-11-22
내용: ToppingDecorator를 구현한 ConcreteDecorator로 치즈 토핑을 올리는 역할을 수행한다.
 */

public class PepperoniToppingDecorator extends ToppingDecorator {
    public PepperoniToppingDecorator(AbstractPizza pizza) {
        super(pizza); // 이전의 피자를 super의 pizza로 갱신
    }
    
    @Override
    public int getPrice() {
        return ToppingsPrice.PEPPERONI + super.getPrice(); // 이전에 들어 있던 AbstractPizza의 가격에 토핑 가격 더하기
    }
    
    @Override
    public String getName() {
        return "페퍼로니 " + super.getName(); // 이전에 들어 있던 AbstractPizza의 이름 앞에 토핑 이름 붙이기
    }
}
