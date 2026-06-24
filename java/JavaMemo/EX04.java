package JavaMemo;

// 열거형
enum Gender {
    MALE,
    FEMALE
}

class Person1 {
    Gender gender;
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void getGender () {
        System.out.println(gender);
    }
}

class EX04 {
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.setGender(Gender.MALE);
        
        switch (person.gender) {
            case MALE: System.out.println("MALE");
                break;
            case FEMALE : System.out.println("FEMALE");
                break;
            default: System.out.println("no gender");
                break;
        }
    }
}

/*
    MALE은 사실 문자열 아님.

    Gender.MALE 을 줄여 쓴 거야.

    switch(person.gender)에서 이미

    Gender 타입인 걸 알고 있어서 Java가 자동으로 Gender.를 붙여서 해석함.

    즉 문자열 "MALE"이 아니라 enum 상수

    자바에서 enum은 “미리 정해진 값들의 집합”을 만드는 타입이야.
    예: Gender { MALE, FEMALE }처럼 선택지를 고정함.

    즉, 값이 제한된 경우(요일, 상태, 등급)에 쓰는 특별한 클래스 느낌.
    switch문이랑 같이 쓰기 좋아서 실무에서도 자주 씀.
*/