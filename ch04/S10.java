package ch04;

public class S10 {
    public static void main(String[] args) {
        // 2에서 100까지 짝수만 더해주세요

        int result = 0;

        for (int i = 0; i < 101; i = i+2) {
            result = result + i;
        }
        System.out.println(result);
    }
}
