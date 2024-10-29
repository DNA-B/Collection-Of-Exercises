/*
파일명: Off.java
작성자: 변성훈
작성일: 2024-10-29
내용: Light가 Off 되었을 때의 동작을 정의한 클래스
 */
public class Off implements LightState {
    @Override
    public void on_button_pushed(Light light) { // Off일 때, On을 누르면 On 상태로 전환
        System.out.println("Light On!!");
        light.setState(new On());
    }

    @Override
    public void off_button_pushed(Light light) { // Off일 때, Off을 또 누르면 변화 X
        System.out.println("반응 없음");
    }
}
