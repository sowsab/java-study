package ch04;

public class S08Quiz {
    public static void main(String[] args) {
        // 1000 ~ 1사이 숫자 중에서
        // 5의 배수만 제외하고 출력하시오
        // 101 미만이 되면 작동을 멈추시오

        int i = 1001;

        while (i >= 1) {
            i--;
            if (i % 5 == 0) {
                continue;
            }
            if (i < 101) {
                break;
            }
            System.out.println(i);
        }
        

    }
}
