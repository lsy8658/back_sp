package JavaMemo;

class Person {
    public void introduce () {
        System.out.println("사람입니다.");
    }
    public void introduce (String text) {
        System.out.println("사람입니다." + text);
    }
}


public class EX03 {
    
    public static void main(String[] args) {
        Person ps = new Person();   

        ps.introduce();
        ps.introduce("안녕하세요");
    }
    
}


/*

    class Person {
    public void introduce () {
        System.out.println("사람입니다.");
    }

    }

    class Child extends Person {
        public void introduce () {
            System.out.println("자식입니다.");
        }
    }

    메소드 오버라이딩  : 같은 이름의 메소드를 자식 클래스에서 재 정의하여 사용하는 것    


    class Person {
        public void introduce () {
            System.out.println("사람입니다.");
        }
        public void introduce (String text) {
            System.out.println("사람입니다." + text);
        }
    }

    이런게 오버로딩 : 같은 메소드 명을 사용하지만 전달 값이 다르다.
*/