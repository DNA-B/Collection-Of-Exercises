/*
파일명: Main.java
작성자: 변성훈
작성일: 2024-11-09
내용: Command 패턴을 테스트하기 위한 클래스
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("hw8_1 : 변성훈");
        CommandManager mgr = new CommandManager();
        mgr.addOperation(new AddValueCommand(2, 3));
        mgr.addOperation(new SubtractValueCommand(2, 3));
        mgr.addOperation(new SquareValueCommand(3));
        // 추가된 산술 연산 실행
        mgr.performOperations();
    }
}
