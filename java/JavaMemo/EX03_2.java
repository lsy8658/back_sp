package JavaMemo;


class Parent {
    int x = 10;
    // Parent () {
    //     System.out.println(x);
    // }
    Parent (int y) {
         System.out.println(x);
        System.out.println(y);
    }
}

class Child extends Parent {
    int x = 20;
    Child () {
        super(50);
    }

    void show () {
        System.out.println(super.x);
    }
}

public class EX03_2 {
    public static void main (String[] args) {
        Child child = new Child();
        // child.show();
    }
}
/*
    this.x → 내 것(20)
    super.x → 부모 것(10)

    super는 생성자 안에서 작성해야하고
    자식에서 super()를 빈값으로 호출하면 부모 생성자를 호출한다.


    부모 생성자를 안 만들면, 자바가 자동으로 기본 생성자를 만들어줌.

    class Parent{
        Parent(int x){
            System.out.println(x);
        }
    }

    class Child extends Parent{
        Child(){
            super(10);
        }
    }

    new Child(); 하면 super(10)이 실행되고,
    부모의 Parent(int x)가 호출돼서 10 출력.

    즉 super(10) = "부모 생성자한테 10을 넘겨줘!" 🔥
    super는 "부모한테 가라"는 뜻이고, 뒤에 ()면 생성자, .x면 변수, .show()면 메서드라고 보면 된다. 🔥


    부모 생성자가 실행되니까 안에 있는 코드도 같이 실행돼.

    class Parent{
        Parent(int x){
            System.out.println("부모 실행");
        }
    }
    super(10);

    하면 "부모 실행" 출력됨.

    즉 super(10) = 부모 생성자 안의 코드 전부 실행.
*/
/*
    상속 특정 클래스의 기능을 재사용 및 확장 ( extends )']
    부모 클래스 1, 2
    자식 클래스 extends 부모 1, 2, 3 ( 새로운 기능 ) 이런식으로 사용한다는 얘기
    
    다형성 : 여러 형태로 동작할 수 있는 성질
    
    예를 들면 
    Animal a = new Dog();
    Animal b = new Cat();
    둘 다 Animal 타입이지만 실행되는 메서드는 Dog, Cat 기준이다.

    a.sound();

    변수 a는 Animal로 만들었지만 실제로 들어있는 건 Dog 객체임.
    그래서 sound()를 실행하면 Animal이 아니라 Dog의 sound()가 실행됨
    껍데기(변수명)는 Animal, 진짜 내용물은 Dog → 내용물을 따라간다. 🔥
*/