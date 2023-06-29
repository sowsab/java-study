package ch00;
public class Study02 {
    // 한 프로그램 내에 여러 main 함수가 있을 수 없다
    public static void main(String[] args) {
        // 변수
        // 데이터를 자바 프로그램이 실행되는 동안 유지할 때까지 사용

        // 기본형 타입 변수 (예약어 첫글자가 소문자인 타입)

        // 정수형 데이터를 저장할 때 int를 사용한다.
        // 소수가 없는 숫자
        // -1 -2 0 1 2 100 2000
        // +-21억 정도 까지 저장된다.
        int num = 1;
        // 정수형 데이터 int보다 큰 숫자를 저장할 때 사용
        // L를 붙여도 되고 안붙여도 된다..
        long longNum = 2;

        // 실수형 데이터 (무조껀 f를 붙여야 한다.)
        float floatNum = 1.2f;
        // 실수형 데이터 더 큰것
        double doubleNum = 1.2;

        // 논리형 데이터
        boolean bool = true; // 또는 false

        // 문자 데이터 (charactor의 줄임말 char)
        // 홑 따옴표로 감싼다
        char ch = 'a';

        // 참조형 타입 변수 (예약어 첫 글자가 대문자인 타입)

        // 문자열 데이터
        // 쌍 또옴표로 감싼다
        String str = "hello world";
    }
}
