/*
파일명: Sleeping.java
작성자: 변성훈
작성일: 2024-10-29
내용: Light가 On일 때, 다시 On하면 변화되는 취침등 모드
 */
public class Sleeping implements LightState {
    @Override
    public void on_button_pushed(Light light) { // Sleeping 모드 일 때, On을 누르면 On으로 다시 전환
        System.out.println("Light On Back!!");
        light.setState(new On());
    }

    @Override
    public void off_button_pushed(Light light) { // Sleeping 모드 일 때, Off를 누르면 Off 모드로 전환
        System.out.printf("Light Off!!");
        light.setState(new Off());
    }
}
