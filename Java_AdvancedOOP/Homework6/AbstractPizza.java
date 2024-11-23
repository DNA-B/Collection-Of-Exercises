/*
파일명: AbstractPizza.java
작성자: 변성훈
작성일: 2024-11-22
내용: Pizza와 ToppingDecorator를 위한 추상 클래스이다.
 */

public abstract class AbstractPizza {
    int size;
    int price;
    String name;
    
    public int getSize() { // size는 피자에서만 사용하므로 default 함수로 구현
        return this.size;
    }
    
    public abstract int getPrice(); // pizza와 decorator의 구현이 서로 다르므로 abstract로 구현
    
    public abstract String getName(); // pizza와 decorator의 구현이 서로 다르므로 abstract로 구현
}
