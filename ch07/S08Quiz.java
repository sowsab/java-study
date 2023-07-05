package ch07;

// 인터페이스 / 추상클래스/ 클래스를 이용해서
// 스마트폰

interface 통화 {
    void call();
}

interface 문자 {
    void massage();
    
}

interface 빅스비 {
    public default void vixvy() {
        System.out.println("하이 빅스비");
    }
}

interface 시리 {
    public default void siri() {
        System.out.println("시리");
    }
}

abstract class 스마트폰 implements 통화, 문자 {
    
}

abstract class 갤럭시 extends 스마트폰 implements 빅스비 {
    
}

abstract class 아이폰 extends 스마트폰 implements 시리 {
    
}

class S23 extends 갤럭시 {

    @Override
    public void call() {
        System.out.println("갤럭시 전화");
    }

    @Override
    public void massage() {
        System.out.println("갤럭시 문자");
    }

}

class Iphone14 extends 아이폰 {

    @Override
    public void call() {
        System.out.println("아이폰 전화");
    }

    @Override
    public void massage() {
        System.out.println("아이폰 문자");
    }

}

// 갤럭시 / 아이폰
// 갤럭시 - 통화 / 문자 / 빅스비
// 아이폰 - 통화 / 문자 / 시리
// 갤럭시 - S23
// 아이폰 - IPhone14

public class S08Quiz {
    
    public static void main(String[] args) {
        Iphone14 iphone14 = new Iphone14();
        S23 s23 = new S23();
        iphone14.call();
        s23.call();
    }

}
