/*
파일명: Client.java
작성자: 변성훈
작성일: 2024-10-29
내용: Light 테스트 클래스
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("hw7_1 : 변성훈");
        Light light = new Light();
        light.on_button_pushed();
        light.on_button_pushed();
        light.on_button_pushed();
        light.off_button_pushed();
        light.on_button_pushed();
    }

}
