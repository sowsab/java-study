package ch00.test;

public class Solution {
    public static int solution(int n, int k) {
        int answer = 0;
        answer = (n*12000)+(k*2000)-(n/10*2000);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution(10,3));
    }

    
}
