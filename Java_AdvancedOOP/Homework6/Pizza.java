/*
파일명: Pizza.java
작성자: 변성훈
작성일: 2024-11-22
내용: AbstractPizza의 concreteComponent로써 생성자에서는 자신의 필드를 초기화한다.
 */

class Pizza extends AbstractPizza {
    public Pizza(int size) {
        this.size = size;
        this.name = "피자";
        this.price = 20000;
    }
    
    @Override
    public int getPrice() { // 피자는 super의 함수 호출이 아닌 자기 자신의 필드값만 반환한다.
        return this.price;
    }
    
    @Override
    public String getName() { // // 피자는 super의 함수 호출이 아닌 자기 자신의 필드값만 반환한다.
        return this.name;
    }
}
