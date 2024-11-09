/*
파일명: AddValueCommand.java
작성자: 변성훈
작성일: 2024-11-09
내용: 덧셈 연산을 위한 Command 클래스
*/

public class AddValueCommand implements Command {
    int x, y; // 덧셈 연산을 위한 피연산자 2개 정의
    
    public AddValueCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void execute() {
        System.out.printf("%d + %d = %d\n", x, y, x + y);
    }
}
