package ch08;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        
        // 스캐너 -> 마지막에 꼭 close()를 해줘야 함

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        scanner.close();

        System.out.println(num);

    }
}
