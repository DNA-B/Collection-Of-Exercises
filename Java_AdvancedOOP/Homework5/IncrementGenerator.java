/*
파일명: IncrementGenerator.java
작성자: 변성훈
작성일: 2024-11-12
내용: 옵저버 패턴에서 ConcreteSubject 중 하나로써 값이 일정 수만큼 점점 증가하면서 옵저버들에게 notify를 진행한다.
 */
public class IncrementGenerator extends Subject {
    int start, end, count;
    int number;

    public IncrementGenerator(int start, int end, int count) {
        this.start = start;
        this.end = end;
        this.count = count;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void execute() {
        for (int i = start; i <= end; i += count) { // start ~ end까지 count만큼 값을 증가시킨다. 이 때 값이 변경될 때마다 옵저버에게 notify한다.
            this.number = i;
            super.notifyObservers();
        }
    }
}
