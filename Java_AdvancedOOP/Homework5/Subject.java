import java.util.ArrayList;
import java.util.Iterator;

/*
파일명: Subject.java
작성자: 변성훈
작성일: 2024-11-12
내용: 옵저버 패턴에서 ConcreteSubject가 상속받게 될 추상클래스
 */
public abstract class Subject {
    private ArrayList observers = new ArrayList();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer) it.next();
            o.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}


/*
 * 수를 생성하는 추상 클래스
execute(), getNumber(): 각각 수를 취득하고 생성하는 추상 메소드
observers 필드: NumberGenerator를 관찰하고 있는 Observer들을 보관하고 있는 필드
addObserver(Observer)
Observer를 추가할 때 호출하는 메소드
deleteObserver(Observer)
Observer를 삭제할 때 호출하는 메소드
notifyObservers()
Observer 전원에게, “나의 내용이 갱신되었기 때문에 당신의 표시도 갱신해주세요”라고 알려주는 메소드
Observer들의 update(this) 메소드를 차례차례 호출한다
*/