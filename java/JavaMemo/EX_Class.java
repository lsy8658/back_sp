package JavaMemo;



public class EX_Class {
    class Person {
        int age;
        Person(int age) {
            this.age = age;
        }

        void show () {
            System.out.println("Show!");
        }
    }

    class Student extends Person {
        Student (int age) {
            super(age);
            
        }
    }
   public static void main(String[] args) {

   }
}


/*
    인스턴스 변수 : 클래스 내에 선언된 변수
    클래스 변수 : 클래스 내에 static으로 선언된 변수
    - 클래스 변수는 객체를 만들 필요 없이 클래스 명으로 접근이 가능하다.

    인스턴스 메소드 : 클래스 내에 선언된 메소드
    클래스 메소드 : 클래스 내에 static으로 선언된 메소드

    class Person {
        static String name = "hello";
    }
    public static void main(String[] args) {
        System.out.println(Person.name);     
    } 

    ( static )
    class Person {
        static String name = "hello";
        public static void Hello () {
            System.out.println("name");
        }
    }
    public static void main(String[] args) {
        System.out.println(Person.name);
        Person.Hello();     
    }    
    
    “객체 만들 필요 없는 공통 기능/공통 데이터일 때 static 사용” ✔
    
    남발하면 안 되는 이유 확실히 있음.
    메모리 계속 유지됨 → 불필요하게 오래 잡아먹음
    객체지향 깨짐 → 상태 공유 때문에 코드 꼬이기 쉬움
    테스트/유지보수 어려움 → 전역 상태처럼 동작

    static은 프로그램 실행 시작 ~ 종료까지 계속 유지됨
    JVM이 클래스를 로딩할 때 메서드 영역에 올라가고
    프로그램 끝날 때까지 한 번만 생성되고 계속 살아있음

    ( 다형성 )
    여러 형태로 동작할 수 있는 성질
    
    class Person {}
    class Student extends Person {}


    Person person = new Person();
    Person Student = new Student();
*/