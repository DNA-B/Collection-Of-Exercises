/*
파일명: ToppingDecorator.java
작성자: 변성훈
작성일: 2024-11-22
내용: 토핑을 여러 개 추가하기 위한 데코레이터 추상 클래스
 */

public abstract class ToppingDecorator extends AbstractPizza {
    AbstractPizza pizza;
    
    public ToppingDecorator(AbstractPizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public int getSize() { // 현재 저장된 피자의 사이즈 반환
        return pizza.getSize();
    }
    
    @Override
    public String getName() { // 현재 저장된 피자의 이름 반환
        return pizza.getName();
    }
    
    @Override
    public int getPrice() { // 현재 저장된 피자의 가격 반환
        return pizza.getPrice();
    }
}
