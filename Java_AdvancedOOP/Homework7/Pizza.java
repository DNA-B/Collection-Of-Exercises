/*
파일명: Pizza.java
작성자: 변성훈
작성일: 2024-11-28
내용: 팩토리 메서드 패턴에서 Product를 담당하는 클래스이며, 피자의 정보와 조리를 진행한다.
 */
public class Pizza {
    String name;
    String dough;
    String sauce;
    
    public String getName() {
        return name;
    }
    
    public void prepare() {
        System.out.println("Preparing " + name);
    }
    
    public void bake() {
        System.out.println("Baking " + name);
    }
    
    public void cut() {
        System.out.println("Cutting " + name);
    }
    
    public void box() {
        System.out.println("Boxing " + name);
    }
    
    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        return display.toString();
    }
    
}
