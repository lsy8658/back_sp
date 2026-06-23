package JavaMemo;

public class EX01 {
   public static void main (String[] args) {
        // 기본 자료형
        int a = 10;
        int b = 20;
        a = b;  // → 값 자체를 복사
      
        // 참조 자료형
        String c = "사과";
        String d = "바나나";
        c = d; // → 객체의 참조값(주소 정보)을 복사 따라서 
        // c와 d는 같은 "바나나" 객체를 참조하게 된다.
 

        // 2 ) 형변환

        int score = 93;
        float score_f = score; // 생략 가능
        double score_d = score_f; // 생략 가능
        
        // 이렇게 생략 가능한걸 묵시적 형변환이라고 한다.

        double score_d2 = 98.8;
        int score_2 = (int)score_d2; // 생략 불가능
        
        // 이렇게 생략이 불가능한걸 명시적 형변환이라고 한다.


        // 3 ) 문자열 비교
        // String s1 = "Java";
        // String s2 = "Java";
        // System.out.println(s1 == s2);

        // String s1 = new String("Java");
        // String s2 = new String("Java");
        // System.out.println(s1 == s2);  
        
        // 이런식으로 비교하면 안뎀 문자열 비교는 항상 equals를 사용한다.

        // String s1 = "Java";
        // String s2 = "Java";

        String s1 = new String("Java");
        String s2 = new String("Java");
       System.out.println(s1.equals(s2));

        // 문자열 값 비교는 무조건 equals()를 쓰는 습관을 들이면 돼. // Java → equals() / JavaScript → === 👍
        // == → 주소 비교
        // equals() → 내용 비교
    }
}

/*
    int 정수 4 바이트
    long 정수 8 바이트
    float 실수 4 바이트 6~7자리
    double 실수 8 바이트 15자리 정도
    boolean 참/거짓 1 바이트
    char 2 문자 바이트
*/



