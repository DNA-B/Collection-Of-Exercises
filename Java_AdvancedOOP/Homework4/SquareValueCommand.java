/*
파일명: SquareValueCommand.java
작성자: 변성훈
작성일: 2024-11-09
내용: 제곱 연산을 위한 Command 클래스
*/

public class SquareValueCommand implements Command {
    int x; // 제곱 연산을 위한 피연산자. 제곱이므로 피연산자는 1개만 정의
    
    public SquareValueCommand(int x) {
        this.x = x;
    }
    
    @Override
    public void execute() {
        System.out.printf("pow(%d, 2) = %d\n", this.x, x * x);
    }
}
