package JavaMemo;


abstract class Exam {
    abstract int calculateArea();
}


class Exam_child extends Exam {
    @Override
    int calculateArea () {
        return 3;
    }
}


class Eaxm_child2 extends Exam {
    @Override
    int calculateArea () {
        return 2;   
    }
}
class EX05 {
    public static void main(String[] args) {
        
    }
}

/*
    abstract : 추상클래스
    아직 완성되지 않은 클래스

    실제 구현이 없는 미완성 설계도

    // 1. 미완성 부모 클래스 (추상 클래스)
    abstract class Animal {
        abstract void cry(); // 몸통 { } 이 없는 추상 메서드
    }

    // 2. 부모를 확장(extends)한 자식 클래스
    class Cat extends Animal {
        // 부모의 미완성 메서드를 반드시 재정의(@Override)해야 함!
        @Override
        void cry() {
            System.out.println("야옹"); 
        }
    }

    abstract가 안 붙은 일반 메서드는 이미 부모가 완벽하게 만들어 둔(구현해 둔) 기능입니다.
*/