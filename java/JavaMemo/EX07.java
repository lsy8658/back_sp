package JavaMemo;

public class EX07 {
    public static void main(String[] args) {
        System.out.println(Integer.compare(20,20)); // 같으면 0 앞이크면 1 뒤가 크면 -1
    }
}

/*
    Wrapper class에는 
    int -> Interger
    char -> Character
    double -> Double
    long -> Long
    boolean -> Boolean

    
    System.out.println(Integer.toString(100));
    System.out.println(Integer.parseInt("10"));
    System.out.println(Integer.toBinaryString(10)); // 2진수로
    System.out.println(Integer.toHexString(255)); // 16진수

    System.out.println(Character.isDigit('w')); // 해당 문자가 숫자 형태인지 확인 ( 문자 1개만 받음 )
    Double.parseDouble("3.14") // 문자열을 진짜 실수 3.14로 변환.
    Boolean.parseBoolean("true") // 문자열 "true"를 진짜 논리값 true로 변환
    
    실무 필수 개념: 오토박싱 (Auto-boxing)
    
    개념: 매번 new Integer()로 감싸기 귀찮으므로, 자바가 자동으로 기본형과 객체형을 서로 바꿔주는 기능.

    실무 코드: Integer num = 10; 형태로 그냥 쓰면 알아서 객체로 포장됨. (실무에선 100% 이렇게 사용)
*/