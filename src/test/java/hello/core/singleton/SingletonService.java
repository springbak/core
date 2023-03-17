package hello.core.singleton;

public class SingletonService {

    //static 영역에 객체를 딱 1개만 생성해둔다
    private static final SingletonService instance = new SingletonService();
//public 으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
    public static SingletonService getInstance(){
        return instance;
    }
    private SingletonService(){}//생성자를 private으로 만들어놓고 다른데서 new로 생성자 호출 불가하도록 방지

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
