/*
파일명: File.java
작성자: 변성훈
작성일: 2024-12-03
내용: Composit 패턴에서 leaf에 해당하는 클래스
 */
public class File extends DirectoryFile{
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void print() {
        for (int i = 0; i < depth; i++)
            System.out.print("\t");
        System.out.println("[File] " + name + ", Size: " + size);
    }
}
