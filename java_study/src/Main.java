import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(10); // 0~9 중에서 가져옴
        // 5 ~ 9까지 출력하고 싶다면 다음과 같이 작성
        int rand2 = random.nextInt(5) + 5;
        System.out.println(rand2);
    }
}