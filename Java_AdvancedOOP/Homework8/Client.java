/*
파일명: Client.java
작성자: 변성훈
작성일: 2024-12-03
내용: Composit 패턴을 테스트하기 위한 클래스
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("hw14_1 : 변성훈\n");

        DirectoryFile dir1 = new Directory("root");
        DirectoryFile dir2 = new Directory("Dir1");

        DirectoryFile f1 = new File("f1", 100);
        DirectoryFile f2 = new File("f2", 200);
        DirectoryFile f3 = new File("f3", 300);
        DirectoryFile f4 = new File("f4", 400);

        dir1.addEntry(f1);
        dir1.addEntry(dir2);
        dir2.addEntry(f2);
        dir2.addEntry(f3);
        dir1.addEntry(f4);

        dir1.print();
    }
}
