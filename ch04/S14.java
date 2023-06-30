package ch04;

public class S14 {
    public static void main(String[] args) {
        // 이중 for문
        // repeat 없이
        // "*"

        // 2
        // *
        // **
        // ***
        // ****
        // *****

        // 3
        // *****
        //  ***
        //   *
        // 행이 3개
        // 열에 있는 공백이 0개 1개 2개
        // 열에 있는 별이 5개 3개 1개


        for (int i = 0; i < 6; i++) {
            // 상위 for문의 변수의 영향을 받을수 있다.
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        
        for (int i = 1; i < 6; i = i+2) {
            for (int j = 0; j < i/2; j++) {
                System.out.print(" ");
            }
            for (int j = 6; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 2; i < 10; i++) {
            
            for (int j = 1; j < 10; j++) {
                System.out.print(i);
                System.out.print(" X ");
                System.out.print(j);
                System.out.print(" = ");
                System.out.println(i * j);

            }
        }
    }
}
