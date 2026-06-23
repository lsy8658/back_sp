package JavaMemo;

public class EX01StringMethod {
    public static void main (String[] args) {
        String s = "I Like Java";
        String s1 = "!!!";
        // System.out.println(s.length());  // 문자열 길이
        // System.out.println(s.toUpperCase()); // 문자열 대문자로 변환
        // System.out.println(s.toLowerCase()); // 문자열 소문자로 변환
        // System.out.println(s.contains("i")); // 해당 문자열을 포함하고 있는지
        // System.out.println(s.indexOf("v")); // 해당 문자가 몇번째에 있는지

        // System.out.println(s.startsWith("I")); // 시작 문자가 이 문자열이 맞는지?
        // System.out.println(s.endsWith("a")); // 마지막 문자가 이 문자열로 끝나는지?
        // System.out.println(s.replace("L", "l")); // 왼쪽 문자열을 오른쪽 문자열로 변환
        // System.out.println(s.substring(5)); // 문자열 자르기
        // System.out.println(s.concat(s1)); // 문자열 결합
        // System.out.println(s.trim()); // 앞뒤 공백 제거

        // System.out.println(s1.equals(s2)); // 문자열 비교  왜 equals를 사용하냐 String은 참조형이라 주소값을 비교해서 == 이런식의 비교가 안맞음
        // primitive( 기본형 ) 인 char 는  == 이렇게 가능


        // System.out.println("1\n2");  // \n 줄바꿈
        //  System.out.println("1 \t 2"); // \t tab
        //  System.out.println("1 \\ 2"); // \ 표기
        // System.out.println("1 \" 2"); // " 표기
        // System.out.println("1 \' 2"); // '표기
    }
}
