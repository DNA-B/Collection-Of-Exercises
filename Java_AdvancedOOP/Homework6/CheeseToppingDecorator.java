/*
파일명: CheeseToppingDecorator.java
작성자: 변성훈
작성일: 2024-11-22
내용: ToppingDecorator를 구현한 ConcreteDecorator로 치즈 토핑을 올리는 역할을 수행한다.
 */

public class CheeseToppingDecorator extends ToppingDecorator {
    public CheeseToppingDecorator(AbstractPizza pizza) {
        super(pizza); // 토핑을 추가하고 나서 super의 pizza 갱신
    }
    
    @Override
    public int getPrice() {
        return ToppingsPrice.CHEESE + super.getPrice(); // 현재 super에 들어 있는 AbstractPizza의 가격에 토핑 가격 더하기
    }
    
    @Override
    public String getName() {
        return "치즈 " + super.getName(); // 현재 super에 들어 있는 AbstractPizza의 이름 앞에 토핑 이름 붙이기
    }
}
