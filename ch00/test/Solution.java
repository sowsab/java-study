package ch00.test;

public class Solution {
    public double solution(double num1, double num2) {
        double answer = num1 / num2 * 1000;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 50));
    }
}
