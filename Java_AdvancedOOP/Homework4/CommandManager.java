import java.util.ArrayList;
import java.util.List;

/*
파일명: CommandManager.java
작성자: 변성훈
작성일: 2024-11-09
내용: 연산 command 들을 관리하는 클래스로 Invoker 역할. List에 연산 command들을 저장해두고 perfomrOperations를 통해 수행한다.
*/

public class CommandManager {
    List<Command> commands; // Command들을 저장하는 리스트
    
    public CommandManager() {
        this.commands = new ArrayList<Command>();
    }
    
    public void addOperation(Command command) {
        commands.add(command); // Command를 리스트에 저장
    }
    
    public void performOperations() {
        for (Command command : commands) { // 다형성을 사용해 리스트에 저장된 커맨드들을 실행
            command.execute();
        }
    }
}
