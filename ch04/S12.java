package ch04;

public class S12 {
    // 1
    // *****
    // *****
    // *****
    // *****
    // *****

    // 2
    // *
    // **
    // ***
    // ****
    // *****

    // 3
    // *****
    // ****
    // ***
    // **
    // *

    // 4
    // *****
    //  ***
    //   *

    // 5
    // *****
    // *   *
    // *   *
    // *****

    // for, while, if문을 이용해서 별찍기
    // for, while문을 이용해서 별찍기
    // "*****" X "*" O
    public static void main(String[] args) {
        System.out.println("*".repeat(5));

        System.out.println(" ");

        for (int i = 0; i < 5; i++) {
            System.out.println("*".repeat(5));
        }

        System.out.println(" ");

        for (int i = 0; i < 5; i++) {
            if (i < 1) {
                System.out.println("*");
            } else if (i < 2) {
                System.out.println("*".repeat(2));
            } else if (i < 3) {
                System.out.println("*".repeat(3));
            } else if (i < 4) {
                System.out.println("*".repeat(4));
            } else if (i < 5) {
                System.out.println("*".repeat(5));
            }
        }

        System.out.println(" ");

        for (int i = 5; i >= 0; i--) {
            if (i < 1) {
                System.out.println("*");
            } else if (i < 2) {
                System.out.println("*".repeat(2));
                ;
            } else if (i < 3) {
                System.out.println("*".repeat(3));
            } else if (i < 4) {
                System.out.println("*".repeat(4));
            } else if (i < 5) {
                System.out.println("*".repeat(5));
            }
        }

        System.out.println(" ");

        for (int i = 0; i < 5; i = i + 2) {
            if (i < 1) {
                System.out.println("*".repeat(5));
            } else if (i < 2) {
                System.out.println("*".repeat(2));
            } else if (i < 3) {
                System.out.print(" ");
                System.out.println("*".repeat(3));
            } else if (i < 4) {
                System.out.println("*".repeat(4));
            } else if (i < 5) {
                System.out.print("  ");
                System.out.println("*");
            }
        }

        System.out.println(" ");

        for (int i = 0; i < 5; i++) {
            if (i < 1) {
                System.out.println("*".repeat(5));
            } else if (i < 2) {
                System.out.print("*");
                System.out.print(" ".repeat(3));
                System.out.println("*");
            } else if (i < 3) {
                System.out.print("*");
                System.out.print(" ".repeat(3));
                System.out.println("*");
            } else if (i < 4) {
                System.out.print("*");
                System.out.print(" ".repeat(3));
                System.out.println("*");
            } else if (i < 5) {
                System.out.print("*".repeat(5));
            }
        }

    }
}
