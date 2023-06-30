package ch04;

public class S06 {
    public static void main(String[] args) {
        // 보통 while은 외부의 변수가 기준이 외부의 변수가 필요하다
        int i = 1;
        while(i <= 100000) {
            System.out.println(i);
            // 보통 기준이 되는 변수를 조작해야한다
            i++;
        }

    }
}
