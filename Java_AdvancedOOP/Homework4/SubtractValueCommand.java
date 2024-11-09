/*
파일명: SubtractValueCommand.java
작성자: 변성훈
작성일: 2024-11-09
내용: 뺄셈 연산을 위한 Command 클래스
*/

public class SubtractValueCommand implements Command {
    int x, y; // 빼기 연산을 위한 피연산자 2개 정의
    
    public SubtractValueCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void execute() {
        System.out.printf("%d - %d = %d\n", x, y, x - y);
    }
}
