/*
    String s = "like Java";

    length : 길이 => 11
    toUpperCase : 대문자로 => I LIKE JAVA
    toLowerCase : 소문자로 => i like java
    contains : 포함 여부 => s.contains("Java") => true
    indexOf : 위치 정보 => s.indexOf("Java") => 7
    lastIndexOf : 마지막 위치 정보 => s.lastIndexOf("a") => 10

    static 은 클래스 변수 나머지 static이 안붙은 class안의 변수들은 인스턴스 변수라고 한다.
*/

class NumberCl {
    static int num = 0;    
    public static void main (String[] args) {
        NumberCl.num = 10;

        // System.out.println(NumberCl.num);
    }
}

class Person {
    int age;
    Person (int age) {
        this.age = age;
    }
}

class Student extends Person {
    String name;

    Student(int age, String name) {
        super(age);
        this.name = name;
    }
}


