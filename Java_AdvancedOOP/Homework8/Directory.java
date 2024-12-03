import java.util.ArrayList;
import java.util.List;

/*
파일명: Directory.java
작성자: 변성훈
작성일: 2024-12-03
내용: Composit 패턴에서 composit에 해당하는 클래스로 entries를 통해 composit과 leaf를 모두 담을 수 있다.
 */
public class Directory extends DirectoryFile {
    //// 수정 필요 구조
    private List<DirectoryFile> entries = new ArrayList<>(); // 제네릭을 사용하여 composit과 leaf 모두 담을 수 있음.

    public Directory(String name) {
        this.name = name;
    }

    //// 수정 필요  method
    public void addEntry(DirectoryFile entry) {
        entries.add(entry);
        entry.setDepth(depth + 1); // 다형성을 사용하여 클래스를 구분하는 부분 제거
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    //// 수정 필요  method
    public void removeEntry(DirectoryFile entry) { // Object 대신 Component 추상 클래스 사용
        entries.remove(entry);
    }

    public String getName() {
        return name;
    }

    //// 수정 필요  method
    public int getSize() {
        int size = 0;
        for (DirectoryFile entry : entries) { // 다형성을 사용하여 클래스를 구분하는 부분 제거
            size += entry.getSize();
        }
        return size;
    }

    //// 수정 필요  method
    public void print() {
        for (int i = 0; i < depth; i++)
            System.out.print("\t");
        System.out.println("[Directory] " + name + ", Size: " + getSize());

        for (DirectoryFile entry : entries) { // 다형성을 사용하여 클래스를 구분하는 부분 제거
            entry.print();
        }
    }
}
