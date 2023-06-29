package ch02;

public class S01 {

    public static void main(String[] args) {
        System.out.println(65);    
        // 형변환
        // 리터럴 앞에 소괄호를 적고
        // 소괄호 안에 타입을 적는다
        // 명시적 형변환
        System.out.println((char) 65);    
        // 범위가 적은 타입에서 큰 타입으로 벼환 할 때는
        // 보통 문제가 없다
        System.out.println((double) 65);    
        // 범위가 큰 타입에서 작은 데이터로 변환할때는
        // 데이터 소실이 일어날 수 있다.
        System.out.println((int) 65.1);    
        // 다른 타입을 계산 하게 되면
        // 범위가 큰 타입으로 자동으로 형변환(캐스팅) 된다
        // 묵시적 형변환
        System.out.println(3.0 / 2);
        System.out.println(3.0 / (double) 2);
        System.out.println(3 / 2.0);

    }
}
