/*
파일명: On.java
작성자: 변성훈
작성일: 2024-10-29
내용: Light가 On 되었을 때의 동작을 정의한 클래스
 */
public class On implements LightState {
    @Override
    public void on_button_pushed(Light light) { // On일 때, 또 On을 누르면 취침등으로 전황
        System.out.println("취침등 상태");
        light.setState(new Sleeping());
    }

    @Override
    public void off_button_pushed(Light light) { // On일 때, Off를 누르면 Off 상태로 전환
        System.out.println("Light Off!!");
        light.setState(new Off());
    }
}
