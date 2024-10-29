/*
파일명: Light.java
작성자: 변성훈
작성일: 2024-10-29
내용: Light의 상태 변수와 전체적인 동작을 정의한 클래스
 */
public class Light {
    private LightState state; // 상태 변수

    public Light() {
        this.state = new Off(); // 초기 상태는 Off 상태
    }

    public void on_button_pushed() { // On 버튼 동작
        state.on_button_pushed(this);
    }

    public void off_button_pushed() { // Off 버튼 동작
        state.off_button_pushed(this);
    }

    public void setState(LightState state) { // 상태 변경 함수
        this.state = state;
    }
}
