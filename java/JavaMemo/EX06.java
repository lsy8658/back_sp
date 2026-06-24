package JavaMemo;

interface Shape {
    double calculateArea2();
}
class Square1 implements Shape {
    public double calculateArea2() {
        return 2.2222222222;
    }
} 
public class EX06 {
    private double s;
    
}

/*
    인터페이스 : 클래스를 작성할 때 기본이 되는 뼈대

    interface Shape 안에 적어둔 메서드는 눈에 보이지 않지만 
    자바가 자동으로 public으로 설정합니다. 최대로 개방해 둔 거죠.

    그런데 자식인 class Square1에서 구현할 때 앞에 아무것도 안 적으면 
    자바에서는 default라는 좁은 권한이 됩니다. (public > default)

    부모는 public(전체 공개)으로 열어놨는데, 자식이 default(우리끼리만 공개)로
    권한을 축소해 버렸기 때문에 자바가 "야, 권한 줄이지 마!" 하고 에러를 뿜는 겁니다.
*/