/*
파일명: DirectoryFile.java
작성자: 변성훈
작성일: 2024-12-03
내용: Composit 패턴에서 Component의 역할을 하는 클래스로 leaf와 composit은 해당 추상 클래스를 상속받는다.
 */
public abstract class DirectoryFile {
    protected int depth = 0;
    protected String name;

    public abstract int getSize();

    public String getName() {
        return name;
    }

    public void print() {
    }

    public void addEntry(DirectoryFile entry) {
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void removeEntry(DirectoryFile entry) {
    }
}
