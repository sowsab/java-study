package ch04;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        
        // 점수를 입력 받아서
        // 90점 이상이면 A
        // 80점 이상이면 B
        // 70점 이상이면 C
        // 60점 이상이면 D
        // 60점 이상이면 F
        Scanner scanner = new Scanner(System.in);

        int nextInt = scanner.nextInt();

        // if(nextInt < 10) {
        //     System.out.println("숫자가 10보다 작습니다.");
        // } else if(nextInt < 20) {
        //     System.out.println("숫자가 9보다 크고 20보다 작습니다");
        // } else if(nextInt < 30) {
        //     System.out.println("숫자가 19보다 크고 30보다 작습니다");
        // } else {
        //     System.out.println("숫자가 29보다 큽니다");
        // }

        // if(nextInt < 0) {
        //     System.out.println("잘못 입력 하셨습니다");
        //     scanner.close();
        //     return;
        // }

        switch(-nextInt / ++nextInt) {
            case -1:
            System.out.println("잘못 입력하셨습니다.");
            scanner.close();
            return;
        }

        switch(nextInt / 10) {
            case 0:
                System.out.println("숫자가 10보다 작습니다.");
                break;
            case 1:
                System.out.println("숫자가 9보다 크고 20보다 작습니다");
                break;
            case 2:
                System.out.println("숫자가 19보다 크고 30보다 작습니다");
                break;
            default:
                System.out.println("숫자가 29보다 큽니다");
        }

        scanner.close();

    }
}
