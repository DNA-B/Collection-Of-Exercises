/*
파일명: LightState.java
작성자: 변성훈
작성일: 2024-10-29
내용: Light의 상태와 동작을 정의한 인터페이스
 */
public interface LightState {
    public void on_button_pushed(Light light);
    public void off_button_pushed(Light light);
}
